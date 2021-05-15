package domain.pathfinding;

import domain.maze.Maze;
import domain.maze.Position;

public class Solver {
    private Pathfinder algorithm;

    public Solver(Pathfinder algorithm) {
        this.algorithm = algorithm;
    }

    public void solve(Maze maze, Position start, Position end){
        algorithm.findPath(maze, start, end);
    }
}
