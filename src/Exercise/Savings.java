package Exercise;

public class Savings {
    String firstName;
    String lastName;
    Double monthlySalary;
    Double yearlySalary;
    Double yearlyRaise;

    public Savings (String firstName, String lastName, double monthlySalary, double yearlySalary, double yearlyRaise){
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary>0){
        this.monthlySalary = monthlySalary;}
        this.yearlySalary = yearlySalary;
        this.yearlyRaise = yearlyRaise;

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

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println("Monthly Salary can't be zero 0");
        }
    }

        public Double getYearlySalary () {
            return yearlySalary = monthlySalary * 12;
        }

        public Double getYearlyRaise (){
            return yearlyRaise = 1.1*yearlySalary;
        }

        public String displayMessage(){
        String message = "Your Account Name is: " + getFirstName() +" " + getLastName() + " "
                + "Your Monthly Salary is: " + getMonthlySalary() + " "+ "Your Yearly Salary is: " + getYearlySalary() + " "
                + "Your Yearly raise is: " + getYearlyRaise();
                return message;
        }


    }


