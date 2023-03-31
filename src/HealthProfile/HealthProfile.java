package HealthProfile;

public class HealthProfile {

        private String firstName;
        private  String lastName;
        private String birthDay;
        private  String birthMonth;
        private int birthYear;
        private String gender;
        private double height;
        private double weight;

//        public HeartRate (String firstName, String lastName, String birthDay,String birthMonth, int birthYear){
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.birthDay = birthDay;
//            this.birthMonth = birthMonth;
//            this.birthYear = birthYear;
//        }

        public HealthProfile (String firstName,String lastName,String gender,double height, double weight, String birthDay, String birthMonth, int birthYear){
            this.firstName =firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.height = height;
            this.weight = weight;
            this.birthYear= birthYear;
            this.birthMonth = birthMonth;
            this.birthDay = birthDay;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String displayBirth(){
       String birth= getBirthDay()+"/"+getBirthMonth()+"/"+getBirthYear();
            return birth;
    }

    public String displayGender(){
            String gender = getGender();
            return gender;
    }

    public String displayName(){
            String name = getFirstName()+" "+getLastName();
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

        public  double displayBMI(){
            double BMI = (getWeight())/(getHeight()*getHeight());
            return BMI;
        }

        public  String displayBMIChart(){
            String BMIChart= "Underweight = BMI<18.5"+" " +
                    "Normal weight = BMI 18.5-24.9"+" " +
                    "Overweight = BMI 25-29.9"+ " " +
                    "obesity = BMI=>30";
            return BMIChart;

        }
    }

