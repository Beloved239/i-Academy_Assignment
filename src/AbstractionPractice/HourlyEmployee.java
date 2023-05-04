package AbstractionPractice;

public class HourlyEmployee extends Employee{

    private double hours;
    private double hourlyRate;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double hourlyRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (hours < 0){
            throw new IllegalArgumentException("Hours can not be negative");
        }
        this.hours = hours;
        if (hourlyRate < 0){
            throw new IllegalArgumentException("Rate can not be less than 0");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0){
            throw new IllegalArgumentException("Hours can not be negative");
        }
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0){
            throw new IllegalArgumentException("Rate can not be less than 0");
        }
        this.hourlyRate = hourlyRate;
    }

    public double salariedPayment(){
        if (hours <= 40) {
            return getHourlyRate() * getHours();
        }
        return ((getHourlyRate()*40)+((getHours()-40)*1.5*getHourlyRate()));
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hours=" + hours +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
