import java.util.Scanner;

public class FoodMenu {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Variable para controlar si el usuario desea seguir comprando.
    boolean keepGoing = true;

    // El bucle do-while hace que el programa sea dinámico.
    do {
      // Variables para la factura
      String mainDishInvoice = "";
      String drinkInvoice = "Ninguna"; // Inicializado por si no se elige ninguna
      String extraInvoice = "";
      double total = 0;

      System.out.println("----------------------------------------------");
      System.out.println("          ¡BIENVENIDO A FLAVOR GARAGE!        ");
      System.out.println("--------------------------------------------\n");

      // Lógica de salida
      System.out.println("--- MENÚ DE PLATOS PRINCIPALES ---");
      System.out.println("1. Hamburguesa");
      System.out.println("2. Pizza");
      System.out.println("3. Salchipapas ($6.50)");
      System.out.println("4. Hot Dog ($2.00)");
      System.out.println("5. Alitas BBQ ($8.50)");
      System.out.println("6. Pollo Apanado ($3.50)");
      System.out.println("7. Pollo Asado ($5.00)");
      System.out.println("0. Salir del programa");
      System.out.print("Seleccione su plato: ");
      int dish = sc.nextInt();

      // Lógica de salida
      if (dish == 0) {
        keepGoing = false;
        System.out.println("Saliendo... ¡Que tenga un excelente día!");
        continue;
      }

      switch (dish) {
        case 1: // selección del tipo de hamburguesa
          System.out.print("¿Es de (1) Res o (2) Pollo?: ");
          int burgerType = sc.nextInt();
          System.out.print("¿(1) Normal ($6.00) o (2) Doble Carne ($8.50)?: ");
          int burgerSize = sc.nextInt();
          mainDishInvoice = (burgerType == 1 ? "Hamburguesa de Res" : "Hamburguesa de Pollo");
          if (burgerSize == 2) {
            mainDishInvoice += " Doble";
            total += 8.50;
          } else {
            total += 6.00;
          }
          break;

        case 2: // selección del tipo de pizza
          System.out.println("Sabores: (1) Pepperoni ($5.00), (2) Queso ($3.50), (3) Combinada ($8.50)");
          int pizzaFlavor = sc.nextInt();
          switch (pizzaFlavor) {
            case 1:
              mainDishInvoice = "Pizza de Pepperoni";
              total += 5.00;
              break;
            case 2:
              mainDishInvoice = "Pizza de Queso";
              total += 3.50;
              break;
            case 3:
              mainDishInvoice = "Pizza Combinada";
              total += 8.50;
              break;
            default:
              System.out.println("Sabor no reconocido, se asignará una Pizza Básica.");
              mainDishInvoice = "Pizza Genérica";
              total += 4.00;
              break;
          }
          break;

        case 3:
          mainDishInvoice = "Salchipapas";
          total += 6.50;
          break;
        case 4:
          mainDishInvoice = "Hot Dog";
          total += 2.00;
          break;
        case 5:
          mainDishInvoice = "Alitas BBQ";
          total += 8.50;
          break;
        case 6:
          mainDishInvoice = "Pollo Apanado";
          total += 3.50;
          break;
        case 7:
          mainDishInvoice = "Pollo Asado";
          total += 5.00;
          break;
        default:
          System.out.println("Opción de plato inválida. Se marcará como Pedido Especial.");
          mainDishInvoice = "Pedido Especial";
          total += 5.00;
          break;
      }

      // 2. selección de acompañamiento
      System.out.println("\n--- ACOMPAÑAMIENTOS ADICIONALES ---");
      System.out.println("1. Papas Fritas ($2.50)");
      System.out.println("2. Patacones ($2.50)");
      System.out.println("3. Yuca ($2.00)");
      System.out.println("4. Ninguno ❌");
      System.out.print("Seleccione un extra: ");
      int extra = sc.nextInt();
      switch (extra) {
        case 1:
          extraInvoice = "Papas Fritas 🍟";
          total += 2.50;
          break;
        case 2:
          extraInvoice = "Patacones 🍌";
          total += 2.50;
          break;
        case 3:
          extraInvoice = "Yuca 🍠";
          total += 2.00;
          break;
        case 4:
          extraInvoice = "Sin extras ❌";
          break;
        default:
          System.out.println("Opción inválida, no se añadirán extras.");
          extraInvoice = "Sin extras";
          break;
      }

      // 3. selección de bebidas
      System.out.println("\n--- BEBIDAS ---");
      System.out.println("1. Gaseosa ($1.50)");
      System.out.println("2. Jugo Natural ($3.00)");
      System.out.println("3. Limonada ($2.50)");
      System.out.println("4. Agua ");
      System.out.println("5. Ninguna ❌");
      System.out.print("Seleccione una bebida: ");
      int drink = sc.nextInt();

      switch (drink) {
        case 1:
          System.out.print("Sabor: (1) Coca Cola, (2) Pepsi, (3) Fresca: ");
          int sodaType = sc.nextInt();
          drinkInvoice = (sodaType == 1 ? "Coca Cola" : (sodaType == 2 ? "Pepsi" : "Fresca"));
          total += 1.50;
          break;
        case 2:
          System.out.print("Sabor: (1) Guayaba, (2) Piña, (3) Frutos Rojos, (4) Naranja: ");
          int juiceType = sc.nextInt();
          drinkInvoice = "Jugo de Fruta";
          total += 3.00;
          break;
        case 3:
          drinkInvoice = "Limonada";
          total += 2.50;
          break;
        case 4:
          drinkInvoice = "Agua";
          total += 0;
          break;
        case 5:
          drinkInvoice = "Ninguna";
          break;
        default:
          System.out.println("Opción inválida, no se servirá bebida.");
          drinkInvoice = "Ninguna";
          break;
      }

      // 4. generación de factura
      System.out.println("\n__________________________________________");
      System.out.println("               FACTURA DE CONSUMO           ");
      System.out.println("____________________________________________");
      System.out.println("Plato Principal: " + mainDishInvoice);
      System.out.println("Acompañamiento:  " + extraInvoice);
      System.out.println("Bebida:          " + drinkInvoice);
      System.out.println("--------------------------------------------");
      System.out.printf("TOTAL A PAGAR:    $%.2f\n", total);
      System.out.println("____________________________________________");
      System.out.println("       Gracias por elegir Flavor Garage     ");
      System.out.println("____________________________________________\n");

      // Preguntar si el usuario desea realizar otra orden
      System.out.print("¿Desea realizar otro pedido? (1. Sí / 2. No): ");
      int tryAgain = sc.nextInt();
      if (tryAgain != 1) {
        keepGoing = false;
      }

    } while (keepGoing);

    System.out.println("Pedido finalizado. ¡Vuelva pronto!");
    sc.close();

  }
}