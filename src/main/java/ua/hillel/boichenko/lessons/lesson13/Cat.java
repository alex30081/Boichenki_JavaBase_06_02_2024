package main.java.ua.hillel.boichenko.lessons.lesson13;

public class Cat extends Animal{


    public static int counter = 0;

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

    public static void demoStaticMethod() {
        System.out.println(" it's static method");
    }

}
