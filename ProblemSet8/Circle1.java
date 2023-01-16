package ProblemSet8;

public class Circle1 extends Shape {
    protected double radius;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "Shape[color=" + color +
                ",filled=" + filled +
                "],radius=" + radius +
                ']';
    }
}