package AbstractionShapePractice;

public class Square extends TwoDimensional{
    private double length;
    public double breadth;

    public Square(double length, double breadth) {
        this.length = Math.abs(length);
        this.breadth = Math.abs(breadth);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = Math.abs(getLength());
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = Math.abs(breadth);
    }


    @Override
    public double getArea() {
        return getLength()*getBreadth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + getLength() +
                ", breadth=" + getBreadth() +
                ", Area=" + getArea() +
                '}';
    }
}
