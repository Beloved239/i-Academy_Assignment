package Ex_8_SavingsAccount;

public class SavingsAccount {
    private String firstName;
    private String lastName;

    private double depositAmount;
    private double savingsBalance=0;

    public static double annualInterestRate=0.40;

    public SavingsAccount(String firstName, String lastName, double depositAmount) {
        validateDeposit(depositAmount);
        this.firstName = firstName;
        this.lastName = lastName;
        this.depositAmount = depositAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getDepositAmount() {

        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void validateDeposit(double depositAmount){
        if (depositAmount<=0){
            throw new IllegalArgumentException("You can not deposit Amount less than zero");

        }
    }

    public double deposit(double savingsBalance, double depositAmount){
        return savingsBalance + getDepositAmount();
    }

    public double monthlyInterestRate(double savingsBalance, double annualInterestRate){
        double balancePlusInterest= (deposit(getSavingsBalance(),getDepositAmount()) * getAnnualInterestRate());
         return balancePlusInterest;
    }
    public double monthlyRateFromJanuary(double savingsBalance, double annualInterestRate){
        int month; double sum=0;
        for (month=1; month<=12; month++){
            System.out.print("Month "+month+" = "+ (monthlyInterestRate(getSavingsBalance(),getAnnualInterestRate()))/12) ;

        }return month;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "Firstname='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", DepositAmount=" + depositAmount +
                ", Savings Balance= " + deposit(getSavingsBalance(),getDepositAmount()) +
                ", Available Balance=   "+ deposit(getSavingsBalance(),getDepositAmount())+
                ", Monthly Interest= "+ (monthlyInterestRate(getSavingsBalance(),getAnnualInterestRate()))/12+
                ", New Balance Plus Interest= "+(((monthlyInterestRate(getSavingsBalance(),getAnnualInterestRate()))/12) + (deposit(getSavingsBalance(),getDepositAmount())))+
                '}';
    }
}
