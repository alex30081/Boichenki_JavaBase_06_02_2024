package main.java.ua.hillel.boichenko.lessons.lesson13.homeWorck;

import main.java.ua.hillel.boichenko.lessons.lesson13.good.obstacle.Obstacle;

public class Main {
    public static void main(String[] args) {

        ClassicMusic classicMusic = new ClassicMusic("jj");
        PopMusic popMusic = new PopMusic("iu");
        RockMusic rockMusic = new RockMusic("yu");


        Music[] tipeMusic = {
                new ClassicMusic("Classic"),
                new RockMusic("ROKKK COOLLL"),
                new PopMusic("BLA BLA BLA HIP HOP LA LA LA")
        };
        Music[] musicStyle = {
                new MusicStyles("What music do you love?") {
                    @Override
                    public void playMusic() {

                    }
                }
        };
        for (Music music : musicStyle) {
            for (Music music1 : tipeMusic) {
                musicStyle.pl

            }

        }
    }
}