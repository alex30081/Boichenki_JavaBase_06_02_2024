package main.java.ua.hillel.boichenko.lessons.lesson13.bad;

public class Main {
    public static void main(String[] args) {
        ObstaclePoll obstaclePoll = new ObstaclePoll();
        ObstaclWall obstaclWall = new ObstaclWall();


        PartisipantCat partisipantCat = new PartisipantCat("CAT");
//        PartisipantDog partisipantDog = new PartisipantDog("DOG");
        PartisipantFrog partisipantFrog = new PartisipantFrog("FROG");

        obstaclWall.start(partisipantCat);
//        obstaclWall.start(partisipantDog);
        obstaclWall.start(partisipantFrog);

        obstaclePoll.start(partisipantCat);
//        obstaclePoll.start(partisipantDog);
        obstaclePoll.start(partisipantFrog);

    }
}
