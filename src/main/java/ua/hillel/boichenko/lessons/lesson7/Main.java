package ua.hillel.boichenko.lessons.lesson7;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array1 = new int[5];
        array1[0] = 5;
//        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);
//        System.out.println(array1[3]);
//        System.out.println(array1[4]);
//        array1[1] = 1;
//        array1[2] = 4;
//        array1[3] = 9;
//        array1[4] = 2;
        for (int i = 0; i < 5; i++) {
            array1[i] = i + 1;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array1[i]);
        }
        String[] strings = new String[3];
        strings[0] = "dobo";
        strings[1] = "drago";
        strings[2] = "bilbo";
        for (int i = 0; i <3 ; i++) {
            System.out.println(strings[i]);

        }
        System.out.println(Arrays.toString(array1));





    }
}
