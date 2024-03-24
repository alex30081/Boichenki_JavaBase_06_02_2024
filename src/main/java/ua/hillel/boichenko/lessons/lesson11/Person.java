package main.java.ua.hillel.boichenko.lessons.lesson11;

public class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        swim();
        run();
    }



    void swim() {
        System.out.println(name + " Swim!");

    }
    void run() {
        System.out.println(name + " Run!");

    }
    String getName() {
        return name;
    }
    void increaseAge() {
        age++;
    }
    @Override
        public String toString() {
            return
            "name = " + name + ", age = " + age;
}
    }
//    void demo () {
//        int age = 18;
//        System.out.println(this.age);
//    }

