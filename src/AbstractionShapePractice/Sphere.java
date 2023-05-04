package AbstractionShapePractice;

public class Sphere extends ThreeDimensions {
    private double radius;

    public Sphere(double radius) {
        this.radius = Math.abs(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4* Math.PI * Math.pow(getRadius(),3))/3;
    }

    @Override
    public double getArea() {
        return 4* Math.PI* Math.pow(getRadius(),2);
    }



    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + getRadius() +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                '}';
    }
}
