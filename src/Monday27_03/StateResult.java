package Monday27_03;

import java.util.Scanner;

public class StateResult {
    public static void main(String[] args) {
        int result;
        int resultCounter=1;
        int passed=0;
        int failed=0;

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Result" + resultCounter);
//        result = input.nextInt();

        while (resultCounter <= 10) {
            System.out.println("Enter Result " + resultCounter);
            result = input.nextInt();
            resultCounter++;

            if (result == 1) {
                passed++;
            }
            if (result == 2) {
                failed++;
            }
        //            System.out.println(passed);
//            System.out.println(failed);
//            System.out.println("Total Number of Student who passed is "+ passed);
//            System.out.println("Total Number of Student who failed is "+ failed);
//
//            if (passed>8){
//                System.out.println("Bonus for Instructor");
//            }
        }
//        System.out.println(passed);
//        System.out.println(failed);
        if (passed >= 8){
            System.out.println("Bonus for Instructor");
        }

        System.out.println("Total Number of Student who passed is "+ passed);
        System.out.println("Total Number of Student who failed is "+ failed);




//        if (result==1){
//            passed++;
//        }
//        if (result==2){
//            failed++;
//        }
//        System.out.println(passed);
//        System.out.println(failed);

    }
}
