package CarbonFootPrint;

public class Bicycle implements CarbonFootPrint{
    private double yearlyDistanceCovered;
    private double bicycleLifespan;

    public Bicycle(double yearlyDistanceCovered, double bicycleLifespan) {
        this.yearlyDistanceCovered = yearlyDistanceCovered;
        this.bicycleLifespan = bicycleLifespan;
    }

    public double getYearlyDistanceCovered() {
        return yearlyDistanceCovered;
    }

    public void setYearlyDistanceCovered(double yearlyDistanceCovered) {
        this.yearlyDistanceCovered = yearlyDistanceCovered;
    }

    public double getBicycleLifespan() {
        return bicycleLifespan;
    }

    public void setBicycleLifespan(double bicycleLifespan) {
        this.bicycleLifespan = bicycleLifespan;
    }


    @Override
    public double getCarbonFootPrint() {
        return (getYearlyDistanceCovered()*2.34)+(25.2/bicycleLifespan)+(0.92);
    }


    @Override
    public String toString() {
        return "Bicycle{" +
                "yearlyDistanceCovered=" + yearlyDistanceCovered +
                ", bicycleLifespan=" + bicycleLifespan +
                ", Carbon Footprint=" + getCarbonFootPrint() +
                '}';
    }
}
