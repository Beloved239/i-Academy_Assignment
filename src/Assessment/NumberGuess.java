package Assessment;

import java.security.SecureRandom;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        guessNumber();

    }
    public static int guessNumber(){
        SecureRandom random= new SecureRandom();
        int correctNum = 1 + random.nextInt(1000);
        System.out.println(correctNum);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int guessNum = input.nextInt();

        while (guessNum != -2){
            if (guessNum == correctNum){
                System.out.println("Congratulations!!!");
                System.out.println("Play Again or Enter -2 to exit");
                correctNum = 1 + random.nextInt(1000);
                System.out.println(correctNum);
            } else if (guessNum < correctNum) {
                System.out.println("Number too Low Try Again!!");

            } else if (guessNum > correctNum) {
                System.out.println("Too High Try Again!!");
            }else {
                System.out.println("Number not in range ");
            }
            System.out.println("Enter an Integer");
            guessNum = input.nextInt();
        }return guessNum;
    }
}
