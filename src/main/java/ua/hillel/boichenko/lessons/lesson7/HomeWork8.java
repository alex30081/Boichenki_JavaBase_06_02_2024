package ua.hillel.boichenko.lessons.lesson7;

public class HomeWork8 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            int a = ( i / 10) % 10;
            int b = i /100;
           if (i /10 == 4 || i % 10 == 4 || i /10 ==9 || i % 10 == 9 || a == 4 || a == 9 || b == 4 || b == 9) {
             continue;
           }
//           if( counter++ == 100) {
//               break;
//           }
            System.out.println(i);
           counter++;

        }
        System.out.println(counter);






        }

    }

