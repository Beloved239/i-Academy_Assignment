package Ex_9.BaseEmployee;

public class BasePlusCommission {
    private CommissionEmployee commissionEmployee;

    private double baseSalary;

    public BasePlusCommission(CommissionEmployee commissionEmployee, double baseSalary) {
        this.commissionEmployee = commissionEmployee;
        this.baseSalary = baseSalary;
    }

    public CommissionEmployee getCommissionEmployee() {
        return commissionEmployee;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double displayBasePlusCommission(double earning, double baseSalary){
        return earning + baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommission{" +
                "commissionEmployee=" + commissionEmployee +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
