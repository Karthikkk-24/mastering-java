package javablogbasics;

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Karthik");
        System.out.println(person.getName());
    }
}
