package Wednessday22_03;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Tobiloba Ojugwu", 17000, 15);
        System.out.printf("Your account name is %s\nYour Balance is %.2f", bankAccount.getAccountName()
                , bankAccount.getAccountBalance());


        Scanner scanner = new Scanner(System.in);
        String name;
        double balance;
        int age;
        System.out.println("Enter your account name");
        name = scanner.nextLine();

        System.out.println("Enter initial balance");
        balance = scanner.nextDouble();

        System.out.println("Enter your age");
        age = scanner.nextInt();

        BankAccount bankAccount1 = new BankAccount(name,balance,age);
        System.out.printf("Your account name is %s\nYour Balance is %.2f", bankAccount1.getAccountName()
                , bankAccount1.getAccountBalance());
        //deposit and deposit

        System.out.println("How much do you want to deposit");
        double depositAmount = scanner.nextDouble();
        bankAccount1.deposit(depositAmount);

        System.out.printf("Congrats! Your account name is %s\nYou've added %.2f to your account and new balance is %.2f", bankAccount1.getAccountName(),
                depositAmount,bankAccount1.getAccountBalance());

        System.out.println("How much do you want to withdraw?");
        double debitAmount = scanner.nextDouble();
        bankAccount1.debit(debitAmount);

//        System.out.printf("Congrats! Your account name is%s\nYou've withdrawn%.2f and your new balance is %.2f", bankAccount1.getAccountName(),
//                debitAmount, bankAccount1.getAccountBalance());

//        bankAccount1.deposit(3000);
//        System.out.printf("Your account name is %s\nYour Balance is %.2f", bankAccount1.getAccountName()
//                , bankAccount1.getAccountBalance());
//
//        bankAccount1.debit(2500);
//        System.out.printf("Your account name is %s\nYour Balance is %.2f", bankAccount1.getAccountName()
//                , bankAccount1.getAccountBalance());

    }
}
