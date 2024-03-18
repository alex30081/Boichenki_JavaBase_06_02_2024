package ua.hillel.boichenko.lessons.lesson7;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int [] array1 = new int[5];
//        array1[0] = 5;
//        System.out.println(array1[0]);
//        System.out.println(array1[1]);
//        System.out.println(array1[2]);
//        System.out.println(array1[3]);
//        System.out.println(array1[4]);
//        array1[1] = 1;
//        array1[2] = 4;
//        array1[3] = 9;
//        array1[4] = 2;
//        for (int i = 0; i < 5; i++) {
//            array1[i] = i + 1;
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(array1[i]);
//        }
//        String[] strings = new String[3];
//        strings[0] = "dobo";
//        strings[1] = "drago";
//        strings[2] = "bilbo";
//        for (int i = 0; i <3 ; i++) {
//            System.out.println(strings[i]);
//
//        }
//        System.out.println(Arrays.toString(array1));
//        System.out.println( "array length =" + array1.length);
//
////        for (int i = 0; i < 5; i++) {
////            array1[i] = i + 1;
////        }
//        System.out.println("Array last =" + array1 [array1.length - 1]);
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random()*101);
//
//        }
//        System.out.println(Arrays.toString(array));
//        for (int value : array);{
//            System.out.print(value);
//        }
//        int[] array = {1,2,3,4,5,6,7,8,9,0};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 3){
//                array[i] = 77;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)(Math.random()*101);
//            System.out.print(array[i] + " ");
//        }
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            int randomNumber = (int) (Math.random()*11);
//            array[i] = randomNumber;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ",");
//            if (i == array.length-1) {
//                System.out.println(array[i]);
//            }
//            else {
//                System.out.print(array[i] + ",");
//            }
//
//        }
//        int maxValue = 0;
//        int indexMaxValue = 0;
//        int[] people = {11,44,98,44,227,33,55,22,90,9};
//        for (int i = 0; i < people.length; i++) {
//            if (people[i] > maxValue){
//                maxValue = people[i];
//                indexMaxValue = i;
//            }
//
//        }
//        System.out.println("MaxValue = " + maxValue + ",IndexMaxValue = " + indexMaxValue);
        int teamOne = 0;
        int teamTwo = 0;
        int[] team = new int[10];
        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * 11);
            if (i % 2 == 0){
                teamOne += team[i];
            }
            else {
                teamTwo += team[i];
            }
        }
            System.out.println(Arrays.toString(team));
        System.out.println("TeamOne = " + teamOne);
        System.out.println("TeamTwo = " + teamTwo);
        if (teamOne > teamTwo) {
            System.out.println("Win TeamOne");
        } else if (teamTwo > teamOne) {
            System.out.println("Win TeamTwo");}
        else {
                System.out.println("Draw");   }
}}