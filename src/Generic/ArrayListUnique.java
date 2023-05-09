package Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListUnique {
    /*
    this program display unique numbers
     */
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        int temp = 0;
        for (int i =1; i<=5; i++){
            System.out.println("Enter 5 integers"+ i);
            temp = input.nextInt();
            if (!integers.contains(temp)){
                integers.add(temp);
            }
        }
        System.out.println(temp);
//        System.out.println("Enter 5 integers");
//        int temp = input.nextInt();
//        for (int i = 0; i < 5; i++) {
//            if (!integers.contains(temp)){
//                integers.add(temp);
//            }
//        }
        Collections.sort(integers);
//        System.out.println(temp);
        System.out.println(integers);
    }

}
