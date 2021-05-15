package domain.maze;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MazeFactory {
    public Maze create(){
        List<Cell> cells = new LinkedList<>();

        Set<Walls> walls1 = new HashSet<>();
        walls1.add(Walls.NORTH);
        walls1.add(Walls.SOUTH);
        walls1.add(Walls.WEST);
        Set<Walls> walls2 = new HashSet<>();
        walls2.add(Walls.NORTH);
        walls2.add(Walls.EAST);
        Set<Walls> walls3 = new HashSet<>();
        Set<Walls> walls4 = new HashSet<>();
        walls4.add(Walls.EAST);
        walls4.add(Walls.SOUTH);
        walls4.add(Walls.WEST);

        cells.add(new Cell(new Position(0, 0), walls1));
        cells.add(new Cell(new Position(0, 1), walls2));
        cells.add(new Cell(new Position(1, 0), walls3));
        cells.add(new Cell(new Position(1, 1), walls4));

        return new Maze(cells);
    }
}
