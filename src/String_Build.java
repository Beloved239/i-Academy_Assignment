import java.util.Arrays;
import java.util.Locale;

public class String_Build {
    //String Builder methods
    public static void main(String[] args) {
        String firstName="Afogu";
       StringBuilder sb = new StringBuilder();
       StringBuilder sb1 = new StringBuilder("You are welcome to I-Academy");
       StringBuilder sb2 = new StringBuilder(10);
//       sb1.reverse();
       System.out.println(sb1);

       sb1.toString().toUpperCase(Locale.ROOT);
       sb1.length();
       sb1.capacity();
        System.out.println(sb1.length());
        System.out.println(sb1.capacity());
        sb1.setLength(50);
        System.out.println(sb1);

        //location of characters
        sb1.charAt(12);
        System.out.println(sb1.charAt(5));
        sb1.setCharAt(5,'f');
        System.out.println(sb1);

        char[] testArray = new char[sb1.length()];
        sb1.getChars(4,20,testArray, 0);
        System.out.println(Arrays.toString(testArray));

        //create a method that accept a String as a parameter and reverse a


    }
}
