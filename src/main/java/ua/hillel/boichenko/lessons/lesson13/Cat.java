package main.java.ua.hillel.boichenko.lessons.lesson13;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void run() {
        System.out.println("Cat " + name + " RUN!!!!");


    }

    @Override
    void run1() {
        System.out.println("Cat " );

    }

}
