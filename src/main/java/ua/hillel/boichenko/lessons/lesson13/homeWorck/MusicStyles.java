package main.java.ua.hillel.boichenko.lessons.lesson13.homeWorck;

public abstract class MusicStyles extends Music{

    String nameTeam;

    public MusicStyles(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public abstract void  playMusic() ;
}
