package ua.hillel.boichenko.lessons.lesson5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 15;
//        int c = 20;
//        System.out.println(a > b);
//        System.out.println(a >=b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);
////        System.out.println();
//        System.out.println();
//       System.out.println(!true);
//        System.out.println(!false);
//        boolean result = a >b;
//        System.out.println("result =" + result);
//        String str = "hello!";
//        String str2 = "hello!";
//        String str3 = new String(  "hello!");
//        System.out.println(str == str2);
//        System.out.println(str == str3);
//        System.out.println( str.equals(str2));
//        System.out.println(str.equals(str3));
//        int a = 10;
//      //        int b = 15;//        int c = 20;
//
//   boolean result = a < b && a < c && a > c;
//        System.out.println(result);
//        boolean result2 = a > b || c++ > ++a;
//        System.out.println(result2);
//        System.out.println("a =" +a);
//        System.out.println("c =" +c);
//        boolean result1 = a > b && c < a || c > a;
//        boolean result3 = (a > b || true) && (c < a || c > a) || true;
//        System.out.println(result3);
//      boolean result6 = a < b && a > c;
//        int x = 5;
//        System.out.println(++x > 5);
//        System.out.println("x = " + x);
//        System.out.println(x++ == 5);
//        System.out.println("x = " + x);
//        System.out.println(++x != 6);
//        System.out.println("x = " + x);
//        int a1 > b) {
//            System.out.println("hello my friend!!!");
//            String str = ("good news");
//            System.out.println(str);
//        }
//        System.out.println("bie");
//        if (a > b) {
//            System.out.println("Hello!!");
//
//        } else {
//            System.out.println("Bie!!");
//        }
//        if (a < b) {
//            System.out.println("Hello!");
//        } else if (a > b) {
//            System.out.println("good job");
//
//        }
//        else
//            System.out.println(" I am very sory");
//        if (a >=b); {
//            System.out.println( "hello!!!");
//            if (a > b) {
//                System.out.println( "Hello man");
//            }
//            else {
//                System.out.println("Bie Bie Bie!!!");}}
//        // BAD VARSION
//        if (a == b);
//        System.out.println(a = b);
//        System.out.println(a = b);
//        System.out.println(a = b);
//        int a = 7;
//        switch (a) {
//            case 1 : {
//                System.out.println("1");
//                break;}
//            case 2 : {
//                System.out.println("2");
//                break;}
//            case 3 : {
//                System.out.println("3");
//            break;}
//           case 4 : {
//                System.out.println("4");
//           break;}
//            case 5 : {
//                System.out.println("5");
//            break;}
//            case 6 : {
//                System.out.println("6");
//                break ;}
//            default: {
//                System.out.println("Wrong!!!");
//                break;
//            }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter some string!!!");
//        String strUserValue = scanner.next();
//        System.out.println("user value =" + strUserValue);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ples enter your name");
//        String strName =sc.next();
//        System.out.println("user name =" + strName);

        System.out.println("Ples enter some integer");
        if (scanner.hasNextInt()) {
            int userdate = scanner.nextInt();
            System.out.println("user date of bith=" + userdate);
        } else {
            System.out.println("wrong data. Restart app");
            System.exit(0);
        }


        }
    }