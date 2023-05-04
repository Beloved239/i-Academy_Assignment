package Abstraction;

public class BasePlusCommission extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommission(String firstName, String lastNAme, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastNAme, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0){
            throw  new IllegalArgumentException("Base Salary can not be less than 0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {

        return "Base Plus Commission Employee{" +super.toString()+
                "Base Salary=" +getBaseSalary() +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return getBaseSalary() + super.getPaymentAmount();
    }
    //    @Override
//    public double earnings() {
//        return getBaseSalary() + super.earnings();
//    }
}
