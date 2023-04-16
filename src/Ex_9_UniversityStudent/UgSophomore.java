package Ex_9_UniversityStudent;

public class UgSophomore extends Student {
    private String matriculationNumber;
    private int numberOfCourses;
    private double gpa;
    private int numberOfScholarship;

    public UgSophomore(String day, String month, int year, String firstName, String lastName, String birthDate, int age, Gender gender, String stateOfOrigin, String faculty, String department, String matriculationNumber, int numberOfCourses, double gpa, int numberOfScholarship) {
        super(day, month, year, firstName, lastName, birthDate, age, gender, stateOfOrigin, faculty, department);
        this.matriculationNumber = matriculationNumber;
        this.numberOfCourses = numberOfCourses;
        this.gpa = gpa;
        this.numberOfScholarship = numberOfScholarship;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public double getGpa() {
        return gpa;
    }

    public int getNumberOfScholarship() {
        return numberOfScholarship;
    }

    @Override
    public String toString() {
        return "UgSophomore{" +
                super.toString()+
                "matriculationNumber='" + matriculationNumber + '\'' +
                ", numberOfCourses=" + numberOfCourses +
                ", gpa=" + gpa +
                ", numberOfScholarship=" + numberOfScholarship +
                '}';
    }
}
