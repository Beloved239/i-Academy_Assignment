package Ex_9_Shapes;

public class ThreeDimensions extends TwoDimensions{
    private double height;

    public ThreeDimensions(String nameOfObject, double length, double width, double height) {
        super(nameOfObject, length, width);
        validateHeight(height);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        validateHeight(height);
        this.height = height;
    }

    public void validateHeight(double height){
        if (height<0){
            throw new IllegalArgumentException("Height can not be negative");
        }
    }

    @Override
    public String toString() {
        return "ThreeDimensions{" +
                "Name of Object is: "+super.toString()+
                "Length= " + getLength()+
                "Width=" + getWidth()+
                "Height=" + height +
                '}';
    }
}
