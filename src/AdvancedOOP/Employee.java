package AdvancedOOP;

public class Employee {
    private String firstName;
    private String lastName;
    private String bvn;
    private String gender;
    private Date birthDate;
    private Date hireDate;
    private Date weddingDate;

    public Employee(String firstName, String lastName, String bvn, String gender, Date birthDate, Date hireDate, Date weddingDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bvn = bvn;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.weddingDate = weddingDate;
    }
    public boolean validateBvn(String bvn){
        if (bvn.length()==11){
            return true;
        }return false;
    }//return bvn.length == 11;--Alternative logic

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
        validateBvn(bvn);
        this.bvn = bvn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(Date weddingDate) {
        this.weddingDate = weddingDate;
    }



    public void displayEmployeeInfo(){
        System.out.printf("""
                Firstname: %s\nLastname: %s\nBVN: %s\nGender %s\nBirthDate: %s\nHireDate: %s\nWeddingDate: %s\n
                
                
                """,getFirstName(),getLastName(),getBvn(), getGender(),getBirthDate(),getHireDate(),getWeddingDate());
    }
}
