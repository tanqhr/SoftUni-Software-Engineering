package Shapes_02;

public class Circle extends Shape{

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
        super.setArea(this.calculateArea());
        super.setPerimeter(this.calculatePerimeter());
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
