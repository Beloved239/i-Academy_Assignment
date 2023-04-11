package Assessment;

import java.util.Scanner;

public class NumberPerfect {
    public static void main(String[] args) {
        isPerfect();
        displayPerfectNumber();
    }

    public static int isPerfect(){
        int num, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer Value");
        num = input.nextInt();

        for (int i=1; i<=num/2; i++){
            if (num % i ==0){
                System.out.println(i + " is a factor of " + num);
                sum+=i;
            }
        }
        if (sum==num){
            System.out.println(num+" is a Perfect Number");
        }else {
            System.out.println(num+" is not a Perfect Number");
        }return num;
    }


    public static int displayPerfectNumber(){
        int min, max,num;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first Minimum Integer Value");
        min = input.nextInt();

        System.out.println("Enter the last/ Maximum Integer Value");
        max = input.nextInt();

        for (num=min; num<=max; num++){
            int sum=0;

            for ( int i=1; i<=num/2; i++){
                if (num%i==0){
                    sum+=i;
                }
            }
            if (sum==num){
                System.out.println(num + " is a Perfect Number");
            }
        }return num;


    }

}

