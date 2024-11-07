package javablogbasics;

public class basics {
    // Method
    public static void main(String[] args) {
        // declaring a variable demo
        // type variableName = value;

        // Primitive Data Types

        // byte
        byte byteVar = 100;

        // short
        short shortVar = 1000;

        // int
        int intVar = 10000;

        // long
        long longVar = 100000;

        // float
        float floatVar = 100.0f;

        // double
        double doubleVar = 1000.0;

        // char
        char charVar = 'A';

        // boolean
        boolean boolVar = true;

        // Reference Data Types || Non-Primitive Data Types

        // String
        String stringVar = "Hello World";

        // Array
        int[] arrayVar = { 1, 2, 3, 4, 5 };

        // Class
        class classVar {
            int x = 5;
        }

        // Object
        classVar objVar = new classVar();


        // Declaring and Initializing Variables
        
        // Declaring a variable
        int marks;

        // Initializing a variable
        marks = 100;

    }

    // Constructor
    public basics() {
        System.out.println("Constructor Called");
    }
}
