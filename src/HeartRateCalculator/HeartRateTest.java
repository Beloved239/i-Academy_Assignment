package HeartRateCalculator;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        HeartRate patient1 = new HeartRate("Olu","Ade","4","4",1994);
        System.out.println(patient1.displayName());
        System.out.println("You are "+ patient1.displayAge()+" years old");
        System.out.println("Your Heart Rate is " + patient1.displayHeartRate());
        System.out.println("Your Target Heart Rate Ranges from " + patient1.displayMinTargetHeartRate()+" to "+ patient1.displayMaxTargetHeartRate());

        Scanner patient = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstName = patient.nextLine();
        patient1.setFirstName(firstName);

        System.out.println("Enter your Last Name");
        String lastName = patient.nextLine();
        patient1.setLastName(lastName);

        System.out.println("Enter your Birth-Day");
        String birthDay = patient.nextLine();
        patient1.setBirthDay(birthDay);

        System.out.println("Enter your Birth-Month");
        String birthMonth = patient.nextLine();
        patient1.setBirthMonth(birthMonth);

        System.out.println("Enter your Birth-Year");
        int birthYear = patient.nextInt();
        patient1.setBirthYear(birthYear);


        System.out.println("You are "+ patient1.displayAge()+" years old");
        System.out.println("Your Heart Rate is " + patient1.displayHeartRate());
        System.out.println("Your Target Heart Rate Ranges from " + patient1.displayMinTargetHeartRate()+" to "+ patient1.displayMaxTargetHeartRate());





    }
}
