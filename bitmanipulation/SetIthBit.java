package bitmanipulation;

public class SetIthBit {
    
    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }
    
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        System.out.println(setIthBit(n, i));
    }
    
}
