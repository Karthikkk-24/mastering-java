package functionsbasics;

public class decimalToBinary {
    public static void main(String[] args) {
        int a = 7;
        decToBin(a);
    }

    public static void decToBin(int decNum) {
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while (decNum > 0) {
            int lastDigit = decNum % 2;
            binNum = binNum + (lastDigit * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary of " + myNum + " = " + binNum);
    }
}
