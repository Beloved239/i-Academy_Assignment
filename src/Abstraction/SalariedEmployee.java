package Abstraction;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastNAme, String socialSecurityNumber, double weeklySalary) {

        super(firstName, lastNAme, socialSecurityNumber);
        if (weeklySalary < 0){
            throw new IllegalArgumentException("Weekly Salary can not be negative");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0){
            throw new IllegalArgumentException("Weekly Salary can not be negative");
        }
        this.weeklySalary = weeklySalary;
    }

//    @Override
//    public double earnings() {
//        return getWeeklySalary();
//    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +super.toString()+
                "weeklySalary=" + getWeeklySalary() +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
}
