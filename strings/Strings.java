package strings;

public class Strings {
    public static void main(String[] args) {
        char arr[] = {'h', 'e', 'l', 'l', 'o'};

        System.out.println(new String(arr));

        String str = "Hello";

        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.substring(1, 4));

        String str2 = "World!";

        System.out.println(str + " " + str2);
    }
}
