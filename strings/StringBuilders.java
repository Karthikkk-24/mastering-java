package strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb);

        StringBuilder alphabets = new StringBuilder();
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabets.append(c);
        }
        System.out.println(alphabets);
    }
    
}
