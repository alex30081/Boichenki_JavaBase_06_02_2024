package main.java.ua.hillel.boichenko.lessons.lesson13.good.partisipant;

public abstract class Partisipant {


    public String getName() {
        return name;
    }

    private String name;

    public Partisipant(String name) {
        this.name = name;
    }
}
