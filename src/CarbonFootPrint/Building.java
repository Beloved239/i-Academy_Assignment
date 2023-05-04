package CarbonFootPrint;

public class Building implements CarbonFootPrint {
    private double dailyEnergyConsumption;
    private double numberOfDays;

    public Building(double dailyEnergyConsumption, double numberOfDays) {
        this.dailyEnergyConsumption = dailyEnergyConsumption;
        this.numberOfDays = numberOfDays;
    }

    public double getDailyEnergyConsumption() {
        return dailyEnergyConsumption;
    }

    public void setDailyEnergyConsumption(double dailyEnergyConsumption) {
        this.dailyEnergyConsumption = dailyEnergyConsumption;
    }

    public double getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(double numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double getCarbonFootPrint() {
        return getDailyEnergyConsumption() * getNumberOfDays() * 8.887 ;
    }

    @Override
    public String toString() {
        return "Building{" +
                "dailyEnergyConsumption=" + dailyEnergyConsumption +
                ", numberOfDays=" + numberOfDays +
                ", carbonFootPrint=" + getCarbonFootPrint() +
                '}';
    }
}
