package Monday27_03;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average){
        this.name = name;
        if (average >= 0 && average <= 100){
            this.average =average;
        }
        else {
            System.out.println("Your Average is out of range");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
        if (average >= 0 && average <= 100){
            this.average =average;
        }
        else {
            System.out.println("Your Average is out of range");
        }
    }

    public String getLetterGrade(){
        String grade;
        if (average >= 80){
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average>= 60) {
            grade = "C";
        } else if (average>= 50) {
            grade = "D";
        }else {grade = "F";
//            return grade;
    }
        return grade;
    }


}
