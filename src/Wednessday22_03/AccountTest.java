package Wednessday22_03;

import java.util.Scanner;

public class AccountTest {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        Account account = new Account("Musa");

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        account.setName(name);
        System.out.println("Your account name is " + account.getName());


    }
}
