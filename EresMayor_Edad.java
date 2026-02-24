   import java.util.Scanner;

public class EresMayor_Edad {
 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Edad no válida.");
        } else if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        sc.close();
    }
}

