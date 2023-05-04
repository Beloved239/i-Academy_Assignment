package ArraysPractice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleInput = scanner.nextDouble();

        System.out.print("Enter a string: ");
        String stringInput = scanner.nextLine();

        scanner.close();

        System.out.printf("String: %s\n", stringInput);
        System.out.printf("Double: %.1f\n", doubleInput);
        System.out.printf("Integer: %d\n", integerInput);
    }
}
