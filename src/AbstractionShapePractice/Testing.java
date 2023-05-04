package AbstractionShapePractice;

public class Testing {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(12,13);
        shapes[1] = new Square(11,9);
        shapes[2] = new Rectangle(12,12);
        shapes[3] = new Cone(7,6,5);
        shapes[4] = new Sphere(6);

        for (Shape shape: shapes){
            System.out.println(shape);

            if (shape instanceof TwoDimensional twoDimensional){
                System.out.printf("Area = %.2f%n%n",twoDimensional.getArea());

            }else {ThreeDimensions threeDimensions =(ThreeDimensions) shape;
                System.out.printf("%.2f\n",threeDimensions.getArea());
                System.out.printf("%.2f\n",threeDimensions.getVolume());
                }
            }
        }

}
