package AdvancedOOPClassWork;

public class BasePlusCommissionRate {
    private String firstName;
    private CommissionEmployee thisEmployee;
    private String lastName;
    private String bvn;
    private double grossSales;
    private double commissionRate;

    private double baseSalary;


    public BasePlusCommissionRate(String firstName, String lastName, String bvn, double grossSales, double commissionRate, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;


        this.grossSales = grossSales;
        this.commissionRate = commissionRate;

        this.baseSalary = baseSalary;


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

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    private boolean validateGrossSales(double grossSales){
        if (grossSales==0){
            return false;
        }return true;
    }

    private boolean validateBVN(String bvn){
        return bvn.length()==11;
    }

    private boolean validateCommissionRate(double commissionRate){
        if (commissionRate<0 || commissionRate>1){
            return false;
        }return true;
    }

    private double earningsPlusBaseSalary(){
        return getBaseSalary()+ ( getGrossSales() * getCommissionRate());
    }

    @Override
    public String toString() {
        return "BasePlusCommissionRate{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", bvn='" + getBvn() + '\'' +
                ", grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                ", baseSalary=" + getBaseSalary() +
                ", Earnings plus Base Salary=" + earningsPlusBaseSalary()+
                '}';
    }

    public void commissionEmployeeDisplayInfo(){
        System.out.printf("""
                FirsName: %s \nLastname: %s \nBVN: %s \nGrossSales: %.2f \nCommission rate: %.2f \nBase salary: %.2f \nEarnings: %.2f \n
                
                """,getFirstName(),getLastName(),getBvn(),getGrossSales(),getCommissionRate(),getBaseSalary(),+earningsPlusBaseSalary());
    }
}
