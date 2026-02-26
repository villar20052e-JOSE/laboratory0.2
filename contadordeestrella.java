import java.util.Scanner;

public class contadordeestrella {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la altura del arbol");
        int altura = sc.nextInt();


<<<<<<< HEAD
        for (int i = 1; < = numero; i++) {
            System.out.print("*");
=======
        for (int i = 1; i <= altura; i++) {
            // espacios
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");

            }

            // estrellas
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");

            }
            System.out.println();+
>>>>>>> e3a68afe5e4c16616f84d3a08431ed28ef91a01f

        
        }

        sc. close();
    }
}