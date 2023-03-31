package Monday27_03;

public class EvenAndOld {

    public static void displayNumberBetween1aAnd10(){
        for (int i=1; i<=10; i++ ){

            System.out.println(i);
            if (i==5){
                break;
            }
        }
    }


    public static void main(String[] args) {
        int even;
        int odd;
        System.out.println("Even Numbers between 1 and 100 are: ");

            for (even = 2; even <= 100; even += 2) {
                System.out.print(even + " ");

            }


        System.out.println();

            System.out.println("The Odd Numbers between 1 and 100 are: ");
            for (odd = 1; odd <= 100; odd += 2) {
                System.out.print(odd + " ");

//            if (even%2==0);{
//                System.out.println("Odd numbers are " +even);
//            }
//
//            if (even%2==1);{
//                System.out.println("Even numbers are "+even);
//            }

            }
            }
        }

