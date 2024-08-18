import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter '1' for sum or '2' for product: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            int sum = num1 + num2 + num3;
            System.out.println("Sum: " + sum);
        } else if (choice == 2) {
            int product = num1 * num2 * num3;
            System.out.println("Product: " + product);
        } else {
            System.out.println("Invalid choice. Please enter '1' or '2'.");
        }
        scanner.close();
    }
}

