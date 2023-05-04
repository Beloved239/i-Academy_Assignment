package AbstractionPractice;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0){
        throw new IllegalArgumentException("Weekly Salary can not be 0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0){
            throw new IllegalArgumentException("Weekly Salary can not be 0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double salaryPayment(){
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "weeklySalary=" + weeklySalary +
                '}';
    }


}
