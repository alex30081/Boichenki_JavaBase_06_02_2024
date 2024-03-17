package main.java.ua.hillel.boichenko.lessons.lesson11;

public class Person {
    public static void main(String[] args) {
        personInfo("Will", "Smith","New York", "+123456789");
        personInfo("Jackie", "Chan", "Shanghai", "+634789087");
        personInfo("Johnny", "Depp", "Davis", "+564567894");
    }
        static void personInfo(String name, String surname, String citi, String telephone) {
            System.out.println("Call to " + name +" " + surname + " " + citi + " for the number " + telephone);

        }
}
