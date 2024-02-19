package ua.hillel.boichenko.lessons.lesson4;

public class HomeWork1 {
    public static void main(String[] args) {
        byte a=3;
        double b=4.2;
        double h=2.8;
        double volume = (2 *(a * b + a * h + b * h));

        double x = volume;
        System.out.println("VolumeParallelepiped" + "=" + x);
        double length = ( a * 4 + b * 4 + h * 4);
        double y = length;
        System.out.println("LengthSumEdges" + "=" + y);



    }
}
