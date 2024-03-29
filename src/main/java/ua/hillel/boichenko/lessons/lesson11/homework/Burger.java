package main.java.ua.hillel.boichenko.lessons.lesson11.homework;

public class Burger {
    
        String bun;
        String meat;
        int doubleMeat;
        String cheese;
        String greenery;
        String mayonnaise;



    public Burger (String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this. meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;

    }


    public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this. meat = meat;
        this. cheese = cheese;
        this. greenery = greenery;
        this. mayonnaise = mayonnaise;
    }

    public Burger(String bun, int doubleMeat, String meat, String cheese, String greenery, String mayonnaise) {
        this. bun = bun;
        this.doubleMeat = 2;
        this. meat = meat;
        this. cheese = cheese;
        this. greenery = greenery;
        this.mayonnaise = mayonnaise;

    }
    void classicBurger(){
        System.out.println("Classic Burger = " + bun + meat + cheese + greenery + mayonnaise);
    }

    void dietBurger(){
        System.out.println("Diet Burger =" + bun + meat + cheese + greenery);
    }
    void burgerDoubleMeat(){
        System.out.println("Burger Double Meat =" + bun + doubleMeat + cheese + greenery + mayonnaise);
    }

}


