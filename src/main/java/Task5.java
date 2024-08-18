import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours (0-23): ");
        int hours = scanner.nextInt();

        if (hours >= 0 && hours < 6) {
            System.out.println("Good Night");
        } else if (hours >= 6 && hours < 13) {
            System.out.println("Good Morning");
        } else if (hours >= 13 && hours < 17) {
            System.out.println("Good Day");
        } else if (hours >= 17 && hours < 24) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Invalid input. Please enter a number from 0 to 23.");
        }
        scanner.close();
    }
}

