package ua.hillel.boichenko.lessons.lesson5;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int Team1Player1 = 0;
        int Team1Player2 = 0;
        int Team1Player3 = 0;
        int Team1Player4 = 0;
        int Team1Player5 = 0;
        int Team2Player1 = 0;
        int Team2Player2 = 0;
        int Team2Player3 = 0;
        int Team2Player4 = 0;
        int Team2Player5 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Team1 name!");
        String strTeam_1 = scanner.next();
        System.out.println("Name Team1 =" + " " + strTeam_1);
        System.out.println("Please enter kills by Player1Team1");
        scanner.nextLine();
        if (scanner.hasNextInt()) {
            Team1Player1 = scanner.nextInt();
            System.out.println("Team1Player1 = " + Team1Player1 + " " + "kils");
            System.out.println("Please enter kills by Player2Team1");
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                Team1Player2 = scanner.nextInt();
                System.out.println("Team1Player2 = " + Team1Player2 + " " + "kils");
                System.out.println("Please enter kills by Player3Team1");
                scanner.nextLine();
            }
            if (scanner.hasNextInt()) {
                Team1Player3 = scanner.nextInt();
                System.out.println("Team1Player3 = " + Team1Player3 + " " + "kils");
                System.out.println("Please enter kills by Player4Team1");
                scanner.nextLine();
            }
            if (scanner.hasNextInt()) {
                Team1Player4 = scanner.nextInt();
                System.out.println("Team1Player4 = " + Team1Player4 + " " + "kils");
                System.out.println("Please enter kills by Player5Team1");
                scanner.nextLine();
            }
            if (scanner.hasNextInt()) {
                Team1Player5 = scanner.nextInt();
                System.out.println("Team1Player5 = " + Team1Player5 + " " + "kils");
                scanner.nextLine();
            } else {
                System.out.println("Wrong data!!! Restart APP!!!");
                System.exit(0);
            }
        }
        System.out.println("Please enter Team2 name!");
        String strTeam_2 = scanner.next();
        System.out.println("Name Team2 =" + " " + strTeam_2);
        scanner.nextLine();
        System.out.println("Please enter kills by Player1Team2");
        if (scanner.hasNextInt()) {
            Team2Player1 = scanner.nextInt();
            System.out.println("Team2Player1 = " + Team2Player1 + " " + "kils");
            System.out.println("Please enter kills by Player2Team2");
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                Team2Player2 = scanner.nextInt();
                System.out.println("Team2Player2 = " + Team2Player2 + " " + "kils");
                System.out.println("Please enter kills by Player3Team2");
            }
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                Team2Player3 = scanner.nextInt();
                System.out.println("Team2Player3 = " + Team2Player3 + " " + "kils");
                System.out.println("Please enter kills by Player4Team2");
            }
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                Team2Player4 = scanner.nextInt();
                System.out.println("Team2Player4 = " + Team2Player4 + " " + "kils");
                System.out.println("Please enter kills by Player5Team2");
            }
            scanner.nextLine();
            if (scanner.hasNextInt()) {
                Team2Player5 = scanner.nextInt();
                System.out.println("Team2Player5 = " + Team2Player5 + " " + "kils");
                scanner.nextLine();
            } else {
                System.out.println("Wrong data!!! Restart APP!!!");
                System.exit(0);
            }
        }
        int a = ((Team1Player1 + Team1Player2 +Team1Player3 +Team1Player4 + Team1Player5) / 5);
        int b = ((Team2Player1 + Team2Player2 + Team2Player3 + Team2Player4 + Team2Player5) / 5);
        String strTeam1 =("Team1");
        String strTeam2 = ("Team2");
        int c = (Team1Player1 + Team1Player2 + Team1Player3 + Team1Player4 + Team1Player5);
        int d = (Team2Player1 + Team2Player2 + Team2Player3 + Team2Player4 + Team2Player5);
        if (a > b) {
            System.out.println("Win team = " + strTeam1 + "Scored" + c + "Points");
        } else if (a < b) {
            System.out.println("Win team =" + strTeam2 + "Scored" + d + "Points");
        }else {
            System.out.println("We have no winner, friendship won!!!");

        }
    }
    }
}
