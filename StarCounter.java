import java.util.Scanner;

public class StarCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepCounting = true;

        System.out.println("       WELCOME TO MY STAR COUNTER     ");

        while (keepCounting) {
            System.out.print("\nHow many stars (size)? ");
            int size = scanner.nextInt();

            System.out.println("\nChoose a style:");
            System.out.println("1. Horizontal Line");
            System.out.println("2. Vertical Column");
            System.out.println("3. Pyramid Shape");
            System.out.println("4. Solid Square");
            System.out.println("5. Inverted Pyramid");
            System.out.println("6. Hollow Square");
            System.out.print("Enter style number (1-6): ");
            int style = scanner.nextInt();

            System.out.println("\n--- Your Creative Pattern ---");

            switch (style) {
                case 1:
                    for (int i = 0; i < size; i++)
                        System.out.print("⭐");
                    System.out.println();
                    break;

                case 2:
                    for (int i = 0; i < size; i++)
                        System.out.println("⭐");
                    break;

                case 3:
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= i; j++)
                            System.out.print("⭐");
                        System.out.println();
                    }
                    break;

                case 4: // Solid Square
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++)
                            System.out.print("⭐");
                        System.out.println();
                    }
                    break;

                case 5: // Inverted Pyramid
                    for (int i = size; i >= 1; i--) {
                        for (int j = 1; j <= i; j++)
                            System.out.print("⭐");
                        System.out.println();
                    }
                    break;

                case 6: // Hollow Square
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size; j++) {
                            // Dibuja "*" si es el borde, si no, dibuja espacio
                            if (i == 1 || i == size || j == 1 || j == size) {
                                System.out.print("⭐");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Invalid style selection!");
                    break;
            }

            System.out.print("\nWould you like to try another style? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (response.equals("no") || response.equals("n")) {
                keepCounting = false;
                System.out.println("\nGoodbye! Keep coding!");
            }
        }
        scanner.close();
    }
}