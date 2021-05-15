package domain.pathfinding;

import domain.maze.Maze;
import domain.maze.Position;

public interface Pathfinder {
    public Path findPath(Maze maze, Position start, Position end);
}
