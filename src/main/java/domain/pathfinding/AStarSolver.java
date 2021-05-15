package domain.pathfinding;

import domain.maze.Cell;
import domain.maze.Maze;
import domain.maze.Position;
import domain.maze.Walls;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AStarSolver {
    private Maze maze;
    private Position start;
    private Position end;

    private Position current;
    private Map<Cell, CellScore> cellScores;

    public AStarSolver(Maze maze, Position start, Position end) {
        this.maze = maze;
        this.start = start;
        this.end = end;

        this.current = start;
        this.cellScores = new HashMap<>();
    }

    public Path solve(){
        setStartCellScore();
        while(!current.equals(end)){
            calculateNeighbors();
            calculateNextPosition();
        }

        System.out.println(cellScores);
        return null;
    }

    private void setStartCellScore(){
        Cell startCell = maze.getCellByPosition(start);
        CellScore startCellScore = getCellScore(startCell);
        startCellScore.setVisited(true);
        cellScores.put(startCell, startCellScore);
    }

    private CellScore getCellScore(Cell cell){
        Position cellPosition = cell.getPosition();
        return new CellScore(
                getDistanceFromEnd(cellPosition),
                getCurrentCost(cellPosition)
        );
    }

    private int getDistanceFromEnd(Position position){
        return (int) Math.round(pythagoras(end.getX() - position.getX(), end.getY() - position.getY()) * 10 );
    }

    private int getCurrentCost(Position position){
        int distanceFromCurrent = (int) Math.round(pythagoras(current.getX() - position.getX(), current.getY() - position.getY()) * 10 );
        int currentCost = cellScores.getOrDefault(maze.getCellByPosition(current), new CellScore(0, 0)).getGCost();
        return currentCost + distanceFromCurrent;
    }

    private void calculateNeighbors(){
        Cell cell = maze.getCellByPosition(current);

        if(!cell.getWalls().contains(Walls.NORTH)){
            calculateNextCell(new Position(current.getX(), current.getY() - 1));
        }
        if(!cell.getWalls().contains(Walls.EAST)){
            calculateNextCell(new Position(current.getX() + 1, current.getY()));
        }
        if(!cell.getWalls().contains(Walls.SOUTH)){
            calculateNextCell(new Position(current.getX(), current.getY() + 1));
        }
        if(!cell.getWalls().contains(Walls.WEST)){
            calculateNextCell(new Position(current.getX() - 1, current.getY()));
        }
    }

    public void calculateNextCell(Position next){
        CellScore cellScore = getCellScore(maze.getCellByPosition(next));
        cellScores.put(maze.getCellByPosition(next), cellScore);
    }

    private void calculateNextPosition() {
        List<Map.Entry<Cell, CellScore>> entries = cellScores.entrySet().stream()
                .filter(entry -> !entry.getValue().isVisited())
                .collect(Collectors.toList());

        Map.Entry<Cell, CellScore> min = entries.get(0);
        for(Map.Entry<Cell, CellScore> entry : entries){
            if(min.getValue().getFCost() > entry.getValue().getFCost()){
                min = entry;
            }
        }

        current = min.getKey().getPosition();
        min.getValue().setVisited(true);

    }

    private double pythagoras(int a, int b){
        return Math.sqrt((a * a) + (b * b));
    }
}
