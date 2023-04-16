package AdvancedOOPClassWork;

public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String bvn;
    private double grossSales;
    private double commissionRate;


    public CommissionEmployee(String firstName, String lastName, String bvn, double grossSales, double commissionRate) {
        this.firstName = firstName;
        this.lastName = lastName;

        validateBVN(bvn);
        this.bvn = bvn;

        validateGrossSales(grossSales);
        this.grossSales = grossSales;

        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
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
        validateBVN(bvn);
        this.bvn = bvn;
    }

    public double getGrossSales() {
        validateGrossSales(grossSales);
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
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

    private double earnings(){
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", bvn='" + getBvn() + '\'' +
                ", grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                ", earnings=" + earnings()+
                '}';
    }

    public void commissionEmployeeDisplayInfo(){
        System.out.printf("""
                FirsName: %s \nLastname: %s \nBVN: %s \nGrossSales: %.2f \nCommission rate: %.2f \nBase salary: %.2f \n
                
                """,getFirstName(),getLastName(),getBvn(),getGrossSales(),getCommissionRate(),getGrossSales());
    }




}
