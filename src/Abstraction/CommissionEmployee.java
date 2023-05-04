package Abstraction;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastNAme, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastNAme, socialSecurityNumber);

        if (grossSales < 0){
            throw new IllegalArgumentException("Gross Sales can not be negative");
        }

        this.grossSales = grossSales;

        if (commissionRate < 0){
            throw new IllegalArgumentException("Commisssion rate can not be negative");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +super.toString()+
                "grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return getGrossSales() * getCommissionRate();
    }

//    @Override
//    public double earnings() {
//        return getGrossSales() * getCommissionRate();
//    }
}
