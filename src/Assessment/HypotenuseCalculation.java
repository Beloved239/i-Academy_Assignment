package Assessment;

import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {

        /**
         * This Program accepts values from user and while using a method, prints out predefined supplied values and
         * the values collected from the user
         * This Program calculates the Hypotenuse of predetermined value of sides of the Triangle
         * it Uses Method of hypotenuse to calculate and return hypotenuse as type double
         */

        //Declaration of the variables for side 1 and side 2 and accepting inputs from the user
        double side1, side2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of Side 1 in meters");
        side1 = input.nextDouble();

        System.out.println("Enter Value of Side 2 in meters\n");
        side2 = input.nextDouble();

        System.out.println("Math.hypo method");
        System.out.printf("Hypotenuse of the Triangle is %.2f m",mathHypotenuse(side1,side2));

        System.out.println("\n");

        System.out.println("Math.sqrt method");
        System.out.printf("Hypotenuse of the Triangle is %.2f m",hypotenuse(side1,side2));

    }

    public static double hypotenuse(double side1,double side2){
            double hypotenuse;
        hypotenuse = Math.sqrt((Math.pow(side1,2))+Math.pow(side2,2));

     return hypotenuse;
    }

    public static double mathHypotenuse(double side1, double side2){

        return Math.hypot(side1, side2);

    }
}
