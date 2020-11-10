package ru.sber;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(5, "Redhair");
        System.out.println(cat);
        cat.sound();
        cat.eat();
        cat.move();
        cat.canSwim();
        cat.climb();

        System.out.println();

        Dog dog = new Dog(10, "Bulldog");
        System.out.println(dog);
        dog.sound();
        dog.eat();
        dog.move();
        dog.canSwim();
        dog.climb();
    }
}
