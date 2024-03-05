package main.java.ua.hillel.boichenko.lessons.lesson8;
import java.util.Arrays;
public class HomeWork {
    public static void main(String[] args) {
        int[] lottery = new int[7];
        int[] player = new int[7];
        int a = lottery.length;
        int b = player.length;
        int same = 0;
        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = ((int) (Math.random() * 10));
        }
        for (int i = 1; i < a; i++) {
            int key = lottery[i];
            int j = i - 1;
            while (j >= 0 && lottery[j] > key) {
                lottery[j + 1] = lottery[j];
                j--;
            }
            lottery[j + 1] = key;
        }
        for (int i = 0; i < player.length; i++) {
            player[i] = ((int) (Math.random() * 10));
        }
        for (int i = 1; i < b; i++) {
            int key = player[i];
            int j = i - 1;
            while (j >= 0 && player[j] > key) {
                player[j + 1] = player[j];
                j--;
            }
            player[j + 1] = key;
        }
        System.out.println(" Lottery numbers = " + Arrays.toString(lottery));
        System.out.println(" Player numbers =  " + Arrays.toString(player));
        for (int i = 0; i < lottery.length; i++) {
            if (lottery[i] == player[i] ) {

        }
    }
}}
