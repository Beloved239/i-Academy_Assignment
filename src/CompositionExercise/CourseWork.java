package CompositionExercise;

public class CourseWork extends Courses{
    private double quiz;
    private double test;
    private String project;


    public CourseWork(String courseTitle, Double courseMark, double quiz, double test, String project) {
        super(courseTitle, courseMark);
        this.quiz = quiz;
        this.test = test;
        this.project = project;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getTest() {
        return test;
    }

    public void setTest(double test) {
        this.test = test;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "CourseWork{" +super.toString()+
                "quiz=" + quiz +
                ", test=" + test +
                ", project='" + project + '\'' +
                '}';
    }
}
