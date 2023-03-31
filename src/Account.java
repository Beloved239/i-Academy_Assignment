public class Account {
    private String accountName;
    private String accountNumber;
    private String email;
    private String gender;

    private double accountBalance;

    private boolean status;
    private int houseNumber;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
    public void debitAccount(){
        System.out.println("Your account has been debited");
    }
    public void creditAccount(){
        System.out.println("Your account has been credited");
    }
        public void displayMessage(){
        System.out.printf("Account name is %s\nAccount Number is %s\nUser email is %s\nGender is %s\nAccount Balance is %.2f\n"
                ,getAccountName(), getAccountNumber(), getEmail(), getGender(), getAccountBalance());
        System.out.println("Account Status is " + isStatus());
        System.out.println("House Number is " + getHouseNumber());

    }
}
