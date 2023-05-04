package ArraysPractice;

import java.util.Arrays;

public class NewArraysExample {
    public static void main(String[] args) {
        String b[] = new String[12];
        String[] c = new String[12];
        String[] e = new String[12];

//        int[] array = new int[10];
//        array[0]=2;
//        array[1]=22;
//        array[2]=24;
//
//        System.out.printf("%s%8s%n","Index", "Value");
//        for (int counter=0; counter< array.length; counter++){
//            System.out.printf("%5d%8s%n",counter,array[counter]);
//            System.out.println();
//        }


        //Array with initializer

        int[] arrays ={12, 23, 23, 34, 54, 85, 40, 95, 89, 43};
        System.out.printf("%s%8s%n", "Index", "Value");

//        for (int counter: num){
//            System.out.printf("%5s%8s%n",num, counter);
//
//        }
//        int[] array = {12, 13, 14, 12, 17, 23, 34, 45, 9, 45};
        int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        System.out.printf("%s%8s%n", "Index", "Values");

        for (int counter=0; counter< array.length; counter++){
            System.out.printf("%5d%8d%n", counter,array[counter]);
            total += array[counter];
        }
        System.out.printf("Total is %5d%n",total);
    }
}
