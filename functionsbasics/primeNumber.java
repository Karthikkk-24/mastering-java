package functionsbasics;

public class primeNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + " is a prime number: " + isPrime(n));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
