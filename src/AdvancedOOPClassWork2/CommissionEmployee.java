package AdvancedOOPClassWork2;

public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialNumber;


    public CommissionEmployee(String firstName, String lastName, String socialNumber) {
        this.firstName = firstName;
        this.lastName = lastName;

        validateSocialNumber(socialNumber);
        this.socialNumber = socialNumber;
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

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        validateSocialNumber(socialNumber);
        this.socialNumber = socialNumber;
    }

    private boolean validateSocialNumber(String socialNumber){
        return socialNumber.length()==9;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialNumber='" + socialNumber + '\'' +
                '}';
    }
}
