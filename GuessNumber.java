import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int SecretNumber= 23;
        int Attemps = 0;

        System.out.println("adivinanumero el numerosecreto(1 al 50)");
        
        do {
            System.out.print("ingrsa un numero:");
            Attemps= entrada.nextInt();

            if (Attemps == SecretNumber){
                System.out.println("el numero es correcto");
            } else if (Attemps < SecretNumber) {
                System.out.println("el numero es muy bajo");
            } else {
                System.out.println("el numero es muy alto");
            }

        } while(Attemps != SecretNumber);

        entrada.close();
    }  

}