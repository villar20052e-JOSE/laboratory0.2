import java.util.Scanner; //importamos la clase scaanner 

public class Areyouoflegalage{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creamos el objeto Scanner para leer datos desde el teclado
        String option;

        do {  //ciclo repetitivo 
        System.out.print("Enter your Age"); //pedimos al usuario que ingrese su edad 
        int age = sc.nextInt();

        if (age <0){ //estructura condicional(desicition)
            System.out.println("Invalid Age"); //validamos primero si la edad es negativa
        } else if (age>=60){
            System.out.println("you are an older adult ");//luego validamos si es adulto mayor de 60 años o mas 
        } else if (age>=18){
           System.out.println("you are of legal age "); // aca validamos si es mayor de edad o hasta los 59 años
        } else {
            System.out.println("you are underage "); //si no cumple  ninguna de las anteriores en menor de edad 
        }

        System.out.print("Do you want to continue? (yes/no):");
        option = sc.next();

    } while (option.equalsIgnoreCase("yes")); //condiciones de repetir y equal compara texto sin importar la mayuscula/minsucula

    System.out.println("Program finished.");
        sc.close(); //cerramos el scanner 
    }
}
