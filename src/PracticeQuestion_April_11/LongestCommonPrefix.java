package PracticeQuestion_April_11;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs = new String("Welcome");
        String[] names = {"Oluwatobi", "Adebanjo", "Java", "Developer"};
        Arrays.toString(names);
        String name = "Seun";
        String name2 = "Busuyi";
//        name +="Olubanjo";
//        System.out.println(name);
        StringBuilder stbu = new StringBuilder(name);
        stbu.append(Arrays.toString(names));
//        System.out.println(stbu.charAt(10));
        System.out.println(stbu);

        System.out.println(Objects.equals(name,stbu));

        String str6 = "Scaler by InterviewBit";
// split string from space
        String[] result = str6.split(" ");
        for (int i=0; i < result.length; i++)
        {
            System.out.println(result[i]);
        }
//        System.out.println(names.toString());

//        System.out.println(name.length());

//        System.out.println(stbu.capacity());

//        stbu.substring(0,3);
//        System.out.println(stbu);


//        System.out.println(names[0] + " " + names[1]);

        String strss = "Welcome";
        name = "firstname";
//        String name2 = "Firstn";

//        System.out.println(name.equalsIgnoreCase(name2));
//        System.out.println(name.equals(name2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.isBlank());
//        System.out.println(name.isEmpty());

        String str = "Scaler";
        String str1 = "InterviewBit";
        String str2 = "Scaler";
//        System.out.println(str1.compareTo(str));
//        System.out.println(str.equals(str1) + " " + str.equals(str2));

        String str4 = "InterviewBit".replace("e", " ");
//        System.out.println(str4);
    }


}
