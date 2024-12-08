package arrays;

public class linearSearch {
    public static void main(String[] args) {
        int marks[] = {97, 98, 99, 96, 93};
        int key = 96;   
        System.out.println(linearSearch(marks, key));
    }

    // Time Complexity = O(n)
    public static int linearSearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
