import java.util.Scanner;

public class userInputMath {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double employeesSalary;
        double employeesRaise;
        double totalRaisePercentage;
        double totalDollarAmount;
        double newSalary;

        System.out.println("Enter employee's current salary");
        employeesSalary = scanner.nextDouble();
        
        System.out.println("Enter employee's raise percentage");
        employeesRaise = scanner.nextDouble();

        totalRaisePercentage = employeesRaise + 2;
        totalDollarAmount = totalRaisePercentage / 100 * employeesSalary;
        newSalary = employeesSalary + totalDollarAmount;

        scanner.close();

        System.out.println("The employees raise percentage is: "+totalRaisePercentage);
        System.out.println("The employees new salary is: "+newSalary);
    }
}
