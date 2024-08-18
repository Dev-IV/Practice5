import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of meters: ");
        double meters = scanner.nextDouble();

        System.out.println("Choose the unit to convert to:");
        System.out.println("1. Miles");
        System.out.println("2. Inches");
        System.out.println("3. Yards");
        System.out.print("Your choice (enter the number): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double miles = meters * 0.000621371;
            System.out.printf("%.2f meters = %.2f miles%n", meters, miles);
        } else if (choice == 2) {
            double inches = meters * 39.3701;
            System.out.printf("%.2f meters = %.2f inches%n", meters, inches);
        } else if (choice == 3) {
            double yards = meters * 1.09361;
            System.out.printf("%.2f meters = %.2f yards%n", meters, yards);
        } else {
            System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
        scanner.close();
    }
}
