package domain.maze;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MazeFactory {
    public Maze create(){
        /*
            ######
            #o   #
            #### #
               #x#
               ###
         */

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
        cells.add(new Cell(new Position(1, 0), walls2));
        cells.add(new Cell(new Position(0, 1), walls3));
        cells.add(new Cell(new Position(1, 1), walls4));

        return new Maze(cells);
    }

    public Maze create2(){
        /*
            #########
            #o      #
            ####### #
            #       #
            # #######
            #      x#
            #########
         */

        List<Cell> cells = new LinkedList<>();

        Set<Walls> walls1 = new HashSet<>();
        walls1.add(Walls.NORTH);
        walls1.add(Walls.SOUTH);
        walls1.add(Walls.WEST);
        Set<Walls> walls2 = new HashSet<>();
        walls2.add(Walls.NORTH);
        walls2.add(Walls.SOUTH);
        Set<Walls> walls3 = new HashSet<>();
        walls3.add(Walls.NORTH);
        walls3.add(Walls.EAST);
        Set<Walls> walls4 = new HashSet<>();
        walls4.add(Walls.NORTH);
        walls4.add(Walls.WEST);
        Set<Walls> walls5 = new HashSet<>();
        walls5.add(Walls.NORTH);
        walls5.add(Walls.SOUTH);
        Set<Walls> walls6 = new HashSet<>();
        walls6.add(Walls.EAST);
        walls6.add(Walls.SOUTH);
        Set<Walls> walls7 = new HashSet<>();
        walls7.add(Walls.WEST);
        walls7.add(Walls.SOUTH);
        Set<Walls> walls8 = new HashSet<>();
        walls8.add(Walls.NORTH);
        walls8.add(Walls.SOUTH);
        Set<Walls> walls9 = new HashSet<>();
        walls9.add(Walls.NORTH);
        walls9.add(Walls.EAST);
        walls9.add(Walls.SOUTH);

        cells.add(new Cell(new Position(0, 0), walls1));
        cells.add(new Cell(new Position(1, 0), walls2));
        cells.add(new Cell(new Position(2, 0), walls3));
        cells.add(new Cell(new Position(0, 1), walls4));
        cells.add(new Cell(new Position(1, 1), walls5));
        cells.add(new Cell(new Position(2, 1), walls6));
        cells.add(new Cell(new Position(0, 2), walls7));
        cells.add(new Cell(new Position(1, 2), walls8));
        cells.add(new Cell(new Position(2, 2), walls9));

        return new Maze(cells);
    }
}
