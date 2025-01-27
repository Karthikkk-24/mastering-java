package bitmanipulation;

public class GetIthBit {
    
    public static int getIthBit(int n, int i) {
        return (n >> i) & 1;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        System.out.println(getIthBit(n, i));
    }
}
