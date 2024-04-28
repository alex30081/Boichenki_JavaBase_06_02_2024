package main.java.ua.hillel.boichenko.lessons.lesson13;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(" Mursic ", 8);
        System.out.println( cat);
        cat.run();
        cat.swim();
        cat.demoFinalArgument(15);

    }
}
