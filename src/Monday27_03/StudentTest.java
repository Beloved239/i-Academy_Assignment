package Monday27_03;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Seun",99);


        System.out.println(student1.getName()+ " " + student1.getAverage());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name= input.nextLine();
        name = student1.getName();

        System.out.println("Enter your Average");
        Double average = input.nextDouble();
        average = student1.getAverage();

        System.out.println(student1.getLetterGrade());

    }
}
