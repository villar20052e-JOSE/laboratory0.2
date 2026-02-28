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
      String drinkInvoice = "None"; // Inicializado por si no se elige ninguna
      String extraInvoice = "";
      double total = 0;

      System.out.println("============================================");
      System.out.println("          WELCOME TO FLAVOR GARAGE!         ");
      System.out.println("============================================\n");

      // Lógica de salida
      System.out.println("--- MAIN DISH MENU ---");
      System.out.println("1. Burger");
      System.out.println("2. Pizza");
      System.out.println("3. Salchipapas ($6.50)");
      System.out.println("4. Hot Dog ($2.00)");
      System.out.println("5. BBQ Wings ($8.50)");
      System.out.println("6. Breaded Chicken ($3.50)");
      System.out.println("7. Roasted Chicken ($5.00)");
      System.out.println("0. Exit program"); // NEW OPTION
      System.out.print("Select your dish: ");
      int dish = sc.nextInt();

      // logica de salida
      if (dish == 0) {
        keepGoing = false;
        System.out.println("Exiting... Have a great day!");
        continue; // Salta directamente al final del do-while
      }

      switch (dish) {
        case 1: // seleccion del tipo de hamburguesa
          System.out.print("Is it (1) Beef or (2) Chicken?: ");
          int burgerType = sc.nextInt();
          System.out.print(" (1) Normal ($6.00) or (2) Double Meat ($8.50)?: ");
          int burgerSize = sc.nextInt();
          mainDishInvoice = (burgerType == 1 ? "Beef Burger" : "Chicken Burger");
          if (burgerSize == 2) {
            mainDishInvoice += " Double";
            total += 8.50;
          } else {
            total += 6.00;
          }
          break;

        case 2: // seleccion del tipo de pizza
          System.out.println("Flavors: (1) Pepperoni ($5.00), (2) Cheese ($3.50), (3) Combination ($8.50)");
          int pizzaFlavor = sc.nextInt();
          switch (pizzaFlavor) {
            case 1:
              mainDishInvoice = "Pepperoni Pizza";
              total += 5.00;
              break;
            case 2:
              mainDishInvoice = "Cheese Pizza";
              total += 3.50;
              break;
            case 3:
              mainDishInvoice = "Combination Pizza";
              total += 8.50;
              break;
            default:
              System.out.println("Flavor not recognized, Basic Pizza will be assigned.");
              mainDishInvoice = "Generic Pizza";
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
          mainDishInvoice = "BBQ Wings";
          total += 8.50;
          break;
        case 6:
          mainDishInvoice = "Breaded Chicken";
          total += 3.50;
          break;
        case 7:
          mainDishInvoice = "Roasted Chicken";
          total += 5.00;
          break;
        default: // Caso para un número que no aparece en la lista
          System.out.println("Invalid dish option. It will be marked as a Special Order.");
          mainDishInvoice = "Special Order";
          total += 5.00;
          break;
      }

      // 2. seleccion de acompañamiento
      System.out.println("\n--- ADDITIONAL SIDE DISHES ---");
      System.out.println("1. French Fries ($2.50)");
      System.out.println("2. Patacones ($2.50)");
      System.out.println("3. Cassava ($2.00)");
      System.out.println("4. none ❌");
      System.out.print("Select extra: ");
      int extra = sc.nextInt();
      switch (extra) {
        case 1:
          extraInvoice = "French Fries🍟";
          total += 2.50;
          break;
        case 2:
          extraInvoice = "Patacones🍌";
          total += 2.50;
          break;
        case 3:
          extraInvoice = "Cassava🍠";
          total += 2.00;
          break;
        case 4:
          extraInvoice = "No extras❌";
          break;
        default:
          System.out.println("Invalid option, no extras will be added.");
          extraInvoice = "No extras";
          break;
      }

      // 3. seleccion de bebidas
      System.out.println("\n--- DRINKS ---");
      System.out.println("1. Soda ($1.50)");
      System.out.println("2. Natural Juice ($3.00)");
      System.out.println("3. Lemonade ($2.50)");
      System.out.println("4. Water ");
      System.out.println("5. None❌");
      System.out.print("Select drink: ");
      int drink = sc.nextInt();

      switch (drink) {
        case 1:
          System.out.print("Flavor: (1) Coca Cola, (2) Pepsi, (3) Fresca: ");
          int sodaType = sc.nextInt();
          drinkInvoice = (sodaType == 1 ? "Coca Cola" : (sodaType == 2 ? "Pepsi" : "Fresca"));
          total += 1.50;
          break;
        case 2:
          System.out.print("Flavor: (1) Guava, (2) Pineapple, (3) Red Berries, (4) Orange: ");
          int juiceType = sc.nextInt();
          drinkInvoice = "Fruit Juice";
          total += 3.00;
          break;
        case 3:
          drinkInvoice = "Lemonade";
          total += 2.50;
          break;
        case 4:
          drinkInvoice = "Water";
          total += 0;
          break;
        case 5:
          drinkInvoice = "None";
          break;
        default:
          System.out.println("Invalid option, no drink will be served.");
          drinkInvoice = "None";
          break;
      }

      // 4. generacion de fractura
      System.out.println("\n__________________________________________");
      System.out.println("              CONSUMPTION INVOICE           ");
      System.out.println("____________________________________________");
      System.out.println("Main Dish:       " + mainDishInvoice);
      System.out.println("Side Dish:       " + extraInvoice);
      System.out.println("Drink:           " + drinkInvoice);
      System.out.println("--------------------------------------------");
      System.out.printf("TOTAL TO PAY:    $%.2f\n", total);
      System.out.println("____________________________________________");
      System.out.println("      Thanks for choosing Flavor Garage     ");
      System.out.println("____________________________________________\n");

      // Preguntar si el usuario desea realizar otra orden para evitar un bucle
      // infinito
      System.out.print("Would you like to place another order? (1. Yes / 2. No): ");
      int tryAgain = sc.nextInt();
      if (tryAgain != 1) {
        keepGoing = false;
      }

    } while (keepGoing);

    System.out.println("Order cancelled. Come back soon!");
    sc.close();
  }
}
