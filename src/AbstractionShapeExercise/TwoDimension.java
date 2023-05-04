package AbstractionShapeExercise;

public  class TwoDimension extends Shape {
    private double length;
    private double breadth;

    public TwoDimension(String nameOfObject, double length, double breadth) {
        super(nameOfObject);
        if (length< 0){
            throw new IllegalArgumentException("Length can not be negative");
        }
        this.length = length;
        if (breadth< 0){
            throw new IllegalArgumentException("Breadth can not be negative");
        }
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length< 0){
            throw new IllegalArgumentException("Length can not be negative");
        }
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        if (breadth< 0){
            throw new IllegalArgumentException("Breadth can not be negative");
        }
        this.breadth = breadth;
    }

    public  double getArea() {
        return getLength() * getBreadth();
    }

    @Override
    public String toString() {
        return "TwoDimension{" +
                "length=" + getLength() +
                ", breadth=" + getBreadth() +
                ", Area=" + getArea()+
                '}';
    }
}
