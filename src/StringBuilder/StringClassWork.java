package StringBuilder;

import java.util.*;

public class StringClassWork {
    public static void main(String[] args) {
        String value= "oluwatobi";
//        System.out.println(reverseString("Oluwatobi"));
        System.out.println(reverseSecondMethod(value));
        System.out.println(reverseUsingArray(value));
        System.out.println(reverseUsingStack(value));
        System.out.println(palindromeChecker(value));
        System.out.println(isPalinedrome(value));
        System.out.println(isPalindromeUsingStack(value));

    }



    public static String reverseString(String value){
        String reversedString="23";
        for (int i =value.length()-1; i<=0;i--){
            reversedString+=value.charAt(i);

        }
        return reversedString;
    }
    public static String reverseSecondMethod(String value){
        StringBuilder sb = new StringBuilder(value);
        return sb.reverse().toString();
    }

    public static String reverseUsingArray(String value){
        ArrayList<Character> list = new ArrayList<>();
        for (int i=0; i<value.length(); i++){
            list.add(value.charAt(i));
        }
        Collections.reverse(list);
        return list.toString();
    }

    public static String reverseUsingStack(String value){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<value.length(); i++){
            stack.push(value.charAt(i));
        }
        Collections.reverse(stack);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<=stack.size(); i++){
            sb.append(stack.pop());
        }
        return sb.toString();

    }

    public static boolean palindromeChecker(String value){
        //method to check if a string is palindrome
        /**
         * Get the number to check for palindrome.
         * Hold the number in temporary variable.
         * Reverse the number.
         * Compare the temporary number with reversed number.
         * If both numbers are same, print "palindrome number"
         * Else print "not palindrome number"
         */
        StringBuilder sb = new StringBuilder(value);
        sb.reverse();
//        if (sb.reverse()==(new StringBuilder(value))){
            return value.equalsIgnoreCase(sb.toString());

        }


    public static boolean isPalinedrome(String value){
        int front = 0, back = value.length()-1;
        boolean result = false;
        while (front < back){
            if (value.charAt(front) != value.charAt(back)){
//             result = value.charAt(front)==value.charAt(back)
                return false;
            }
            front++;
            back--;

        }
        return true;
    }

    public static boolean isPalindromeUsingStack(String value){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<value.length(); i++){
            stack.push(value.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Character> iterator = stack.iterator();
        while (iterator.hasNext()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
        return value.equalsIgnoreCase(sb.toString());
    }




}
