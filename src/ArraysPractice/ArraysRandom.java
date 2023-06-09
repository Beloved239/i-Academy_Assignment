package ArraysPractice;

import java.security.SecureRandom;

public class ArraysRandom {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int[] frequency = new int[7];
        for (int roll = 1; roll <=6000000; roll++){
            ++frequency[ 1+secureRandom.nextInt(6)];
        }
        System.out.printf("%s%10s%n","Face", "Value");
        for (int face =1; face< frequency.length; face++){
            System.out.printf("%5d%10d%n",face,frequency[face]);
        }
    }
}
