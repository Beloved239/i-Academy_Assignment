package AbstractionPractice;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissiomRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissiomRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (grossSales < 0){
            throw new IllegalArgumentException("Gross Sales can not be less than 0");
        }
        this.grossSales = grossSales;
        if (commissiomRate < 0){
            throw new IllegalArgumentException("Commission Rate can not be less than 0");
        }
        this.commissiomRate = commissiomRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0){
            throw new IllegalArgumentException("Gross Sales can not be less than 0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissiomRate() {
        return commissiomRate;
    }

    public void setCommissiomRate(double commissiomRate) {
        if (commissiomRate < 0){
            throw new IllegalArgumentException("Commission Rate can not be less than 0");
        }
        this.commissiomRate = commissiomRate;
    }

//    public double calculateCommission(n )

}
