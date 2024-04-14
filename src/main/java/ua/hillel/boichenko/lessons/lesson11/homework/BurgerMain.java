package main.java.ua.hillel.boichenko.lessons.lesson11.homework;

public class BurgerMain {public static void main(String[] args) {
        Burger burger = new Burger("bun, ", 2 , " meat, ", "cheese, ", "greenery, ",
                "mayonnaise");
        burger.bun = "Classic bun, ";
        burger.meat = "Beef meat, ";
        burger.cheese = "Cream cheese, ";
        burger.greenery = "Lettuce leaves, ";
        burger.mayonnaise = "Classic organic mayonnaise, ";

        burger.classicBurger();

        burger.dietBurger();

        burger.burgerDoubleMeat();
        System.out.println();


    }
}
