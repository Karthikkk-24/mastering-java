package functionsbasics;

public class methodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum of 2 and 3 is " + sum(2, 3));
        System.out.println("Sum of 2.5 and 3.5 is " + sum(2.5, 3.5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
