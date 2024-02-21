package ua.hillel.boichenko.lessons.lesson5;

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
//
//        System.out.println();
//        System.out.println();
//
//        System.out.println(!true);
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

        int a = 10;
        int b = 15;
        int c = 20;

        boolean result = a < b && a < c && a > c;
        System.out.println(result);
        boolean result2 = a > b || c++ > ++a;
        System.out.println(result2);
        System.out.println("a =" +a);
        System.out.println("c =" +c);
//        boolean result = a < b && a > c;
//        if (a > b) {
//            System.out.println("Hello!!!");
//        } else {
//            System.out.println("hi");}
//        int c2 = ((int) (a * b));
//        System.out.println(c2);


    }
}
