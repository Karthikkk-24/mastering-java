package functionsbasics;

public class binomialCoefficient {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("Binomial Coefficient of " + n + " and " + k + " is " + binomialCoeff(n, k));
    }

    public static int binomialCoeff(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}
