package Generic;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class ArrayListExercise {
    /*
     *This program runs indefinitely until user logs out/exit from the program
     */

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            display();
            int choice = scanner.nextInt();
            if (choice==1){
                //Add
                System.out.println("Enter Integer to be added to th list");
                integers.add(scanner.nextInt());
                System.out.println("Added Successfully");

            } else if (choice==2) {
                //Remove
                System.out.println("Enter Integer to remove from the list");
                int options = scanner.nextInt();
                if (integers.contains(options)){
//                    integers.remove(integers.get(options));
                    integers.remove(valueOf(options));
                    System.out.println("Removed");
                }else {
                    System.out.println("Integer not found");
                }

                System.out.println("Removed Successfully");
            } else if (choice==3) {
                //View
                System.out.println("your List:" + integers);
            } else if (choice==4) {
                //exit
                System.out.println("Good Bye");
                break;
            }
        }

    }


    public static void display(){
        System.out.println("Select Your Options");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. View List");
        System.out.println("4. Exit");
        System.out.println("Your Choice: ");
    }
}
