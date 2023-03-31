package Friday;

public class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    double yearlySalary;

    double grossYearlySalary;

    public double getGrossYearlySalary() {
        return grossYearlySalary;
    }

    public void setGrossYearlySalary(double grossYearlySalary) {
        this.grossYearlySalary = grossYearlySalary;
    }

    public Employee(String firstName, String lastName, double monthlySalary, double yearlySalary, double grossYearlySalary){
        this.firstName= firstName;
        this.lastName= lastName;
        if (monthlySalary>0){
        this.monthlySalary= monthlySalary;}
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary>0){
        this.monthlySalary = monthlySalary;}
        else{
            monthlySalary=0;
        }
    }
    public String displayMessage(){
        String message = getFirstName() +" " + getLastName() +" " +"Your monthly Salary is: " + getMonthlySalary() +
                " Your Annual income is " + getYearlySalary() + "Your Gross Yearly Income is "+ getGrossYearlySalary();
        return message;
    }
}
