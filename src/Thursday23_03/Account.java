package Thursday23_03;

public class Account {

    //This is instance variable
    public String accountName;
    public double balance;

    public Account (String accountName, double balance){
        this.accountName = accountName;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //This is a method called getAccountName
    public String getAccountName() {
        return accountName;
    }

    //This is a method called setAccountName

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    //This is a method that display Account Message

    public String displayMessage(){
        String message = "Account created successfully"+"Your Account Name is:" +getAccountName();
        return message;
    }
}
