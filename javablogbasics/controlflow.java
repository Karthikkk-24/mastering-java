package javablogbasics;

public class controlflow {

    public static void main(String[] args) {

        // If Else Statement
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        // Else If Ladder
        int marks = 65;

        if (marks < 50) {
            System.out.println("Fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D Grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C Grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B Grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A Grade");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("A+ Grade");
        } else {
            System.out.println("Invalid!");
        }

        // Switch Case Statement

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid!");
        }

        // For Loop

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While Loop

        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        // Do While Loop

        int count1 = 1;
        do {
            System.out.println(count1);
            count1++;
        } while (count1 <= 5);

    }
}