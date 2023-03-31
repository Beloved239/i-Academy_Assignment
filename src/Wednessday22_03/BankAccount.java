package Wednessday22_03;

public class BankAccount {
    private String accountName;

    private double accountBalance;

    private int age;
    /*
    This is a constructor @ public BankAccount
     */
   public BankAccount (String accountName, double accountBalance, int age){
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        this.age=age;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void deposit(double amount){
        accountBalance = getAccountBalance() + amount;
    }

    public void debit(double amount) {


        if (amount<getAccountBalance()) {
            accountBalance = getAccountBalance() - amount;
            System.out.println("Successful!");

            System.out.println("Your New Account Balance is:" + accountBalance);


            }else {System.out.println("Insufficient balance");

        }
    }
}
