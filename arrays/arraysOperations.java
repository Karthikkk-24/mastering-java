package arrays;

import java.util.Scanner;

public class arraysOperations {
    public static void main(String[] args) {

        // Creating an array
        int marks[] = new int[30];
        
        Scanner sc = new Scanner(System.in);

        // For Static length data insertion...
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int biology = sc.nextInt();
        marks[0] = physics;
        marks[1] = chemistry;
        marks[2] = biology;
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Biology: " + marks[2]);
        
        
        // For Input based length data insertion....
        
        // for (int i = 0; i < marks.length; i++) {
        //     marks[i] = sc.nextInt();
        // }
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        // Updating an array element
        marks[0] = 100;
        System.out.println("Physics: " + marks[0]);

        // Percentage 
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        int percentage = sum / marks.length;
        System.out.println("Percentage: " + percentage);
    }
    
}
