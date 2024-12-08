package arrays;

public class arrayFunctions {
    public static void main(String[] args) {
       int marks[] = {97, 98, 99, 96, 93}; 
       update(marks);
       for (int i = 0; i < marks.length; i++) {
           System.out.println(marks[i]);
       }
    }

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    
}
