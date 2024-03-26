package main.java.ua.hillel.boichenko.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = 0;
        int temp2 = 0;
        System.out.println("Please enter Int array length!");
        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                if (temp < 0) {
                    System.out.println("Please enter positive number!");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.println("Please enter Int array width!");
        while (true) {
            if (scanner.hasNextInt()) {
                temp2 = scanner.nextInt();
                if (temp2 < 0) {
                    System.out.println("Please enter positive number!");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again!");
                scanner.nextLine();
            }
        }

        int m = temp;
        int n = temp2;
        int[][] array = new int[n][m];
        int[][] array2 = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*11);
            }

        }
        System.out.println("First array!");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];

            }
        }
        System.out.println("Second Array!");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();

        }

    }
}
