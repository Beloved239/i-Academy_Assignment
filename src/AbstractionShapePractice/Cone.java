package AbstractionShapePractice;

public class Cone extends ThreeDimensions{

    private double length;
    private double height;
    private double radius;

    public Cone(double length, double height, double radius) {
        this.length = Math.abs(length);
        this.height = Math.abs(height);
        this.radius = Math.abs(radius);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI*  Math.pow(getRadius(),2)+(Math.PI*getRadius()*getLength()));
    }

    @Override
    public double getVolume() {
        return (Math.PI* Math.pow(getRadius(),2)*getHeight())/3;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "length=" + getLength() +
                ", height=" + getHeight() +
                ", radius=" + getRadius() +
                ", area=" + getArea() +
                ", volume=" + getVolume() +

                '}';
    }
}
