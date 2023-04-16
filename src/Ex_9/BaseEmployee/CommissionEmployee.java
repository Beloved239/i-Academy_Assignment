package Ex_9.BaseEmployee;

public class CommissionEmployee {
    private Employee employee;
    private double grossSales;
    private double commissionRate;
    private double earnings;

    public CommissionEmployee(Employee employee, double grossSales, double commissionRate,double earnings) {
        this.employee = employee;

        if (grossSales<=0){
            throw new IllegalArgumentException("Gross Sales can not be Zero");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.earnings=earnings(getGrossSales(),getCommissionRate());

    }


    public Employee getEmployee() {
        return employee;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getEarnings() {
        return earnings;
    }

    public double earnings(double grossSales, double commissionRate){
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "employee=" + employee +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                ", earnings=" + earnings +
                '}';
    }
}
