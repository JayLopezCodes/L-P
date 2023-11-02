public class HelloWorld {
    public static void main(String[] args) {
        String x = ("Pig");
        String y = ("Turtle");
        String temp;
        temp=x;
        x=y;
        y=temp;

        System.out.println("There it is x: "+x);
        System.out.println("There it is y: "+y);
    }
}