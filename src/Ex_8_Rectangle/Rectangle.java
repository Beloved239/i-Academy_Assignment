package Ex_8_Rectangle;

public class Rectangle {
    private double length=1;
    private double width=1;

    public Rectangle(double length, double width) {
        validateSides(length,width);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void validateSides(double length, double width){
        if ((length<0||length>20) || (width<0|| width>20)){
            throw new IllegalArgumentException("Enter values between 1 and 20");
        }
    }

    public double areaRectangle(double length, double width){
        return length * width;
    }
    public double perimeterRectangle(double length, double width){
        return (length + width);
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width= " + width +
                ", Area= " + areaRectangle(length,width)+
                ", Perimeter= " + perimeterRectangle(length,width)+
                '}';
    }
}
