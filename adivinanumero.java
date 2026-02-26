import java.util.Scanner;
public class adivinanumero {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numerosecreto= 23;
        int intentos = 0;
        System.out.println("adivinanumero el numerosecreto(1 al 30)");
        
        do {
            System.out.print("ingrsa un numero:");
            intentos= entrada.nextInt();

            if (intentos == numerosecreto){
                System.err.println("el numero es correcto");
            } else {
                System.out.println("el nuemro es incorecto");
            }

        } while(intentos != numerosecreto);

        entrada.close();
    }  

}