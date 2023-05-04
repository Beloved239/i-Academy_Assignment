package AbstractionShapeExercise;

public class Cone extends Shape implements ThreeDArea_Volume{
    private double radius;
    private double height;
    private double length;

    public Cone(String nameOfObject, double radius, double height, double length) {
        super(nameOfObject);
        this.radius = radius;
        this.height = height;
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double get3DArea() {
        return (Math.PI*  Math.pow(getRadius(),2)+(Math.PI*getRadius()*getLength()));
    }

    @Override
    public double getGet3DVolume() {
        return (Math.PI* Math.pow(getRadius(),2)*getHeight())/3;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + getRadius() +
                ", height=" + getHeight() +
                ", length=" + getLength() +
                ", Area=" + get3DArea() +
                ", Volume=" + getGet3DVolume() +
                '}';
    }
}
