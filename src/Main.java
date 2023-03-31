public class Main {


    public static void main(String[] args) {
        Account noahAccount = new Account();
        Account chidinmaAccount = new Account();
        Account ridohAccount = new Account();

        System.out.println("Displaying default values");
        chidinmaAccount.displayMessage();

        chidinmaAccount.setAccountName("Chidinma Afogu");
        chidinmaAccount.setAccountNumber("0011223344");
        chidinmaAccount.setAccountBalance(50000);
        chidinmaAccount.setEmail("chidi@gmail.com");
        chidinmaAccount.setGender("Female");
        chidinmaAccount.setStatus(true);
        chidinmaAccount.setHouseNumber(82);

        chidinmaAccount.displayMessage();


        System.out.println("Displaying default values");
        noahAccount.displayMessage();

        noahAccount.setAccountName("Noah James");
        noahAccount.setAccountNumber("223344556677");
        noahAccount.setAccountBalance(90000);
        noahAccount.setEmail("noah@gmail.com");
        noahAccount.setGender("Male");
        noahAccount.setStatus(true);
        noahAccount.setHouseNumber(82);

        noahAccount.displayMessage();

    }
}