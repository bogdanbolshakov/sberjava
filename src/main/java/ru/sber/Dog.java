package ru.sber;

public class Dog extends Animal {
    String breed;

    public Dog(int age, String breed) {
        super(age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void sound() {
        System.out.println("Gaff-gaff!!!");
    }

    public void move() {
        System.out.println("Move like a dog.");
    }

    public void eat() {
        System.out.println("Dog nyam-nyam");
    }

    public void climb() {
        System.out.println("The dog can't climb to the tree.");
    }

    public void canSwim() {
        System.out.println("The dog likes to swim.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age='" + getAge() + '\'' + ", " +
                "breed='" + breed + '\'' +
                '}';
    }
}
