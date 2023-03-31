package HomeWork;

public class CharacterTimes {
    /**
     * This program determines number of times a given character appears
     * in a string
     *
     * accept a string from the user
     * loop through each character and check number of times it appears
     *
     * OR sort characters
     * and count each character
     */
    public static void main(String[] args) {
        String names = "Oluwatobi";
        char ch = 'o';
        String lowerCaseName = names.toLowerCase();
        int i=0, count=0;

        for (i=0; i<names.length();i++){
            if (lowerCaseName.charAt(i)== ch){
                count++;
            }


        }System.out.println(count);
    }

}
