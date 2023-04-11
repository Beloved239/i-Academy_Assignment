package Assessment;

import java.util.Scanner;

public class ReversingDigits {
    public static void main(String[] args) {
        int digit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Integer");
        digit = input.nextInt();

        System.out.println(isReversing(digit));



//        System.out.println(isReversing(1234));

    }

    public static String isReversing(int digit){
//        digit = 1234;
        String digitValues="";
        String newDigit = Integer.toString(digit);
        for (int i = newDigit.length()-1; i >= 0; i--){
            char digitValue = newDigit.charAt(i);
            System.out.print(digitValue+"");
        }
        return digitValues;
    }
}
