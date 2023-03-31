package Assignment;

import java.util.Scanner;

public class bmi_Calculator {
    public static void main(String [] args){
        /*
        This Program calculates Body Mass Index from the weight and height received
         */
        double weight, bmi, height;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight(kilograms):");
        weight=input.nextDouble();

        System.out.println("Enter your height(meters):");
        height=input.nextDouble();

        bmi = weight /(height * height);

        System.out.println(bmi);

        System.out.println(" ");

        if (bmi<18.5){
            System.out.println("Underweight");
        }

        if (bmi>18.4 && bmi<24.9){
            System.out.println("Normal Weight");
        }

        if (bmi>24.9 && bmi<30){
            System.out.println("Overweight");
        }

        if (bmi>29.9) {
            System.out.println("Obesity");

        }

        System.out.println(" ");


        System.out.println("Underweight: <18.5");
        System.out.println("Normal Weight: 18.5-24.9");
        System.out.println("Overweight: 25-29.9");
        System.out.println("Obesity: BMI of 30 or greater");


    }

}
