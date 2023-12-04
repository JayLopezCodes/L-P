import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cupsPurchased;

        System.out.println("Welcome to Morning Brew Coffee Shop!");
        System.out.println("Here you can check the amount of points you have earned.");
        System.out.println("Please enter the amount of cups you have purchased this month: ");
        
        cupsPurchased = scanner.nextInt();

        double points;

        switch (cupsPurchased) {
            case 0: points = 0;
                break;

            case 1:
                points = 3;
                break;

            case 2:
                points = 8;
                break;

            case 3:
                points = 14;
                break;

            default :
                points = cupsPurchased * 5.7;
                break;
        
        }

        System.out.printf("The amount of points you have are: %.2f%n", points);

        scanner.close();

        }

    }