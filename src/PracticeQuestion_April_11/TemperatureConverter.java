package PracticeQuestion_April_11;

import java.util.Scanner;

public class TemperatureConverter {
    /**
     *
     * This program converts Celsius to Fahrenheit and Vice Versa
     */
    public static void main(String[] args) {
        int fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Temperature converter Application");
        System.out.println("Press 1 for conversion of Fahrenheit to Celsius");
        System.out.println("Press 2 for conversion of Celsius to Fahrenheit");
        double value = input.nextDouble();

        if (value==1){
            System.out.println("Enter your value");
            double newValue = input.nextDouble();
            System.out.println(displayCelsius(newValue));
        } else if (value==2) {
            System.out.println("Enter your value");
            double newValue = input.nextDouble();
            System.out.println(displayFahrenheit(value));

        }


    }

    public static double displayCelsius(double fahrenheit){
        return ((5.0/9.0)*(fahrenheit-32));
    }

    public static double displayFahrenheit(double celsius){
        return ((9.0/5.0)*(celsius+32));
    }
}
