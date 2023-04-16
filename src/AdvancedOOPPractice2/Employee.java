package AdvancedOOPPractice2;

public class Employee {
    private String firstName;
    private String lastName;
    private String bvn;
    private Gender gender;
    private String birthDate;
    private String hireDate;
    private String weddingDate;

    public Employee(String firstName, String lastName, String bvn, Gender gender, String birthDate, String hireDate, String weddingDate) {
        validateBvn(bvn);
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.weddingDate = weddingDate;
    }

    private boolean validateBvn(String bvn){
        return bvn.length()== 11;
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
        return bvn;
    }

    public void setBvn(String bvn) {
        validateBvn(bvn);
        this.bvn = bvn;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(String weddingDate) {
        this.weddingDate = weddingDate;
    }

    public void displayEmployeeInfo(){
        System.out.printf("""
                Firstname: %s \nLastname: %s \nBVN: %s \nGender: %s \nBirthDate: %s \nHireDate: %s \nWeddingDate:%s \n
                
                """,getFirstName(),getLastName(),getBvn(),getGender(),getBirthDate(),getHireDate(),getWeddingDate());
    }
}
