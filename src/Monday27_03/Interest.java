package Monday27_03;

public class Interest {
    public static void main(String[] args) {
        double amount;
        double principal=1000;
        double rate=0.5;
        int year;

        /*
        Using For Loop;
        While Loop;
        Do-While Loop
        Calculate the Interest Rate on a Principal Amount Invested over the period of Ten Years
         */

        //For-Loop Algorithm
        System.out.printf("%s%25s%n", "Year", "Amount on Deposit");

        for (year=1; year<=10; year++){
            amount= principal*Math.pow(1+rate,year);

            System.out.printf("%4d%,20.2f%n", year, amount);
        }


        //While Loop Algorithm

        System.out.println("   ");
        year=1;
        while (year<=10){
            amount= principal*Math.pow(1+rate,year);

            System.out.printf("%4d%,20.2f%n", year, amount);
            year++;
        }
        //Do-While Algorithm
        System.out.println("   ");

        year=1;
        do {
            amount= principal*Math.pow(1+rate,year);

            System.out.printf("%4d%,20.2f%n", year, amount);
            year++;
        } while (year<=10);

    }

}
