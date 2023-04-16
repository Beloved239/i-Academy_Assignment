package Ex_9.BaseEmployee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bosede","Olabisi","123456789");
        System.out.println(employee);

        CommissionEmployee commissionEmployee = new CommissionEmployee(employee,150_000,0.4,123);
        System.out.println(commissionEmployee.toString());


        double commission = commissionEmployee.earnings(150000,0.4);

        BasePlusCommission basePlusCommission = new BasePlusCommission(commissionEmployee,120000);

        System.out.println(basePlusCommission.toString());



    }


}
