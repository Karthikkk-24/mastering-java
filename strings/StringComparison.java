package strings;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        String cars[] = {"BMW", "Volvo", "Ford", "Mazda"};

        String largest = cars[0];

        for (int i = 1; i < cars.length; i++) {
            if (cars[i].compareTo(largest) > 0) {
                largest = cars[i];
            }
        }

        System.out.println(largest);

    }
}
