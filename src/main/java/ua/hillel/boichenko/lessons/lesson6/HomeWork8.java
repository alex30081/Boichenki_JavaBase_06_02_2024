package ua.hillel.boichenko.lessons.lesson6;

public class HomeWork8 {
    public static void main(String[] args) {
    int counter = 0;
    for (int i = 0; ; i++) {
        for ( i = 0; counter <=100; i++){

            int a = ( i / 10) % 10;
            int b = i /100;
            if (i /10 == 4 || i % 10 == 4 || i /10 ==9 || i % 10 == 9 || a == 4 || a == 9 || b == 4 || b == 9) {
                continue;
            }
            System.out.println("Shuttle num " + counter + " will have a number :");
            System.out.println(i);
            counter++;

        }
    }
}
}
