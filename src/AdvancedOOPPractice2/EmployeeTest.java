package AdvancedOOPPractice2;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Firstname");
        String firstName= input.nextLine();

        System.out.println("Enter your lastname");
        String lastName= input.nextLine();

        System.out.println("Enter your BVN");
        String bvn= input.nextLine();

        System.out.println("Enter your Gender");
//        Gender gender= input.nex;

        System.out.println("Enter your Birthdate");
        String birthDate= input.nextLine();

        System.out.println("Enter your Hiredate");
        String hireDate= input.nextLine();

        System.out.println("Enter your WeddingDate");
        String weddingDate= input.nextLine();

//        Employee employee = new Employee(firstName,lastName,bvn,gender,birthDate,hireDate,weddingDate);
//        employee.displayEmployeeInfo();
    }

}
