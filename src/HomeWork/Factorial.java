package HomeWork;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /**
         * Step 1: Accept data from users
         * Step 2: initialize factorial variable
         * Step 3: loop i through number of times of n
         * Step 4: display the result of the factorial
         *
         * e.g 5*4*3*2*1
         */
        int num, totalFactorial=1, factorial=1, i;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer number between 1 and 100");
        num= input.nextInt();
        if (num<=100){
            for (i=2; i<=num; i++){
                totalFactorial= factorial *=i;
            }
            System.out.println(totalFactorial);

        }


    }
}
