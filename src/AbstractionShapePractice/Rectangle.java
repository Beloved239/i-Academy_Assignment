package AbstractionShapePractice;

import AbstractionShapeExercise.TwoDimension;

public class Rectangle extends TwoDimensional {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = Math.abs(length);
        this.breadth = Math.abs(breadth);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = getLength();
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = getBreadth();
    }


    @Override
    public double getArea() {
        return getLength()*getBreadth();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + getLength() +
                ", breadth=" + getBreadth() +
                ", area=" + getArea() +

                '}';
    }
}
