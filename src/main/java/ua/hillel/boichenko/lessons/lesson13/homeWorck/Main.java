package main.java.ua.hillel.boichenko.lessons.lesson13.homeWorck;

import main.java.ua.hillel.boichenko.lessons.lesson13.good.obstacle.Obstacle;

public class Main {

    public static void main(String[] args) {

        ClassicMusic classicMusic = new ClassicMusic("jj");
        PopMusic popMusic = new PopMusic("iu");
        RockMusic rockMusic = new RockMusic("yu");
        }



        MusicStyles[] musicStyles = {
                new ClassicMusic("Classic"),
                new RockMusic("ROKKK COOLLL"),
                new PopMusic("BLA BLA BLA HIP HOP LA LA LA")
        };
        for (MusicStyles musicTipe : musicStyles) {
            rockMusic.playMusic();
            classicMusic.playMusic();
            popMusic.playMusic();
        }
    }

//                     for (Obstacle obstacle : obstacles) {
//        for (Participant participant : participants) {
//        obstacle.start(participant);
//                  доделать цыкл фор ич
