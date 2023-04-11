package PracticeQuestion_April_11;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your radius in meter");
        int radius = input.nextInt();

        AreaOfCircle main = new AreaOfCircle();
        System.out.printf("Area of the Circle is %.2f",main.circleArea(radius));

    }

    public double circleArea(int radius){
        return (Math.PI * Math.pow(radius,2));
        /**
         * To round off to the nearest Whole Number use Math.floor
         */

    }
}
