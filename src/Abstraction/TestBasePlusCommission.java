package Abstraction;

public class TestBasePlusCommission {
    public static void main(String[] args) {
        HourlyEmployee theHourlyEmployee = new HourlyEmployee("Oluwatobi", "Ade","12345678",120,20);
        System.out.println(theHourlyEmployee);

        SalariedEmployee theSalaryEmployee = new SalariedEmployee("Ola","Seun","123456789",12);
        System.out.println(theSalaryEmployee.toString());

        BasePlusCommission theBasePlusCommission = new BasePlusCommission("Ola","John","98765432",1200,0.4,20000);
        System.out.println(theBasePlusCommission.toString());



    }
}
