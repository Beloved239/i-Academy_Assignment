package PracticeQuestion_April_11;

import java.util.Scanner;

public class MinimumMethod {
    public static void main(String[] args) {

        System.out.println(isSmallest(collectFirstNum(),collectSecondNum(),collectThirdNum()));

    }
    public static float collectFirstNum(){
        float firstNum;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first float number");
        firstNum = input.nextFloat();

        return firstNum;
    }

    public static float collectSecondNum(){
        float secondNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first float number");
        secondNum = input.nextFloat();

        return secondNum;
    }

    public static float collectThirdNum(){
        float thirdNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first float number");
        thirdNum = input.nextFloat();

        return thirdNum;
    }

    public static float isSmallest(float firstNum, float secondNum, float thirdNum){
        float smallest=firstNum;
       if (secondNum < smallest){
           smallest = secondNum;
       } else if (thirdNum < smallest) {
           smallest = thirdNum;

       }

        return smallest;
    }
}
