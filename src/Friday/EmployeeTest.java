package Friday;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("O","A",0, 0, 0);
        Employee employee2 = new Employee("Oy","Ol", 0, 0, 0);
//        System.out.println("Employee 1 details= " + employee1.firstName +" " + employee1.lastName +" " +employee1.monthlySalary);
//        System.out.println("Employee 2 details= " + employee1.displayMessage() );
//        System.out.println("Employee 2 details= " + employee2.displayMessage());


        System.out.println(employee2.firstName+ " " + employee2.lastName +" " + employee2.monthlySalary+ " "+ employee2.yearlySalary+ " "+ employee2.grossYearlySalary);
        Scanner input = new Scanner(System.in);

        System.out.println("Employee 1");
        System.out.println("Enter your First Name");
        String firstName = input.nextLine();
        employee1.setFirstName(firstName);


        System.out.println("Enter your Last Name");
        String lastName = input.nextLine();
        employee1.setLastName(lastName);

        System.out.println("Enter your Monthly Salary");
        double monthlySalary = input.nextDouble();
        employee1.setMonthlySalary(monthlySalary);

        double yearlySalary =0;
        double grossYearlySalary;


        for (int i=1; i<13; i++) {
            System.out.println("Enter your Salary " + " Month " + i);
            double num = input.nextDouble();
            yearlySalary += num;
        }
        grossYearlySalary=1.10*yearlySalary;
        employee1.setYearlySalary(yearlySalary);
//        employee1.setYearlySalary(yearlySalary);
        employee1.setGrossYearlySalary(grossYearlySalary);

//        double grossYearlySalary = 1.10*yearlySalary;


//            if (yearlySalary>0){
//                yearlySalary;
//            }
//
//
//
//        }
//        employee1.setMonthlySalary(monthlySalary);
//        employee1.setYearlySalary(yearlySalary);


//        System.out.println(employee1.firstName+ " "+ employee1.lastName+ " "+ employee1.monthlySalary);
//        System.out.println(employee1.getFirstName()+ " " + employee1.getLastName()+" " + employee1.getMonthlySalary());
        System.out.println(employee1.displayMessage());

//        Scanner inputs = new Scanner( System.in);

//        System.out.println("Employee 2");
//        System.out.println( "Enter your name");
//        String firstName = input.nextLine();
//        employee2.setFirstName(firstName);


    }

}
