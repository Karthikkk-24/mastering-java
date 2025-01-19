package javablogbasics;

class Animal {
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog is barking");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound(); // Calls the overridden method in Dog
    }
}
