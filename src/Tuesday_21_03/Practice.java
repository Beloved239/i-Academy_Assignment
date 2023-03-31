package Tuesday_21_03;

import java.util.Scanner;

public class Practice {
    public static void main (String [] args){

        /*
        This program will accept 3 inputs and return Average, Sum, Product, Smallest and Largest

        double num1, num2, num3, average, sum, product, smallest, largest;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        num1 = input.nextDouble();

        System.out.println("Enter your first number:");
        num2 = input.nextDouble();

        System.out.println("Enter your first number:");
        num3 = input.nextDouble();

        sum = num1 + num2 + num3;

        product = num1 * num2 * num3;

        average = sum/3;

        smallest = num1;

        largest = num2;

        if (num2 < smallest){
            smallest = num2;
        }

        if (num3 < smallest){
            smallest = num3;
        }

        if (num2 > largest){
            largest = num2;
        }

        if (num3 > largest){
            largest = num3;
        }
        System.out.println(sum);

        System.out.println(average);

        System.out.println(product);

        System.out.println(largest);

         */

//        int firstNumb;
//
//        Scanner inputs = new Scanner(System.in);
//        System.out.print("Enter an Integer"); firstNumb = inputs.nextInt();;
//
//        System.out.println(firstNumb+firstNumb);

//        int a, b, c;
//
//        Scanner inpt = new Scanner(System.in);
//        System.out.println("Enter integer 1");
//        a = inpt.nextInt();
//
//        System.out.println("Enter integer 2");
//        b = inpt.nextInt();
//
//        c = a * b;
//
//        System.out.println("The product of integer a and b is:" + c);

        // this program performs a sample payroll calculation

//        int x=2, y=3, a=3;
//
//        System.out.printf("x = %d%n", x);
//        System.out.println(" ");
//
//        System.out.printf("Value of %d + %d is %d%n", x, y, (x + y));
//
//        System.out.printf("x = %n");
//
//        System.out.printf("These numbers are equal: %d = %d%n", (x + y), (y + x));
//
//        System.out.println("The quadratic eqn is:" + a * (x*x*x)+7);
//
//        System.out.println(7+3*6/2-1);
//
//        System.out.println(2%2+2*2-2/2);
//
//        System.out.println("1 2 3 4");
//
//        System.out.print("1 2 3 4");
//
//        System.out.println("");
//
//        System.out.printf("%d %d %d %d", 1,2,3,4);

        //This application ask for 2 integers and supply their
        //sum, product, difference, division, largest and equal

//        int num_1, num_2, sum, product, difference, division, largest;
//
//        Scanner rule = new Scanner(System.in);
//        System.out.println("Enter first number");
//        num_1=rule.nextInt();
//
//        System.out.println("Enter second number");
//        num_2=rule.nextInt();
//
//        sum = num_1 + num_2;
//        product = num_1 * num_2;
//        difference = num_1 - num_2;
//        division = num_1 /  num_2;
//
//        if (num_1 == num_2){
//            System.out.println("The numbers are equal");
//        } else if (num_1<num_2){
//            System.out.println("The largest is:" + num_2);
//        }else {
//            System.out.println("The largest is: " + num_1);
//        }

        //This program will display square using astricks

//        System.out.println("******");
//        System.out.println("*     *");
//        System.out.println("*      *");
//        System.out.println("*       *");
//        System.out.println("*        *");
//        System.out.println("*        *");
//        System.out.println("*        *");
//        System.out.println("*       *");
//        System.out.println("*      *");
//        System.out.println("*     *");
//        System.out.println("******");
//
//        System.out.printf("*%n**%n***%n****%n** **%n");
//
//        System.out.print("*");
//        System.out.print("***");
//        System.out.print("*****");
//        System.out.print("****");
//        System.out.println("**");



//        System.out.println(Math.max(1,5));
//        int num1=2, num2=5, num3=21;
//
//        Math.max(num3,Math.max(num1,num2))
        int num1, num2;

        Scanner ent = new Scanner(System.in);

        System.out.println("Enter your first number");
        num1 = ent.nextInt();

        System.out.println("Enter your second number");
        num2 = ent.nextInt();

        if (num1%num2==0){
            System.out.println("This is a multiple");
        }else {
            System.out.println("This is not a multiple");
        }
















    }

}
