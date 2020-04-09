package xz222bb_assign3;

public class Point {
    private int x, y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public boolean isEqualTo(Point p2) {
        return this.x == p2.x && this.y == p2.y;
    }

    public double distanceTo(Point p2) {
        return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow(this.y - p2.y, 2));
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void moveToXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

