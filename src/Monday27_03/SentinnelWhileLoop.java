package Monday27_03;

import java.util.Scanner;

public class SentinnelWhileLoop {
    public static void main(String[] args) {
        /**
         * score, studentCounter, totalScore, average, flagvalue
         */

        int score;
        int totalScore=0;
        int studentCounter=1;
        double average;
        int flagValue= -1;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter score%d\n", studentCounter);
        score= scanner.nextInt();

        while (score !=flagValue){
            studentCounter++;
//            totalScore = totalScore + score;
            totalScore = totalScore + score;

        System.out.printf("Enter score%d\n", studentCounter);
        score = scanner.nextInt();

            System.out.println("Total score is "+ totalScore);

        }
        if (studentCounter!=0){
            average= (double) totalScore/studentCounter;

            System.out.printf("Total number of student is %d\nTotal Socre is %d\nAverage is %.2f",studentCounter,
                    totalScore, average);
        }else {
            System.out.println("No grades entered");
        }


    }
}
