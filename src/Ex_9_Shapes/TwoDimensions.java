package Ex_9_Shapes;

public class TwoDimensions extends Shapes{
    private double length;
    private double width;

    public TwoDimensions(String nameOfObject, double length, double width) {
        super(nameOfObject);
        validateLength(length);
        this.length = length;
        validateWidth(width);
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        validateLength(length);
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        validateWidth(width);
        this.width = width;
    }

    public void validateLength(double length){
        if (length<0){
            throw new IllegalArgumentException("Length can not be negative");
        }
    }
    public void validateWidth(double width){
        if (width<0){
            throw new IllegalArgumentException("Length can not be negative");
        }
    }

    @Override
    public String toString() {
        return "TwoDimensions{" +
                "Name of Shape: "+ super.toString()+
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
