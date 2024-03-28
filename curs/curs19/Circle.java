package curs.curs19;

public class Circle {
    private double radius = 1.00;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getArea(){
        double area=3.14*radius*radius;
        return area;
    }

    public double getRadius() {
        return radius;
    }

    double gerCircumference(){
        double circumference=2*3.14*radius;
        return circumference;
    }
}
