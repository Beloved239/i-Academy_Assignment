package Ex_8_SavingsAccount;

public class TestSavings {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount("Oluwatobi","Adebanjo",12_000);
        System.out.println(saver1.toString());

        SavingsAccount saver2 = new SavingsAccount("Olayiwola", "Jumoke",1000);
        System.out.println(saver2.toString());
        System.out.println(saver2.monthlyRateFromJanuary(12_000,0.4));
    }


}
