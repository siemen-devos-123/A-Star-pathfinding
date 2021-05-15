package domain.pathfinding;

public class CellScore implements Comparable<CellScore>{
    private int hCost;
    private int gCost;
    private boolean visited;

    public CellScore(int hCost, int gCost) {
        this.hCost = hCost; //distance to end
        this.gCost = gCost; //distance from start
    }

    public int getHCost() {
        return hCost;
    }

    public int getGCost() {
        return gCost;
    }

    public void setGCost(int gCost) {

        this.gCost = gCost;
    }

    public int getFCost(){
        return getHCost() + getGCost();
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return "CellScore{" +
                "visited=" + isVisited() +
                ", hCost=" + hCost +
                ", gCost=" + gCost +
                ", fCost=" + getFCost() +
                '}';
    }

    @Override
    public int compareTo(CellScore o) {
        return o.getFCost() - this.getFCost();
    }
}
