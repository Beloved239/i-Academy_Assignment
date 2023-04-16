package AdvancedOOPPractice;

public class Employee {
    private String firstName;
    private String lastName;
    private String bvn;
    private String gender;
    private String birthDate;
    private String HireDate;
    private String weddingDate;

    public Employee(String firstName, String lastName, String bvn, String gender, String birthDate, String hireDate, String weddingDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;
        this.gender = gender;
        this.birthDate = birthDate;
        HireDate = hireDate;
        this.weddingDate = weddingDate;
    }
    private boolean validateBvn(String bvn){
        return bvn.length()==11;
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

    public String getBvn() {
        validateBvn(bvn);
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHireDate() {
        return HireDate;
    }

    public void setHireDate(String hireDate) {
        HireDate = hireDate;
    }

    public String getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(String weddingDate) {
        this.weddingDate = weddingDate;
    }

    public void displayEmployeeInfo(){
        System.out.printf("""
                Firstname: %s \nLastname: %s \nBVN: %s \nGender: %s \nBirthdate: %s \nHireDate: %s \nWeddingdate: %s \n
                
                """,getFirstName(),getLastName(),getBvn(),getGender(),getBirthDate(),getHireDate(),getWeddingDate());
    }
}
