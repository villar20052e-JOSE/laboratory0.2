import java.util.Scanner;

public class FoodMenu {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variable para controlar si el usuario quiere seguir comprando
    boolean continuar = true;

    // EL BUCLE DO-WHILE HACE QUE EL PROGRAMA SEA DINÁMICO
    do {
      // Variables para la factura
      String facturaPlato = "";
      String facturaBebida = "Ninguna"; // Inicializada por si no elige
      String facturaExtra = "";
      double total = 0;

      System.out.println("============================================");
      System.out.println("      ¡BIENVENIDO AL GARAJE DEL SABOR!      ");
      System.out.println("============================================\n");

      // 1. PLATO PRINCIPAL
      System.out.println("--- MENÚ DE PLATOS PRINCIPALES ---");
      System.out.println("1. Hamburguesa");
      System.out.println("2. Pizza");
      System.out.println("3. Salchipapas ($6.50)");
      System.out.println("4. Hot Dog ($2.00)");
      System.out.println("5. Alitas BBQ ($8.50)");
      System.out.println("6. Pollo Apanado ($3.50)");
      System.out.println("7. Pollo Asado ($5.00)");
      System.out.println("0. Salir del programa"); // NUEVA OPCIÓN
      System.out.print("Seleccione su plato: ");
      int plato = sc.nextInt();

      // Lógica para salir
      if (plato == 0) {
        continuar = false;
        System.out.println("Saliendo... ¡Que tenga un buen día!");
        continue; // Salta directamente al final del do-while
      }

      switch (plato) {
        case 1: // HAMBURGUESA
          System.out.print("¿De (1) Carne o (2) Pollo?: ");
          int tipoH = sc.nextInt();
          System.out.print("¿(1) Normal ($6.00) o (2) Doble Carne ($8.50)?: ");
          int tamanoH = sc.nextInt();
          facturaPlato = (tipoH == 1 ? "Hamburguesa de Carne" : "Hamburguesa de Pollo");
          if (tamanoH == 2) {
            facturaPlato += " Doble";
            total += 8.50;
          } else {
            total += 6.00;
          }
          break;

        case 2: // PIZZA
          System.out.println("Sabores: (1) Peperoni ($5.00), (2) Queso ($3.50), (3) Combinación ($8.50)");
          int saborP = sc.nextInt();
          switch (saborP) {
            case 1:
              facturaPlato = "Pizza Peperoni";
              total += 5.00;
              break;
            case 2:
              facturaPlato = "Pizza Queso";
              total += 3.50;
              break;
            case 3:
              facturaPlato = "Pizza Combinación";
              total += 8.50;
              break;
            default:
              System.out.println("Sabor no reconocido, se asignará Pizza Básica.");
              facturaPlato = "Pizza Genérica";
              total += 4.00;
              break;
          }
          break;

        case 3:
          facturaPlato = "Salchipapas";
          total += 6.50;
          break;
        case 4:
          facturaPlato = "Hot Dog";
          total += 2.00;
          break;
        case 5:
          facturaPlato = "Alitas BBQ";
          total += 8.50;
          break;
        case 6:
          facturaPlato = "Pollo Apanado";
          total += 3.50;
          break;
        case 7:
          facturaPlato = "Pollo Asado";
          total += 5.00;
          break;
        default: // CASO PARA NÚMERO QUE NO APARECE
          System.out.println("Opción de plato no válida. Se marcará como Orden Especial.");
          facturaPlato = "Orden Especial";
          total += 5.00;
          break;
      }

      // 2. ACOMPAÑAMIENTO
      System.out.println("\n--- ACOMPAÑAMIENTOS ADICIONALES ---");
      System.out.println("1. Papas fritas ($2.50)");
      System.out.println("2. Patacones ($2.50)");
      System.out.println("3. Yuca ($2.00)");
      System.out.println("4. Ninguno");
      System.out.print("Seleccione extra: ");
      int extra = sc.nextInt();
      switch (extra) {
        case 1:
          facturaExtra = "Papas fritas";
          total += 2.50;
          break;
        case 2:
          facturaExtra = "Patacones";
          total += 2.50;
          break;
        case 3:
          facturaExtra = "Yuca";
          total += 2.00;
          break;
        case 4:
          facturaExtra = "Sin adicionales";
          break;
        default:
          System.out.println("Opción inválida, no se añadirán extras.");
          facturaExtra = "Sin adicionales";
          break;
      }

      // 3. BEBIDAS
      System.out.println("\n--- BEBIDAS ---");
      System.out.println("1. Soda ($1.50)");
      System.out.println("2. Jugo Natural ($3.00)");
      System.out.println("3. Limonada ($2.50)");
      System.out.println("4. Agua ($1.00)");
      System.out.println("5. Ninguna");
      System.out.print("Seleccione bebida: ");
      int bebida = sc.nextInt();

      switch (bebida) {
        case 1:
          System.out.print("Sabor: (1) Coca Cola, (2) Pepsi, (3) Fresca: ");
          int tipoS = sc.nextInt();
          facturaBebida = (tipoS == 1 ? "Coca Cola" : (tipoS == 2 ? "Pepsi" : "Fresca"));
          total += 1.50;
          break;
        case 2:
          System.out.print("Sabor: (1) Guayaba, (2) Piña, (3) Frutos Rojos, (4) Naranja: ");
          int tipoJ = sc.nextInt();
          facturaBebida = "Jugo de Fruta";
          total += 3.00;
          break;
        case 3:
          facturaBebida = "Limonada";
          total += 2.50;
          break;
        case 4:
          facturaBebida = "Agua";
          total += 1.00;
          break;
        case 5:
          facturaBebida = "Ninguna";
          break;
        default:
          System.out.println("Opción no válida, no se servirá bebida.");
          facturaBebida = "Ninguna";
          break;
      }

      // 4. GENERAR FACTURA
      System.out.println("\n============================================");
      System.out.println("           FACTURA DE CONSUMO               ");
      System.out.println("============================================");
      System.out.println("Plato Principal:  " + facturaPlato);
      System.out.println("Acompañamiento:   " + facturaExtra);
      System.out.println("Bebida:           " + facturaBebida);
      System.out.println("--------------------------------------------");
      System.out.printf("TOTAL A PAGAR:    $%.2f\n", total);
      System.out.println("============================================");
      System.out.println("   Gracias por preferir El Garaje del Sabor ");
      System.out.println("============================================\n");

      // Preguntar si desea hacer otra orden para que no sea un bucle infinito
      System.out.print("¿Desea realizar otra orden? (1. Sí / 2. No): ");
      int otraVez = sc.nextInt();
      if (otraVez != 1) {
        continuar = false;
      }

    } while (continuar);

    System.out.println("orden cancelada. ¡Vuelva pronto!");
    sc.close();
  }
}