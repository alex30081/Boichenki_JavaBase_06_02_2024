package main.java.ua.hillel.boichenko.lessons.lesson13.homeWorck;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String nameTeam) {
        super(nameTeam);
    }

    @Override
    public void playMusic() {
        System.out.println( nameTeam + " LA LALA LA LALALA LALA LA la");
    }


}
