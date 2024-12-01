package javablogbasics;

abstract class Vehicle {
    public abstract void sound();
}

public class abstraction {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.sound();
    }
}

class Car extends Vehicle {
    public void sound() {
        System.out.println("Car is honking");
    }
}