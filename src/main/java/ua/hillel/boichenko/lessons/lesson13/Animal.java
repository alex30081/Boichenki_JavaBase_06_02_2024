package main.java.ua.hillel.boichenko.lessons.lesson13;

public abstract class Animal {
    protected String name;
    protected int age;


    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void run();
    abstract void run1();

     final void demoFinalMethod(){
        System.out.println("Demo final Method");
    }
    void demoFinalArgument(final double plus){
        System.out.println( plus / 4);
    }

    void swim() {
        System.out.println(name + " swim" + " Yhuuu");
    }

}
