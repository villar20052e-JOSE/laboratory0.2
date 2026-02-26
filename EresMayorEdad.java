import java.util.Scanner; //importamos la clase scaanner 

public class EresMayorEdad{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner para leer datos desde el teclado

        System.out.print("Enter your Age"); //pedimos al usuario que ingrese su edad 
        int age = sc.nextInt();

        if (age <0){ //
            System.out.println("Invalid Age"); //validamos primero si la edad es negativa
        } else if (age>=60){
            System.out.println("you are an older adult ");//luego validamos si es adulto mayor de 60 años o mas 
        } else if (age>=18){
           System.out.println("you are of legal age "); // aca validamos si es mayor de edad o hasta los 59 años
        } else {
            System.out.println("you are underage "); //si no cumple  ninguna de las anteriores en menor de edad 
        }
        sc.close(); //cerramos el scanner 
    }
}
