package AdvancedOOP;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String bvn, double grossSale, double commissionRate, double baseSalary) {
        super(firstName,lastName,bvn,grossSale,commissionRate);
        this.baseSalary = baseSalary;

    }
    
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    private double validateGrossSales(double sales) {
        if (sales < 0) {
            sales = 0;
            throw new IllegalArgumentException("Sales has to be 0 or more");
        }return sales;
    }

    private double validateCommissionRate(double rate){
        if (rate < 0 || rate> 1){
            rate=0;
            throw new IllegalArgumentException("Your commission ");
        }return rate;
    }
    public double earnings(){
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", bvn='" + super.getBvn() + '\'' +
                ", grossSale=" + super.getGrossSales() +
                ", commissionRate=" + super.getCommissionRate() +
                ", baseSalary=" + baseSalary +
                ", earnings="+ earnings() +
                '}';
    }
}
