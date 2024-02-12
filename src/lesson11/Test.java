package lesson11;

import static java.lang.System.*;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(3, 4);
        out.println("p1.x: " + p1.x + ", p1.y: " + p1.y);
        out.println("p2.x: " + p2.x + ", p2.y: " + p2.y);
        out.println(Point.getCount());
        Point.setCount(20);
        out.println(p1.getCount());
    }
}

class Point{
    private static int count;
    public int x;
    public int y;

    static {
        count = 10;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        Point.count++;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void setCount(int count) {
        Point.count = count;
    }

    public static int getCount() {
        return count;
    }
}
