package HeartRateCalculator;

public class HeartRate {
    private String firstName;
    private  String lastName;
    private String birthDay;
    private  String birthMonth;
    private int birthYear;
    private String gender;
    private double height;
    private double weight;

    public HeartRate (String firstName, String lastName, String birthDay,String birthMonth, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

//    public Hea (String firstName,String lastName,String gender,double height, double weight, String birthDay, String birthMonth, int birthYear){
//        this.firstName =firstName;
//        this.lastName = lastName;
//        this.gender = gender;
//        this.height = height;
//        this.weight = weight;
//        this.birthYear= birthYear;
//        this.birthMonth = birthMonth;
//        this.birthDay = birthDay;
//    }

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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String displayName(){
        String name = getFirstName()+" "+getLastName()+" "+getBirthDay()+"/"+getBirthMonth()+" "+getBirthYear();
        return name;
    }

    public int displayAge(){
        int messageAge = 2023-getBirthYear();
        return messageAge;
    }

    public int displayHeartRate(){
        int messageHeartRate = 220- displayAge();
        return messageHeartRate;
    }

    public double displayMaxTargetHeartRate(){
        double maxTargetHeartRate = 0.850* displayHeartRate();
        return maxTargetHeartRate;
    }

    public  double displayMinTargetHeartRate(){
        double minTargetHeartRate = 0.50* displayHeartRate();
        return minTargetHeartRate;
    }
}
