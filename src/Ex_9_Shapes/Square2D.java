package Ex_9_Shapes;

public class Square2D extends TwoDimensions{
    private double area;
    private double perimeter;

    public Square2D(String nameOfObject, double length, double width) {
        super(nameOfObject, length, width);
    }
    public double areaOfSquare(double length, double width){
        area = getLength() * getWidth();
    return area;
    }

    public double perimeterOfSquare(double length, double width){
        perimeter = 4 * getLength();
        return perimeter;
    }

    @Override
    public String toString() {
        return "Name of Object: Square{" +
                "Area of Square= " + area +
                ", Perimeter of Square= " + perimeter +
                '}';
    }
}
