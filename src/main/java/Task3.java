import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        System.out.print("Enter '1' for maximum, '2' for minimum, or '3' for average: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double max = num1; // Assume num1 is the maximum
            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }
            System.out.println("Maximum: " + max);
        } else if (choice == 2) {
            double min = num1; // Assume num1 is the minimum
            if (num2 < min) {
                min = num2;
            }
            if (num3 < min) {
                min = num3;
            }
            System.out.println("Minimum: " + min);
        } else if (choice == 3) {
            double average = (num1 + num2 + num3) / 3;
            System.out.println("Average: " + average);
        } else {
            System.out.println("Invalid choice. Please enter '1', '2', or '3'.");
        }
        scanner.close();
    }
}

