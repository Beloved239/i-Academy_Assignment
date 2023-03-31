package Exercise;

public class SavingsTest {
    public static void main(String[] args) {
       Savings employee1 = new Savings("Oluwatobi","Adebanjo",200000,1,1) ;
       Savings employee2 = new Savings("Kelvin", "Joshua", 30000, 1, 1);

       double yearlySalary= employee1.getYearlySalary();
       System.out.println(employee1.displayMessage());
        System.out.println(employee2.displayMessage());

    }


}
