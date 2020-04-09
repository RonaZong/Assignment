package xz222bb_assign3;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        if (p1.isEqualTo(p2))
            System.out.println("The two points are equal");

        double dist = p1.distanceTo(p2);
        System.out.println("Point distance: " + dist);

        p2.move(5, -2);
        p1.moveToXY(8, 2);

        if (p1.isEqualTo(p2))
            System.out.println("The two points are equal");
    }
}
