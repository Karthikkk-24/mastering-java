package bitmanipulation;

public class UpdateIthBit {
    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return ClearIthBit.clearIthBit(n, i);
        } else {
            return SetIthBit.setIthBit(n, i);
        }
    }
    
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        System.out.println(updateIthBit(n, i, 0));
    }
}
