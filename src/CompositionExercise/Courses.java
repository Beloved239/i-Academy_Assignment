package CompositionExercise;

public class Courses {
    private String courseTitle;
    private Double courseMark;

    public Courses(String courseTitle, Double courseMark) {
        this.courseTitle = courseTitle;
        this.courseMark = courseMark;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Double getCourseMark() {
        return courseMark;
    }

    public void setCourseMark(Double courseMark) {
        this.courseMark = courseMark;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseTitle='" + courseTitle + '\'' +
                ", courseMark=" + courseMark +
                '}';
    }
}
