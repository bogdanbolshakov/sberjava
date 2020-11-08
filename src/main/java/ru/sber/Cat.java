package ru.sber;

/**
 *
 */
public class Cat extends Animal {
    private String color;

    @Override
    public String toString() {
        return "Cat{" +
                "age='" + getAge() + '\'' + ", " +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String color) {
        super();
        this.color = color;
    }

    public Cat(int age, String color) {
        super(age);
        this.color = color;
    }

    public void sound() {
        System.out.println("Meow-meow!!!");
    }

    public void move() {
        System.out.println("Move like a cat.");
    }

    public void eat() {
        System.out.println("Cat hrum-hrum");
    }

    public void climb() {
        System.out.println("The cat climbs to the tree like professional!");
    }

    public void canSwim() {
        System.out.println("Cats can't swim.");
    }
}
