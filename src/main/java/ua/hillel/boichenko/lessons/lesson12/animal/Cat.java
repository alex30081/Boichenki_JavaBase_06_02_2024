package main.java.ua.hillel.boichenko.lessons.lesson12.animal;

public class Cat extends Animal{
    String color;

    @Override
    void run(){
        System.out.println(name + " color" + color + " Run!!!!!!!");
    }
}
