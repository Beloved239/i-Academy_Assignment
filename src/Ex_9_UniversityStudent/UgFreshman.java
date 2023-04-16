package Ex_9_UniversityStudent;

public class UgFreshman extends Student{
    private int numberOfCourses;
    private double gpa;
    private String matriculationNumber;


    public UgFreshman(String day, String month, int year, String firstName, String lastName, String birthDate, int age, Gender gender, String stateOfOrigin, String faculty, String department, int numberOfCourses, double gpa, String matriculationNumber) {
        super(day, month, year, firstName, lastName, birthDate, age, gender, stateOfOrigin, faculty, department);
        this.numberOfCourses = numberOfCourses;
        this.gpa = gpa;
        this.matriculationNumber = matriculationNumber;
    }


    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    @Override
    public String toString() {
        return "UgFreshman{" +
                super.toString()+
                "numberOfCourses= " + numberOfCourses +
                ", gpa= " + gpa +
                ", matriculationNumber= '" + matriculationNumber + '\'' +
                '}';
    }
}
