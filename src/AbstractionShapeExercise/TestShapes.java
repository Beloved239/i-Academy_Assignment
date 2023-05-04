package AbstractionShapeExercise;

import java.util.Arrays;

public class TestShapes {
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Square("Square",12,13);
        shape[1] = new Rectangle("Rectangle",10,13);
        shape[2] = new Cone("Cone",12,13,14);
        shape[3] = new Sphere("Sphere",12);

        for (Shape shape1: shape){
            System.out.println(shape1);

            if (shape1 instanceof TwoDimension twoDimension){
                System.out.printf(" %.2f\n",twoDimension.getArea());

            }else {
                ThreeDArea_Volume threeDAreaVolume = (ThreeDArea_Volume) shape1;
                System.out.printf("Area =%.2f\n",threeDAreaVolume.get3DArea());
                System.out.printf("Volume = %.2f\n",threeDAreaVolume.getGet3DVolume());
            }
        }

    }
}
