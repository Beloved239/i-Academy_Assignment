package Thursday23_03;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        //this program collects 3 numbers and display largest and smallest
        int num1, num2, num3, small, smallest, large, largest;
        String yourName;
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter your name name:");
//        yourName = scanner.nextLine();

        System.out.println("Enter your first number:");
        num1 = scanner.nextInt();

        System.out.println("Enter your second number:");
        num2 = scanner.nextInt();

        System.out.println("Enter your third number:");
        num3 = scanner.nextInt();
        smallest = num1;
        largest = num2;

        small = Math.min(num1, num2);
        smallest = Math.min(small, num3);

        large = Math.max(num1, num2);
        largest = Math.max(large, num3);

//        System.out.printf(yourName + "The smallest is: %s\nThe largest is%s\n", smallest, largest);


//        if (num1 < num2 && num2 < num3) {
//            return;
////            System.out.println(yourName + "" + "The greatest is:" + num3);
//        }
//
//        if (num1 > num2 && num2 > num3) {
//            System.out.println(yourName + "" + "The smallest is:" + num1);
//        }
        if (smallest < num2) {
            num2 = smallest;
//            System.out.println(num2);
        }
        if (smallest < num3) {
            num3 = smallest;

        }
        if (largest > num2) {
            num2 = largest;
//            System.out.println(num2);
        }

        if (largest > num3) {
            num3 = largest;


        }
        System.out.println("The smallest is: "+smallest);
        System.out.println("The Largest is: "+largest);
    }

    }


//
//        math
//    }


//}
