package domain.maze;

import java.util.LinkedList;
import java.util.List;

public class Maze {
    private List<Cell> cells;

    public Maze(List<Cell> cells){
        this.cells = cells;
    }

    public List<Cell> getCells() {
        return List.copyOf(cells);
    }

    public Cell getCellByPosition(Position position){
        Cell res = null;
        for(Cell cell : getCells()){
            if(cell.getPosition().equals(position)){
                res = cell;
            }
        }

        return res;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Cell cell : getCells()){
            res.append(String.format("%s%n", cell));
        }
        return res.toString();
    }
}
