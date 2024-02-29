package ua.hillel.boichenko.lessons.lesson6;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            while (true) {
        System.out.println("Please enter integer from 0 to 10.");
        int random = (int) (Math.random() * 11);
        int a = random;
        int userV = 0;

        if (scanner.hasNextInt()) {
            userV = scanner.nextInt();
            if (userV >= 0 && userV <= 10) {
                break;
            } else {
                System.out.println("FROM 0 TO 10");
              scanner.nextLine();
        }
        }else {
            System.out.println("Wrong data, try again!!!");
            scanner.nextLine();
        } if (userV == a) {
                    System.out.println("Good you WIN!!!");
                } else if (userV < a) {
                    System.out.println("The bot created > number than you entered!");

                }else{
                    System.out.println("The bot created < number than you entered!");


            }
}
}
}