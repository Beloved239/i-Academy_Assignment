package Monday27_03;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        int grade;
        int counter =1;
        int passCount=0;
        int failCount=0;

        Scanner input = new Scanner(System.in);

        while (counter<=10){
            System.out.println("Enter your grade "+ counter);
            grade = input.nextInt();
            counter++;

            if (grade%2==1){
                passCount++;
            }else {failCount++;}
        }
        if (passCount>=8){
            System.out.println("Special bonus for Instructor");
        }
        System.out.println("Total number of pass is "+passCount);
        System.out.println("Total number of failure is "+failCount);
    }
}
