package Thursday23_03;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0 ;
        int number, i;

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Five Numbers");
        for (i = 1; i < 6; i++) {
            System.out.println("Enter Number "+ i);
           number = input.nextInt();
           if (number > 0) {
               positiveNumber++;
           } else if (number < 0) {
               negativeNumber++;
           }else {
               zeroNumber++;
           }
        }
        System.out.println("Total Number of Positive Value(s) = " + positiveNumber);
        System.out.println("Total Number of Negative Value(s)  = " + negativeNumber);
        System.out.println("Total Number of Zero Value(s) = " + zeroNumber);
//        int numb1, numb2, numb3, numb4, numb5;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your First Number");
//        numb1 = scanner.nextInt();
//
//        System.out.println("Enter your Second Number");
//        numb2 = scanner.nextInt();
//
//        System.out.println("Enter your Third Number");
//        numb3 = scanner.nextInt();
//
//        System.out.println("Enter your Fourth Number");
//        numb4 = scanner.nextInt();
//
//        System.out.println("Enter your Fifth Number");
//        numb5 = scanner.nextInt();
//
//        if (numb1<0){
//            System.out.println(numb1);
//        }
//
//        if (numb1>0 && numb2>0 && numb3>0 && numb4>0 && numb5>0){
//            System.out.println("The number is negative")
//        }
//
    }
}
