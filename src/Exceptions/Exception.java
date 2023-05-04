package Exceptions;

import java.util.Scanner;

public class Exception {
    public static double quotient(double numerator, double denominator)throws ArithmeticException{
        if (denominator !=0){
            return numerator/denominator;
        }else {throw new ArithmeticException("Your value can't be zero");}

    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("Enter first Integer");
        int num1 = value.nextInt();
        System.out.println("Enter Second Integer");
        int num2 = value.nextInt();
    try {
    System.out.println(quotient(num1,num2));
    }catch (ArithmeticException exception){
        System.out.println(exception.getMessage());
    }


    }


}
