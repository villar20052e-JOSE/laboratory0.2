import java.util.Scanner;

public class AreYouLegal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String option = "yes"; // Inicializamos para que el ciclo comience

        while (option.equalsIgnoreCase("yes")) {

            System.out.print("Enter your Age: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // consume el texto incorrecto
                continue;  // vuelve al inicio del while
            }

            int age = sc.nextInt();

            if (age < 0) {
                System.out.println("Invalid Age");
            } else if (age >= 18) {
                System.out.println("You are of legal age");
            } else {
                System.out.println("You are underage");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            option = sc.next();
        }

        System.out.println("Program finished.");
        sc.close();
    }
}