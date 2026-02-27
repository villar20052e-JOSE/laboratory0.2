import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int SecretNumber = random.nextInt(30) + 1;

        int Attemps = 0;
        int contador = 0;

        System.out.println("adivinanumero el numerosecreto(1 al 30)");

        do {
            System.out.print("ingresa un numero:");
            Attemps = entrada.nextInt();
            contador++;

            if (Attemps == SecretNumber) {
                System.out.println(" ¡Correcto! adivinaste el numero felicidades");
            } else if (Math.abs(Attemps - SecretNumber) <= 5) {
                System.out.println("¡Estás cerca del numero!");
            } else if (Attemps < SecretNumber) {
                System.out.println("el numero es muy bajo");
            } else {
                System.out.println("el numero es muy alto");
            }

        } while (Attemps != SecretNumber);

        System.out.println("intentos realizados:" + contador);

        entrada.close();
    }

}