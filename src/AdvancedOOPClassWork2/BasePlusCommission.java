package AdvancedOOPClassWork2;

public class BasePlusCommission extends CommissionEmployee{

    private double baseSalary;
    private double commissionRate;
    private double grossSales;


    public BasePlusCommission(String firstName, String lastName, String socialNumber, double baseSalary, double commissionRate, double grossSales) {
        super(firstName, lastName, socialNumber);

        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.grossSales=grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    private double earnings(){
        return (getBaseSalary()+(getCommissionRate()*getGrossSales()));
    }

    @Override
    public String toString() {
        return "BasePlusCommission{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", bvn='" + super.getSocialNumber() + '\'' +
                ", grossSale=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                ", baseSalary=" + baseSalary +
                ", earnings="+ earnings() +
                '}';
    }


}
