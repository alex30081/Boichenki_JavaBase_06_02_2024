package main.java.ua.hillel.boichenko.lessons.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        printHeloWorld();
//        printHeloName("Alex");
//        printHeloName("Den");
//        printHeloName("Oleg");
//        printNameEndSername("Alex", "Boichenco");
//        int a = 5;
//        int b =10;
//        printSum(a,b);
//        System.out.println("a = " + a);
//        int[] arr = {1, 2, 3, 4, 5};
//        printAray(arr);
//        printSumType(5,3.4,'r', "Alex", new int[]{2, 3, 5});
//        int random = getRandomNumber();
//        System.out.println(random);
//        System.out.println(getRandomNumber());
//        printSum(getRandomNumber(), getRandomNumber());// в якости зминых выкликаем инший метод

//        static void printHeloWorld () {
//            System.out.println("Hello world!!!");
//        }
//        static void printHeloName(String name) {
//            System.out.println("Hello " + name);
//        }
//        static void printNameEndSername(String name, String sername){
//            System.out.println("Helo " + name + " " + sername);
//        }
//    static void printSum (int a, int b) {
//         a = 10;
//        System.out.println(a + b);
//        System.out.println(getSum(10, 10));
//        printVarArgs(1, 3, 3, 5, 12);
//    }
//        static void printAray(int[] array){
//        array[0] = 77;
//            for (int i = 0; i < array.length; i++) {
//                System.out.println(array[i]);
//
//            }
//        }
//    static void printSumType (int x, double y, char ch, String str, int[] array) {
//
//    }
//    static  int getSum(int a, int b) {
//        int c = 20;
//        return getSumDemo(a, b, c);
//    }
//    static  int getSumDemo(int a, int b, int c){
//        return a + b + c;
//    }
//    static int getRandomNumber() {
//        int random = (int) (Math.random() * 11);
//        return random;
//    }
//    static void printVarArgs(int... varArgs) {
//        System.out.println(Arrays.toString(varArgs));
//        System.out.println(sum(1, 2));
//        System.out.println(sum(1, 2, 3));
//        System.out.println(sum(1, 2, 3, 4));
//        System.out.println(sum(1, 2, 3, 4, 5));
//        System.out.println(sum(3, 5, 9));
//        demoReturn(2);
//        System.out.println(demoRerutnMethod(333333333));
//        System.out.println(getFactorial(14));
//        System.out.println(evclide(9, 3));
    }
    static int evclide(int n, int m){ // рекурсия. пошук нйбильшого общого дильныка
        if (n == m){
            return n;
        } else if (n > m) {
            return evclide(n - m, m);
        }
        else
            return evclide(n, m - n);
    }
    static double sum (int a, double b, int c){
        return a + b + c;
    }
    static int sum(int a, int b, int c, int d, int e){
        return a + b + c + d + e;
    }
    static int sum(int a, int b, int c, int d){

        return a + b + c + d;
    }
    static int sum(int a, int b, int c){

        return a + b + c;
    }
    static int sum (int a, int b){
        return a + b;
    }
    static void demoReturn (int x){
        if (x == 2){
        return;
        }
        System.out.println("dfaesrgsergb");
    }
    static int demoRerutnMethod(int x) {
        if (x == 2) {
            return 2;
        } else if (x == 3) {
        return 3;
        }
        else {
            return 999;
        }

    }
    static int getFactorial( int number){
        if (number == 1) {
            return 1;
        }
        return number * getFactorial(number-1);
    }
    }
