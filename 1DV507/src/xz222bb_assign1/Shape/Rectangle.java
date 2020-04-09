package xz222bb_assign1.Shape;

public class Rectangle extends Shape{
    private double base;
    private double height;

    public Rectangle(String shapeName, double base, double height) {
        super(shapeName);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * ( base + height);
    }
}
