package Abstraction;


public class HourlyEmployee extends Employee{

    private double wage;
    private  double hours;


    public HourlyEmployee(String firstName, String lastNAme, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastNAme, socialSecurityNumber);

        if (wage < 0){
            throw new IllegalArgumentException("Wage can not be less than 0");
        }

        this.wage = wage;

        if (hours < 0){
            throw new IllegalArgumentException("Hour worked must be greater than 0");
        }

        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0){
            throw new IllegalArgumentException("Wage can not be less than 0");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0){
            throw new IllegalArgumentException("Hour worked must be greater than 0");
        }
        this.hours = hours;
    }

//    @Override
//    public double earnings() {
//       if (wage <= 40){
//           return getWage() * getHours();
//       }
//       return (40 * getWage()) + ((getHours()-40)*getHours()*1.5);
//    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString()+
                ", wage=" + wage +
                ", hours=" + hours +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        if (wage <= 40){
           return getWage() * getHours();
       }
       return (40 * getWage()) + ((getHours()-40)*getHours()*1.5);
    }

}
