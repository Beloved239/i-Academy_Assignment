package ArraysPractice;

public class GradBook {
    String courseName;
    private int[][] grades;


    public GradBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int[][] getGrades() {
        return grades;
    }

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    public void processGrades(){
        outputGrade();

//        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(),getMaximum());
        outputBarchart();
    }

    public int getMinimum(){
        int lowGrade = grades[0][0];

        for (int[] studentGrades: grades){
            for (int grade: studentGrades)
            if (grade<lowGrade){
                lowGrade=grade;
            }
        }
        return lowGrade;
    }


    public int getMaximum(){
        int highGrade = grades[0][0];

        for (int[] studentgrade : grades){
            for (int grade : studentgrade)
            if (grade > highGrade){
                highGrade = grade;
            }
        }
        return highGrade;
    }


    public double getAverage(int[] setOfGrades){
        double total =0;

        for (int grade: setOfGrades){
            total += grade;
        }
        return total/setOfGrades.length;
    }

    public void outputBarchart(){
        System.out.println("Grade Distribution");

        int[] frequency = new int[11];

        for (int[] studentgrade: grades){
            for (int grade: studentgrade)
            ++frequency[grade/10];
        }
        for (int count=0; count< frequency.length; count++){
            if (count==10){
                System.out.printf("%5d", 100);
            }
            else System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            for (int star =0; star<frequency[count]; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void outputGrade(){
        System.out.printf("The grades are:%n%n");
        System.out.print("             ");

        for (int test = 0; test< grades[0].length; test++){
            System.out.printf("Test %d  ", test + 1);
        }
        System.out.println("Average");
        for (int student = 0; student< grades.length; student++){
            System.out.printf("Student %sd", student + 1);
            for (int test : grades[student]){
                System.out.printf("%8d", test);
            }
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);

        }


//        for (int student=0; student< grades.length; student++){
//            System.out.printf("Student %2d: %3d%n",student+1, grades[student]);
//        }

    }


}
