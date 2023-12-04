import java.util.Scanner;

public class ifDecisionFunctions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cans;
        double total = 0.00;

        System.out.println("Welcome to Jay's Local Store");
        System.out.println("There is a sale applicable to 10 cans MAX!");
        System.out.println("Please enter the amount of cans you would like to purchase: ");
        cans = scanner.nextInt();

        if (cans > 0 && cans < 10) {
            if (cans == 1 || cans == 2) {
                total = 1 * cans;
            }

            else if (cans == 3 || cans == 4) {
                total = 0.90 * cans;
            }

            else if (cans == 5 || cans == 6) {
                total = 0.84 * cans;
            }

            else if (cans == 7|| cans == 8) {
                total = 0.80 * cans;
            }

            else if (cans == 9|| cans == 10) {
                total = 0.78 * cans;
            }
            System.out.println("Total due is:");
            System.out.printf("$%.2f%n", total);
        }
        else {
            System.out.println("Number entered is outside of valid range");
            }
        scanner.close();
        }
    }
    

