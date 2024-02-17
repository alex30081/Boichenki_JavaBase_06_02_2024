package ua.hillel.boichenko.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        byte age;
        age = 55;
        System.out.println(age);
        byte age2 = 25;
        System.out.println(age2);
        age2 = -128;
        System.out.println(age2);
        short short_variable = 32700;
        System.out.println(short_variable);
        int intVariable = 214700000;
        System.out.println(intVariable);
        long longVariable = 214700000000L;
        System.out.println(longVariable);
        float floatvariable = 1.1234567890F;
        double doublevariable = 1.1234567890;
        System.out.println(floatvariable);
        System.out.println(doublevariable);
        char charA = 'A';
        char charA2 = 65;
        char charA3 = '\u00B0';
        System.out.println(charA);
        System.out.println(charA2);
        System.out.println(charA3);
        boolean isok = true;
        System.out.println(isok);

        String str = "Hello!!!";
        System.out.println(str);

        System.out.println(str + " " + longVariable + "    " + "jshe");
        System.out.println(str + (age + age2));
        System.out.println(age + (str + age2));
        byte demoByte = 125;
        short demoShort = demoByte;
        int demoInt = 214700;
        System.out.println(demoShort);
        System.out.println(demoInt);
        double demoDouble = demoInt;
        System.out.println(demoDouble);
        char demoA = 'A';
        int demoCharToInt = demoA;
        System.out.println(demoA);
        byte byteVariable = (byte) 570;
        System.out.println(byteVariable);

        System.out.println(5);
        System.out.println(5D);
        System.out.println((double) 5);
    }
}
