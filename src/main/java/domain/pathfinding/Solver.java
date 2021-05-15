package domain.pathfinding;

import domain.maze.Maze;
import domain.maze.Position;

public class Solver {
    private Pathfinder algorithm;

    public Solver(Pathfinder algorithm) {
        this.algorithm = algorithm;
    }

    public Path solve(Maze maze, Position start, Position end){
        return algorithm.findPath(maze, start, end);
    }
}
