package Thursday23_03;

import java.text.DecimalFormat;

public class WorldPopulation {
    public static void main(String[] args) {
        double population=8;
        double rate=1.05;
        int i;
        double estimatedPopulation;
        DecimalFormat df = new DecimalFormat("#.##");

        for ( i = 1; i <= 5; i++);{
            estimatedPopulation = population * Math.pow(1 + (rate/100), i);
            System.out.println("Estimated Population after " +i+ "years " + df.format(population) + " billion");
        }
    }

}
