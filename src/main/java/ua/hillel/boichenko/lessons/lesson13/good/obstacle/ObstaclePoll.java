package main.java.ua.hillel.boichenko.lessons.lesson13.good.obstacle;

import main.java.ua.hillel.boichenko.lessons.lesson13.good.Participant;

public class ObstaclePoll extends Obstacle{


    @Override
    public void start(Participant partisipant) {
        System.out.println(partisipant.getClass() + "Start SWIM");
    }

}
