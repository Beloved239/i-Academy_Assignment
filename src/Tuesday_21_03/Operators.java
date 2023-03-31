package Tuesday_21_03;

import java.util.Scanner;

public class Operators {
    public static void main (String [] Args){
        //This program accepts three Integers from the User and
        //perform Sum, Average, Product, Minimum and Maximum Operations
        int firstNum;
        int secondNum;
        int thirdNum;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your first Number:");
        firstNum= input.nextInt();

        System.out.println("Enter Your second Number:");
        secondNum= input.nextInt();

        System.out.println("Enter Your third" +
                " Number:");
        thirdNum= input.nextInt();
        /*
        Operations
         */
        int sum= firstNum + secondNum + thirdNum;

        int average =(firstNum + secondNum + thirdNum)/3;

        int product = firstNum * secondNum * thirdNum;

        int smallest= firstNum;
        int largest= firstNum;


//        System.out.println("The Sum is: " + sum);
//        System.out.println("The Average is: " + average);
//        System.out.println("The product is: " + product);

        if (secondNum>largest){
            largest=secondNum;
        }
        if (thirdNum>largest){
            largest=thirdNum;
        }
        if (secondNum < smallest){
            smallest = secondNum;
        }
        if (thirdNum < smallest){
            smallest = thirdNum;
        }
        System.out.println(sum);
    }
}
