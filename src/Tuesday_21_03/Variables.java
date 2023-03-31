package Tuesday_21_03;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args){
        /**
         * A program that adds two integers and return their sum
         */
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        firstNumber = input.nextInt();

        System.out.println("Enter your second number:");
        secondNumber = input.nextInt();

        System.out.println("Enter your second number:");
        thirdNumber = input.nextInt();

       int product= firstNumber * secondNumber * thirdNumber;


               System.out.println("The product is:"+ " " + product);

    }
}
