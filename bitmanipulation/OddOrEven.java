package bitmanipulation;

public class OddOrEven {

    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
    
    public static void main(String[] args) {
        System.out.println(isOdd(0));
        System.out.println(isOdd(3));
        System.out.println(isOdd(4));
        System.out.println(isOdd(7));
    }
}
