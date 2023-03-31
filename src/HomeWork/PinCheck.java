package HomeWork;

import java.util.Scanner;

public class PinCheck {
    public static void main(String[] args) {
        /**
         * Set initial pin
         * Set Attempt to 3 trials
         * loop through while attempts less than or equals 3
         */
        int pin= 1234;
        int enteredPin, i=0;
        Scanner input = new Scanner(System.in);

        while (i<=4) {
            System.out.println("Enter your pin ");
            enteredPin = input.nextInt();



            if (enteredPin == pin) {
                System.out.println("Correct, Welcome Back!");
                break;
            } else {
                System.out.println("Try again");
                i++;

            }

            if (i==3){
                System.out.println("Sorry, but we've locked you out");
                break;
            }
        }


    }
}
