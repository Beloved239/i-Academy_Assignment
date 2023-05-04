package AbstractionShapeExercise;

public class Sphere extends Shape implements ThreeDArea_Volume{
    double radius;


    public Sphere(String nameOfObject, double radius) {
        super(nameOfObject);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double get3DArea() {
        return 4* Math.PI* Math.pow(getRadius(),2);
    }

    @Override
    public double getGet3DVolume() {
        return (4* Math.PI * Math.pow(getRadius(),3))/3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + getRadius() +
                " Area=" + get3DArea() +
                " Volume=" + getGet3DVolume() +
                '}';
    }
}


