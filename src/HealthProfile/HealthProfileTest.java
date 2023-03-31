package HealthProfile;

import HeartRateCalculator.HeartRate;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile patient1 = new HealthProfile("Gbenga","Adeniji","Male",1.72,70,"03","March",1960);
        System.out.println("Name: "+patient1.displayName());
        System.out.println("Date of Birth:"+ patient1.displayBirth());
        System.out.println("Gender: "+ patient1.displayGender());
        System.out.println("Age: "+patient1.displayAge()+" " + "Years old");
        System.out.println("Heart Rate = "+patient1.displayHeartRate());
        System.out.println("Target Heart Rate Min = "+patient1.displayMinTargetHeartRate() +" Max ="+ patient1.displayMaxTargetHeartRate());
        System.out.println("Body Mass Index = " +patient1.displayBMI());
        System.out.println(patient1.displayBMIChart());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        String firstName = input.nextLine();
        patient1.setFirstName(firstName);

        System.out.println("Enter your Last Name");
        String lastName = input.nextLine();
        patient1.setLastName(lastName);

        System.out.println("Enter Your Gender");
        String gender = input.nextLine();
        patient1.setGender(gender);

        System.out.println("Enter Your Height in Meters");
        Double height = input.nextDouble();
        patient1.setHeight(height);

        System.out.println("Enter Your Weight in Kgs");
        Double weight = input.nextDouble();
        patient1.setWeight(weight);

        System.out.println("Enter Birthday-Day");
        String birthDay = input.nextLine();
        patient1.setBirthDay(birthDay);

        System.out.println("Enter Birthday-Month");
        String birthMonth = input.nextLine();
        patient1.setBirthMonth(birthMonth);

        System.out.println("Enter your Birthday-Year");
        int birthYear = input.nextInt();
        patient1.setBirthYear(birthYear);

        System.out.println("Name: "+patient1.displayName());
        System.out.println("Date of Birth: "+ patient1.displayBirth());
        System.out.println("Gender: "+ patient1.displayGender());
        System.out.println("Age: "+patient1.displayAge()+" " +"Years old");
        System.out.println("Heart Rate = "+patient1.displayHeartRate());
        System.out.println("Target Heart Rate Min = "+patient1.displayMinTargetHeartRate() +" Max ="+ patient1.displayMaxTargetHeartRate());
        System.out.println("Body Mass Index = " +patient1.displayBMI());
        System.out.println(patient1.displayBMIChart());

    }
}
