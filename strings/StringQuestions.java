package strings;

public class StringQuestions {
    public static void main(String[] args) {
        // For a given string convert each the first character to upper case.
        String str = "hello WORLD!";
        System.out.println(toUpperCase(str));

        String str2 = "something nothing";
        System.out.println(toUpperCase(str2));


        // String Compression
        String str3 = "aaabbbccc";
        System.out.println(stringCompression(str3));


    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Time Complexity = O(n)
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            } else {
                sb.append(str.charAt(i));
            }
        }
        
        return sb.toString();
    }

    public static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            } else {
                sb.append(ch);
                sb.append(count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        sb.append(ch);
        sb.append(count);
        return sb.toString();
    }
    
}
