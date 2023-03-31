package Assignment;

import java.util.Scanner;

public class Driving_cost {
    public static void main(String [] args){
      /*
      This program calculates consumers' daily driving cost on vehicles
       */
        double mile;
        double costOfGasoline;
        double averageMile;
        double parkingFee;
        double tolls;
        double result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Total Miles driven per day:");
        mile = input.nextDouble();

        System.out.println("Enter Cost per gallon of Gasoline");
        costOfGasoline = input.nextDouble();

        System.out.println("Enter Average Miles per gallon");
        averageMile = input.nextDouble();

        System.out.println("Enter parking fees per day");
        parkingFee = input.nextDouble();

        System.out.println("Enter tolls per day");
        tolls = input.nextDouble();

        result = (mile/averageMile) * costOfGasoline + parkingFee + tolls;

        System.out.println("Your Daily Driving Cost is:" + result);
    }
}
