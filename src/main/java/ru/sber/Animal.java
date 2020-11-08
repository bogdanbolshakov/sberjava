package ru.sber;

public class Animal {
    private int age;

    /**
     * Класс, описывающий животных
     */
    public Animal() {
    }

    @Override
    /**
     * override method toString
     */
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }

    /**
     * @return value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * set age
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * constructor (one param age)
     *
     * @param age
     */
    public Animal(int age) {
        this.age = age;
    }
}
