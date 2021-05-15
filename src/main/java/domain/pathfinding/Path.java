package domain.pathfinding;

import domain.maze.Position;

import java.util.LinkedList;
import java.util.List;

public class Path {
    private List<Position> path;

    public Path() {
        this.path = new LinkedList<>();
    }

    public void addToStart(Position position){
        path.add(0, position);
    }

    public boolean contains(Position position){
        return path.contains(position);
    }

    @Override
    public String toString() {
        return path.toString();
    }
}
