package ua.hillel.boichenko.lessons.lesson7;

import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        for (int i = 0; i < team1.length; i++){
            team1[i] = ((int) (Math.random() * 23) + 18);
           System.out.print(team1[i] + ", " + "\n");
            for (int j = 0; j < team2.length ; j++) {
                team2[j] = ((int) (Math.random() * 23) + 18);
                System.out.print(team2[j] + ", ");


            }


        }

    }
}
