package main.java.ua.hillel.boichenko.lessons.lesson12.homeWork;

public class Main {
    public static void main(String[] args) {

        FitnessTracker dorohov = new FitnessTracker("Sergey", "Dorohov",  19, 07,
                1983, "jhbkj@kj;lkn", "+2434384582", 90, 40, 13989);
        dorohov.printAccountInfo();

        System.out.println();

        FitnessTracker boichenko = new FitnessTracker("Alex1", "Boichenko", 11, 01,
                1990, "jhbkj@kj.lkn@gmail", "+2434384582", 94, 70, 10989);
        boichenko.printAccountInfo();
        System.out.println();

        FitnessTracker berov = new FitnessTracker("Oleg", "Berov", 24, 11,
                2001, "oleg@Berov.gmail.com", "+11434384582", 75, 89, 21189);
        berov.printAccountInfo();
        System.out.println();

        FitnessTracker malkoln = new FitnessTracker("Piter", "Malkoln", 17, 02,
                2004, "piter@malkolm.gmail", "+31434384582", 90, 40, 19890);
        malkoln.printAccountInfo();
        System.out.println();
    }
}
