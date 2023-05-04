package Exceptions;

import java.util.Scanner;

public class Circle {
    double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double areaOfCircle(double radius){
        double result=0;
        try {
            result =  (Math.PI * Math.pow(radius, 2));
        }catch (ArithmeticException arithmeticException){
            System.out.println("Enter value greater than zero");
        }

        return result;
    }
public static  double perimeterOfCircle(double radius) {
        if (radius !=0){
            return (2 * Math.PI* radius);
        }else {throw new IllegalArgumentException("Enter value other than zero");}
}
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        System.out.println("Enter radius:");
        double num1 = value.nextInt();

        System.out.print("Area is: ");
        System.out.printf("%.2f%n",areaOfCircle(num1));

        System.out.print("Perimeter is: ");
        System.out.printf("%.2f",perimeterOfCircle(num1));
    }


}
