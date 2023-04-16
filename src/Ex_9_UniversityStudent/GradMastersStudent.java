package Ex_9_UniversityStudent;

public class GradMastersStudent extends Student{
    private String faculty;
    private String department;
    private String thesisTopic;
    private int yearOfStudy;

    public GradMastersStudent(String day, String month, int year, String firstName, String lastName, String birthDate, int age, Gender gender, String stateOfOrigin, String faculty, String department, String faculty1, String department1, String thesisTopic, int yearOfStudy) {
        super(day, month, year, firstName, lastName, birthDate, age, gender, stateOfOrigin, faculty, department);
        this.faculty = faculty1;
        this.department = department1;
        this.thesisTopic = thesisTopic;
        this.yearOfStudy = yearOfStudy;
    }


    @Override
    public String getFaculty() {
        return faculty;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public String toString() {
        return "GradMastersStudent{" +
                "faculty='" + faculty + '\'' +
                ", department='" + department + '\'' +
                ", thesisTopic='" + thesisTopic + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}
