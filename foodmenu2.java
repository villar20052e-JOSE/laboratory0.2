import java.util.Scanner;

public class foodmenu2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Mostramos el menú al usuario
    System.out.println("--- BIENVENIDO AL RESTAURANTE ---");
    System.out.println("1. Pizza");
    System.out.println("2. Hamburguesa");
    System.out.println("3. Tacos");
    System.out.println("4. Ensalada");
    System.out.println("5. costillitas");
    System.out.println("6. bistec picado");
    System.out.println("7. papas fritas");
    System.out.println("8. patacones");
    System.out.println("9. aros de cebolla");
    System.out.println("10. alitas BBQ");
    System.out.print("Por favor, selecciona una opción (1-10): ");

    int opcion = teclado.nextInt();

    // Estructura switch para decidir qué mostrar
    switch (opcion) {
      case 1:
        System.out.println("Has elegido: Pizza. ¡Excelente elección italiana!");
        break;
      case 2:
        System.out.println("Has elegido: Hamburguesa. ¡Viene con papas fritas!");
        break;
      case 3:
        System.out.println("Has elegido: Tacos. ¡Cuidado, la salsa pica!");
        break;
      case 4:
        System.out.println("Has elegido: Ensalada. ¡Muy saludable!");
        break;
      default:
        System.out.println("Opción no válida. Por favor, reinicia el programa.");
        break;
    }

    System.out.println("¡Gracias por visitarnos!");
    teclado.close();
  }
}
