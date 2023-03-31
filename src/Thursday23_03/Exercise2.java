package Thursday23_03;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //this program accepts data and return if its a multiple of 3

        int numb;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number ");

        numb = scanner.nextInt();

        if (numb%3==0){
            System.out.println("The Number is a multiple of 3");
        } else {
            System.out.println("The Number is not a multiple of 3");
        }

    }
}
