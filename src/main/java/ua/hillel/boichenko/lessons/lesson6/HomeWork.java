package ua.hillel.boichenko.lessons.lesson6;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 11);
        int a = random;
        int userV = 0;
        System.out.println("Please enter integer from 0 to 10.");
        if (scanner.hasNextInt()) {
            userV = scanner.nextInt();
            if (userV >= 0 && userV <= 10) ;{
                break;
            }

        }
    }
}
