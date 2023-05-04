package AbstractionShapePractice;

public class Triangle extends TwoDimensional{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = Math.abs(base);
        this.height = Math.abs(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = Math.abs(getBase());
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {
        this.height = Math.abs(getHeight());
    }


    @Override
    public double getArea() {
        return 0.5*getBase()*getHeight();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + getBase() +
                ", height=" + getHeight() +
                ", area=" + getArea() +
                '}';
    }
}
