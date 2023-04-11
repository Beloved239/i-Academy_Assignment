package Assessment;

import java.util.Scanner;

//import static jdk.internal.icu.lang.UCharacter.digit;

public class SeparatingDigits {
    public static void main(String[] args) {

        int digit;
        char c = ' ';
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your digits between 1 and 99999");
        digit =input.nextInt();

        String numberString = Integer.toString(digit);

        if (digit>0 && digit<99999) {
            for (int i = 0; i < numberString.length(); i++) {
                char value = numberString.charAt(i);
                System.out.printf("%s  ", value);
            }
        }else {
            System.out.println("Enter Integer Value between 1 and 99999");
        }




//        System.out.println(integerQuotient(5,2));
//        System.out.println(remainderOFQuotient(5,2));

    }

    public static int integerQuotient(int a, int b){
        return a/b;

    }

    public static int remainderOFQuotient(int a, int b){
        return a%b;

    }

//    public static int displayDigits(int digit){
//
//        for (int i=0; i<digit; i++){
//            System.out.println();
//        }
//    }
}
