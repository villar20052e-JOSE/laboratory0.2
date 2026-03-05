import java.util.Scanner;

public class AreYouLegal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String option = "yes"; // Inicializamos para que el ciclo comience
                      //compara dos textos sin importar si es mayuscula o min
        while (option.equalsIgnoreCase("yes")) { //inicio del bucle while 

            System.out.print("Enter your Age: ");

            if (!sc.hasNextInt()) { //validacion de entrada por si el usuario escribe una palabra o letra
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // consume el texto incorrecto
                continue;  // vuelve al inicio del while
            }

            int age = sc.nextInt(); //procesamiento de la edad

            if (age < 0) { //logica de desicion  del valor de edad 
                System.out.println("Invalid Age");
            } else if (age >= 18) {
                System.out.println("You are of legal age");
            } else {
                System.out.println("You are underage");
            }

            System.out.print("Do you want to continue? (yes/no): "); //capture la respuesta del usuario 
            option = sc.next();
        }

        System.out.println("Program finished.");
        sc.close();
    }
}