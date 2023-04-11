package AdvancedOOP;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birthDate = new Date(2,5,1983);
        Date hireDate = new Date(9,31,2023);
//        hireDate.setDay(9);
//        hireDate.setMonth(31);
//        hireDate.setDay(1983);
        Date weddingDate = new Date(3,5,2016);
        Employee sarah = new Employee("Sarah", "Adelola","123456789123","Female", birthDate,hireDate,weddingDate);
        sarah.displayEmployeeInfo();

    }
}
