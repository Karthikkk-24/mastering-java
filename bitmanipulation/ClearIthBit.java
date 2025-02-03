package bitmanipulation;

public class ClearIthBit {
    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }
    
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        System.out.println(clearIthBit(n, i));
    }
}
