package ua.hillel.boichenko.lessons.lesson7;

import java.util.Arrays;

public class HomeWork9 {  
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int sumTeam1 = 0;
        int sumTema2 = 0;
        for (int i = 0; i < team1.length; i++) {
            team1[i] = ((int) (Math.random() * 23) + 18);
            sumTeam1 += team1[i];}
            int ave =(sumTeam1 / 25);
            System.out.println(Arrays.toString(team1));
            System.out.println("Average age of players team 1 = " + ave);

        for (int j = 0; j < team2.length; j++) {
            team2[j] = ((int) (Math.random() * 23) + 18);
            sumTema2 += team2[j];}
            int ave2 = (sumTema2 / 25);
            System.out.println(Arrays.toString(team2));
            System.out.println("Average age of players team 2 = " + ave2);
            if(ave > ave2 ) {
                System.out.println("Average age of the first team is high than of the second team!");
            } else if (ave < ave2) {
                System.out.println("Average age of the second team is high than of the first team!");
            }
            else {
                System.out.println("The average age of the teams  players is the same!");
            }


    }
}
