package PracticeQuestion_April_11;

import java.util.Scanner;

public class ReversingDigit {
    public static void main(String[] args) {
        int digit;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the digit to be reversed");

        digit = input.nextInt();
        isReversing(digit);


    }

    public static void isReversing(int digit){
//        int digit;
        String newDigit = Integer.toString(digit);


        for (int i=newDigit.length()-1; i>=0; i--){
            char digitValue = newDigit.charAt(i);
            System.out.print(digitValue+ "");
        }

    }
}
