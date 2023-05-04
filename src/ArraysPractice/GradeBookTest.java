package ArraysPractice;

public class GradeBookTest {
    public static void main(String[] args) {
        int[][] score1 ={{78,67,98,100,67,88,97,90},{78,67,76,87,98,80,67,88,97,90}};
//        int[] score2 ={78,67,98,100,67,88,97,90};

        GradBook mrJohn = new GradBook("Level 1 Student ",score1);
        mrJohn.processGrades();
    }
}
