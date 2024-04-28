package main.java.ua.hillel.boichenko.lessons.lesson13.demo;

public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();
        Class4 class4 = new Class4();
        Class5 class5 = new Class5();
        Class1 demo = new Class5();
//        demo.methodClass1();
//        ((Class3) demo).methodClass2();
        demoMethod(class5);
    }

    static void demoMethod(Class1 obj){
    obj.methodClass1();
        ((Class2) obj).methodClass2();

        ((Class3) obj).methodClass3();

        ((Class4) obj).methodClass4();

        ((Class5) obj).methodClass5();
    }
}
