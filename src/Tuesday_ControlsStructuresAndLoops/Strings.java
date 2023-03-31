package Tuesday_ControlsStructuresAndLoops;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Strings {

//immutable Java CLass
    //you enter your instance variable, and getter method,
    //setters will be set in your constructors


    //String.valueOf== to convert anything to Strings



    public static void main(String[] args) {
        String name ="iacademy";
        String anotherWay = new String("iacademy");
        System.out.println(name==anotherWay);
        System.out.println(name.equals(anotherWay));


        System.out.println(name.trim());
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(anotherWay.length());
        System.out.println(anotherWay.charAt(2));
        System.out.println(anotherWay.toUpperCase());
        System.out.println(anotherWay.substring(1));
        System.out.println(anotherWay.substring(1,4));

        //ASCii values

        String testString = new String();
        testString = "that is, printf displays the value with at least 20 character positions. If the\n" +
                "value to be output is less than 20 character positions wide";

        System.out.println('a'+ 20);

        System.out.println(testString.indexOf("m"));
        System.out.println(testString.lastIndexOf("m"));
        System.out.println(anotherWay.replace("b","v"));

        for (int i=0; i<anotherWay.length(); i++){
            System.out.println(anotherWay.charAt(i));
        }

        System.out.println();
        System.out.println(isUnique("chidinma"));

        //implement an algorithm to determine if a string has all unique characters
        //What if you cannot use additional data structures

       /*
       check the index char i through iacademy
        */




    }
    public static boolean isUnique(String test) {


        Scanner good = new Scanner(System.in);

        System.out.println("Enter a String");
        test = good.nextLine();
        if (test.length() == 0 || test.length() == 1) {
            return true;
        }
        /*
        create a loop to iterate through the whole string
        create a variable to hold the current character
        take a substring of the string from i+1
        check if the current character exist in the substring

         */



        for (int i = 0; i < test.length(); i++) {
            char currentCharacter = test.charAt(i);
            return !test.substring(i + 1).contains(String.valueOf(currentCharacter));

        }
        return true;
    }

    public static boolean isUniqueUsingArray(String test){
        /**
         * convert string to character Array
         * sort the array using a custom method(iacademy - aacdeimy)
         */
        char[] strArray = test.toCharArray();
        Arrays.sort(strArray);
        for (int i=0; i<strArray.length-1; i++){
            if (strArray[i]==strArray[i+1]){
                return false;
            }
        }
        return true;
    }


    public static boolean isUniqueUsingContains(String test){
        for (int i = 0; i < test.length(); i++) {
            char currentCharacter = test.charAt(i);
            int locationOfCurrentCharacter = test.substring(i + 1).indexOf(currentCharacter);
            if (locationOfCurrentCharacter != 1) {
                return false;
            }
        }
        return true;
    }
}
