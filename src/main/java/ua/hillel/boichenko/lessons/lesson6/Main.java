package ua.hillel.boichenko.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    for (int i = 0; i <= 7; i++) {
//            System.out.println( " hi my friend!!!");
////        }
//        int i = 0;
//        for (; i < 10; i += 4){
//            System.out.println("hi blaaa!!!");}
//            System.out.println("hi blaaa!!!");  тойжэ спосиб только в обратном порядке
//        for (int i = 0; i < 9; i++){
//            System.out.println( "good!!!");
//    }
//        for ( ; ; ){
//            System.out.println("Hello world!!"); безкинечный цыкл} можно оборвать BREAK( якщо потрибно)
//        int i = 0;
//        for ( ; ; ) {
//            System.out.println("Hello world");
//            if (i >= 5) {
//                break;
//            }i++;
//        }
//        for (int i = 0; i < 10; i++) {
//            if (i == 1 || i == 2 || i ==3){
//                continue;
//            }
//            System.out.println(i);
//
//            if ( i == 5) {
//                break;
//            }
//
//        }
//        for (int i = 0, j = 10, k = 7; i <10 && j > 4; k >= 49  i++, j--, k += 7) {
//            System.out.println("i =" + i);
//            System.out.println("j =" + j);
//            System.out.println("k =" + k);
//        }


//        for (int i = 0; i < 10; i++) ;
//        System.out.println("Hello world!!@!");
//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//        System.out.print(num1 + " " + num2 + " ");
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;
//
//
//        int counter = 0;
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Start first loop");
//            System.out.println("first loop +" + i);
//            for (int j = 0; j < 2; j++) {
//                System.out.println("second loop");
//                System.out.println("i =" + i);
//                System.out.println("j =" + j);
//                counter++;
//            }
//            System.out.println("End first loop");
//            System.out.println("counter = " + counter);
//
//        }
//        for (int i = 0; i <21 ; i+=2) {
//            System.out.println(i);
//
//        }
//        for (int i = 0; i <= 20 ; i++) {    для парных % = 0
//            if (i % 2 == 0 ){
//                System.out.println(i);
//            }
//
//        }
//        for (int i = 0; i <= 20 ; i++) {    для непарных % = 1
//            if (i % 2 == 1 ){
//                System.out.println(i);
//            }
//
//        }
//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//        System.out.print(num1 + " " + num2);
//        for (int i = 0; i < 18; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;
//
//        }
//        int i = 0;
//        while (true) {
//            System.out.println(i);
//            if ( i >= 7 )
//            {break;
//        }
//            i++;
////        }
//        Scanner scanner = new Scanner(System.in);
//        int userValue = 0;
//        while (true) {
//            System.out.println("Please enter integer from 10 to 20");
//            if (scanner.hasNextInt()) {
//                userValue = scanner.nextInt();
//                if (userValue >= 10 && userValue <= 20)
//                {break;
//            } else {
//                System.out.println("FROM 10 TO 20");
//                scanner.nextLine();
//            }
//
//            }else {
//                System.out.println("Wrong data, try again!!");
//                scanner.nextLine();
//            }
//
//        }
        int integer = 10;
        while (true) {
            System.out.println(integer);
            int random = (int) (Math.random() * 100);
            if (random >= 85 && random <= 100){
                System.out.println("Win!!!");
                break;}
            integer --;
            if (integer == -1) {
                System.out.println("BOOM!!");
                break;
            }
        }

}
        }




