package Wednessday22_03;

import java.util.Scanner;

public class BankAccountPracticeTest {
    public static void main(String[] args) {
        BankAccountPractice bankAccount = new BankAccountPractice("Tobi",00);
        System.out.printf(bankAccount.getAccountName(),bankAccount.getAccountBalance());

        Scanner scanner = new Scanner(System.in);
        String name;
        double balance;
        System.out.println("Enter your account name");
        name = scanner.nextLine();




    }

}
