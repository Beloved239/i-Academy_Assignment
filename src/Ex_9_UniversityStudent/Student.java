package Ex_9_UniversityStudent;

public class Student extends Date {
    /**
     * This is SuperClass for University Student
     * 1. Undergraduate student(FreshMan, Sophomore, Junior and Senior)
     * 2. Graduate Student(Master Student, Doctoral Student)
     *
     */
    private String firstName;
    private String lastName;
    private String birthDate;
    private int age;
    private Gender gender;
    private String stateOfOrigin;
    private String faculty;
    private String department;


    public Student(String day, String month, int year, String firstName, String lastName, String birthDate, int age, Gender gender, String stateOfOrigin, String faculty, String department) {

        super(day, month, year);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age = age;
        this.gender = gender;
        this.stateOfOrigin = stateOfOrigin;
        this.faculty = faculty;
        this.department = department;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDepartment() {
        return department;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", stateOfOrigin='" + stateOfOrigin + '\'' +
                ", faculty='" + faculty + '\'' +
                ", department='" + department + '\'' +
                super.toString()+ ", "+
                "Age is  "+super.displayAge()+
                '}';
    }
}
