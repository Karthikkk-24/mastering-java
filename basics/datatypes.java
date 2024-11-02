package basics;

public class datatypes {
    public static void main(String[] args) {
        // Primitive data types
        byte b = 127; // 1 byte
        System.out.println(b);

        short s = 32767; // 2 bytes
        System.out.println(s);

        int i = 2147483647; // 4 bytes
        System.out.println(i);

        long l = 9223372036854775807L; // 8 bytes
        System.out.println(l);

        float f = 3.4028235E38f; // 4 bytes
        System.out.println(f);

        double d = 1.7976931348623157E308; // 8 bytes
        System.out.println(d);

        char c = 'A'; // 2 bytes
        System.out.println(c);

        boolean bool = true; // 1 bit
        System.out.println(bool);

        // Reference data types
        String str = "Hello, World!";
        System.out.println(str);

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(arr);

        int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(arr2);

    }

}
