package Monday27_03;

import java.util.Scanner;

public class Score {

    public static String displayGrade() {
        Integer grade;
        String score = " ";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Grade");
        grade = input.nextInt();

//        if (grade >= 70){
//            System.out.println("A");
//        } else if (grade >= 60) {
//            System.out.println("B");
//        } else if (grade >= 50) {
//            System.out.println("C");
//        } else if (grade >= 40) {
//            System.out.println("D");
//        }else {
//            System.out.println("F");
//        }


        switch (grade/10){
            case 9,8,7:
                score= "A";
                break;
            case 6:
                score = "B";
                break;
            case 5:
                score= "C";
                break;
            default:
                score = "F";

        }

        return score;
        }

    public static void main(String[] args) {
        displayGrade();
    }


    }
