package AbstractionShapeExercise;

public class Square extends TwoDimension{
    double length;
    double breadth;
    public Square(String nameOfObject, double length, double breadth) {
        super(nameOfObject, length, breadth);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", Area=" + getArea() +

                '}';
    }
}
