package ArraysPractice;

public class InitArray2D {
    public static void main(String[] args) {
        int[][] array1 = {{1,2,3},{4,5,6}};
        int[][] array2 ={{1,2},{3},{4,5,6}};

        System.out.printf("Values in Array1 by row is %n");
        outputArray(array1);

        System.out.printf("Values in Array2 by row is %n");
        outputArray(array2);

    }

    public static void outputArray(int[][] array){
        for (int row=0; row< array.length; row++){
            for (int colomn =0; colomn<array[row].length;colomn++){
                System.out.printf("%d ",array[row][colomn]);
            }
            System.out.println();
        }


    }
}
