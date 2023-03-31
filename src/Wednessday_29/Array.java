package Wednessday_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    /**
     * creating an Array
     * Access specific elements in array
     * change element of an array
     * array lenght
     * loop through an array
     */
    public static void main(String[] args) {

        String[] namesOfStudents = new String[10];
        System.out.println(namesOfStudents.length);


        namesOfStudents = new String[]{"tobi", "oyin", "sarah", "noah", "chidinma", "ridoh", "kenny", "pelumi", "adeolu", "moses"};
        System.out.println(namesOfStudents[4]);
        System.out.println(namesOfStudents[0]);
        namesOfStudents[0] = "musa";
        System.out.println(namesOfStudents[0]);


        //USe Array.toString to print values in array because array is working as an object.
        System.out.println(Arrays.toString(namesOfStudents));

        System.out.println("This method uses Loop to print elements of the array");
        for (int i = 0; i < namesOfStudents.length; i++) {
            System.out.print(namesOfStudents[i] + ", ");
        }


        System.out.println("This is creating array of integer");
        int[] intNum = new int[4];
        System.out.println("the size of the int array is: " + intNum.length);

        intNum = new int[]{5, 4, 2, 1};

        System.out.println("Permutation using ASCII value method");

        System.out.println(isPermutation("team", "meat"));

        System.out.println("Using Sorting method");

        System.out.println(isPermutation2("tobi", "ibot"));


        System.out.println("Class Work");

        System.out.println(isReplacing("Mr John Smith  "));


        System.out.println("Using other method");

        System.out.println(urlify("Mr John Smith  "));

        System.out.println(urlify2("1Mr John Smith   "));
        System.out.println();



    }

    public static boolean isPermutation(String str1, String str2) {
//        str1 = "team";
//        str2 = "mzae";
        int sum1 = 0;
        int sum2 = 0;

//        str1.toCharArray();
//        str2.toCharArray();


        char[] str1ToArray = str1.toCharArray();
        char[] str2ToArray = str2.toCharArray();

//        char[] ch = new char[str1.length()];
//        char[] ch2 = new char[str2.length()];

        for (int i = 0; i < str1ToArray.length; i++) {

            sum1 += str1ToArray[i];

        }
        for (int i = 0; i < str2ToArray.length; i++) {

            sum2 += str2ToArray[i];
        }

        return sum1 == sum2;
    }

    public static boolean isPermutation2(String str1, String str2) {
        /**
         * convert both strings to charArray
         * Arrays.sort to sort both arrays
         * convert arrays to string
         * if both sorted arrays are equal
         */
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] str1ToArray = str1.toCharArray();
        char[] str2ToArray = str2.toCharArray();
        Arrays.sort(str1ToArray);
        Arrays.sort(str2ToArray);

        String firstArrayToString = Arrays.toString(str1ToArray);
        String secondArrayToString = Arrays.toString(str2ToArray);

        return firstArrayToString.equals(secondArrayToString);
    }


    public static String isReplacing(String str) {

        char [] urlArray = str.trim().toCharArray();
        List<String> list = new ArrayList<>();


//        String replaced;
        str = "Mr John Smith  ";

        String strTrim = str.trim();


        char ch = '-';
        char newCh = 20;


        for (int i = 0; i < strTrim.length(); i++) {
            if (strTrim.charAt(i) == ch) {
                strTrim.replace(' ', newCh);

            }
            return strTrim.replace(' ',newCh);

                    }
        return strTrim;
    }

    public static String urlify(String str){
        char[] urlArray = str.trim().toCharArray();
        List<String> list = new ArrayList<>();
        for (int i=0; i< urlArray.length; i++){
            if (urlArray[i] == ' '){
                list.add("%20");
            }
            list.add(Character.toString(urlArray[i]));
        }
        StringBuilder result = new StringBuilder();
        for (int i=0; i< list.size(); i++){
            result.append(list.get(i));
        }
        return result.toString().replaceAll(" ","");
    }

    public static String urlify2(String str){
        return str.trim().replaceAll(" ","%20");
    }
    }




