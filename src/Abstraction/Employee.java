package Abstraction;

public abstract class Employee implements Payable{
    private String firstName;
    private  String lastNAme;
    private  String socialSecurityNumber;

    public Employee(String firstName, String lastNAme, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //creating Abstract method (this method mus be without implementation)
//    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastNAme='" + getLastNAme() + '\'' +
                ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' +
                '}';
    }


}
