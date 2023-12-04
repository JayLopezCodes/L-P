public class basicMathFunctions {
    
    public static void main(String[] args)

    {

    int length = 2;
    int height = 4;
    int numberOfWalls = 2;

    double gallonOfPaint = 375.00;

   double product = length * height * numberOfWalls;

   double amountOfPaint = product / gallonOfPaint;

   System.out.print("The amount of gallons of paint needed to paint the walls is: ");
   System.out.printf("%.2f%n", amountOfPaint);

    }
}
