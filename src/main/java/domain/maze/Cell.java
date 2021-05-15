package domain.maze;

import java.util.Set;

public class Cell {
    private Position position;
    private Set<Walls> walls;

    public Cell(Position position, Set<Walls> walls) {
        this.position = position;
        this.walls = walls;
    }

    public Position getPosition() {
        return position;
    }

    public Set<Walls> getWalls() {
        return walls;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getPosition(), getWalls());
    }
}
