package Ex_9_UniversityStudent;

public class GradDoctoralStudent extends GradMastersStudent{
    private String supervisor;

    public GradDoctoralStudent(String day, String month, int year, String firstName, String lastName, String birthDate, int age, Gender gender, String stateOfOrigin, String faculty, String department, String faculty1, String department1, String thesisTopic, int yearOfStudy, String supervisor) {
        super(day, month, year, firstName, lastName, birthDate, age, gender, stateOfOrigin, faculty, department, faculty1, department1, thesisTopic, yearOfStudy);
        this.supervisor = supervisor;
    }


    public String getSupervisor() {
        return supervisor;
    }

    @Override
    public String toString() {
        return "GradDoctoralStudent{" +
                super.toString()+
                "supervisor='" + supervisor + '\'' +
                '}';
    }
}
