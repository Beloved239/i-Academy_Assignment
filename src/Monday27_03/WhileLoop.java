package Monday27_03;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        /**
         * A Class of ten students
         */
        int studentCounter=1;
        int score;
        double classAverage;
        int totalScore = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter student%d's score\n", studentCounter);
        score = scanner.nextInt();

        while (studentCounter <= 9) {
            studentCounter++;
            System.out.printf("Enter student%d's score\n", studentCounter);
            score = scanner.nextInt();
            totalScore = totalScore + score;
            System.out.println("Total Score is " + totalScore);

        }
        classAverage = (double) totalScore/10;
        System.out.println("Average Score is "+ classAverage);
    }

}
