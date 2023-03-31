package HomeWork;

import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        int num, sum=0;
        /**
         * This program will accept 5 numbers from user and
         * return their sum
         */

        Scanner input = new Scanner(System.in);
        /**
         * Method 1 Using Control Structures
         */

        for (int i=1; i<=5; i++){
            System.out.println("Enter 5 integers "+ i);
            num = input.nextInt();

            sum += num;
        }

        System.out.println(sum);

//        Method 2 Using Control Structures
//        System.out.println("Enter integer " + i );
//            firstNum = input.nextInt();
//
//            System.out.println("Enter integer " + i );
//            secondNum = input.nextInt();
//
//            System.out.println("Enter integer " + i );
//            thirdNum = input.nextInt();
//
//            System.out.println("Enter integer " + i );
//            fourtNum = input.nextInt();
//
//            System.out.println("Enter integer " + i );
//            fifthNum = input.nextInt();
//
//            sum = firstNum+secondNum+thirdNum+fourtNum+fifthNum;
//
//        System.out.println("Sum is " +  sum);

    }
}
