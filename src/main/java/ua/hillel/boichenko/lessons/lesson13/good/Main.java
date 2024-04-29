package main.java.ua.hillel.boichenko.lessons.lesson13.good;


import main.java.ua.hillel.boichenko.lessons.lesson13.Cat;
import main.java.ua.hillel.boichenko.lessons.lesson13.good.obstacle.Obstacle;
import main.java.ua.hillel.boichenko.lessons.lesson13.good.obstacle.ObstaclePoll;

public class Main {
    public static void main(String[] args) {
//        ObstaclePoll obstaclePoll = new ObstaclePoll();
//        ObstaclWall obstaclWall = new ObstaclWall();
//
////
//        PartisipantCat partisipantCat = new PartisipantCat("CAT");
//        PartisipantDog partisipantDog = new PartisipantDog("DOG");
//        PartisipantFrog partisipantFrog = new PartisipantFrog("FROG");
//
//        obstaclWall.start(partisipantCat);
//        obstaclWall.start(partisipantDog);
//        obstaclWall.start(partisipantFrog);
//
//        obstaclePoll.start(partisipantCat);
//        obstaclePoll.start(partisipantDog);
//        obstaclePoll.start(partisipantFrog);
//        Obstacle[] obstacles = {
//                new ObstacleWall(),
//                new ObstaclePoll()
//        };
//
//        Participant[] participants = {
//                new ParticipantCat("Cat1"),
////                new ParticipantCat("Cat2"),
////                new ParticipantCat("Cat3"),
////                new ParticipantCat("Cat4"),
//                new ParticipantDog("Dog1")
//        };
//
//        for (Obstacle obstacle : obstacles) {
//            for (Participant participant : participants) {
//                obstacle.start(participant);
//            }


//        }

        System.out.println(Cat.counter);

        Cat.counter = 15;

        System.out.println(Cat.counter);

        Cat.demoStaticMethod();

    }

}
