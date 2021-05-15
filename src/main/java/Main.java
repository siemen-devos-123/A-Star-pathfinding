import domain.maze.Maze;
import domain.maze.MazeFactory;
import domain.maze.Position;
import domain.pathfinding.AStar;
import domain.pathfinding.Solver;

public class Main {
    public static void main(String[] args) {
        new Main().run();
        new Main().run2();
    }

    private void run(){
        Maze maze = new MazeFactory().create();
        System.out.println(maze);

        Solver solver = new Solver(new AStar());
        Object solution = solver.solve(maze, new Position(0, 0), new Position(1, 1));
        System.out.println(solution);
    }

    private void run2(){
        Maze maze = new MazeFactory().create2();
        System.out.println(maze);

        Solver solver = new Solver(new AStar());
        Object solution = solver.solve(maze, new Position(0, 0), new Position(2, 2));
        System.out.println(solution);
    }
}
