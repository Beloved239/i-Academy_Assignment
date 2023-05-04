package CarbonFootPrint;

public class Car implements CarbonFootPrint{
    private double distanceCoveredYear;

    public Car(double distanceCoveredYear) {
        this.distanceCoveredYear = distanceCoveredYear;
    }

    public double getDistanceCoveredYear() {
        return distanceCoveredYear;
    }

    public void setDistanceCoveredYear(double distanceCoveredYear) {
        this.distanceCoveredYear = distanceCoveredYear;
    }

    @Override
    public double getCarbonFootPrint() {
        return (getDistanceCoveredYear()/20)*8.887;
    }

    @Override
    public String toString() {
        return "Car{" +
                "distanceCoveredYear=" + distanceCoveredYear +
                "Carbon Footprint=" + getCarbonFootPrint() +
                '}';
    }
}
