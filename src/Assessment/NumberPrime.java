package Assessment;

public class NumberPrime {
    public static void main(String[] args) {
//        isPrime(5);
        displayPrimeNumbers(100);

    }
    public static boolean isPrime(int number){
        if (number<2){
            return false;
        }
        if (number%2==0){
            return false;
        }
        int root = (int) Math.sqrt(number);
        for (int i = 2; i<= root; i++){
            if (number%i==0){
//                System.out.println(i);
                return false;
            }
        }
        return true;
    }

    public static void displayPrimeNumbers(int number){
        int count =0;
        for (int i= 0; i<=number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;

            }
        }
        System.out.println("Total number of Prime number is: "+count);
    }



}
