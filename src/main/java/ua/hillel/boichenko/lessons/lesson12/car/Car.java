package main.java.ua.hillel.boichenko.lessons.lesson12.car;

public class Car {

    public String color;
    protected double fuelStatus;
    int countWheels;
    private boolean isStart;

    public Car(String color, int countWheels) {
        this.color = color;
        this.countWheels = countWheels;
    }

    public void start(){
    startElectronicSystem();
    startFuelSystem();
    startGPSSystem();
    isStart = true;
    }

    public void stop(){
    stopGPSSystem();
    stopFuelSystem();
    stopElectronicSystem();
    isStart = false;
    }
    private void startElectronicSystem(){
        System.out.println("Start Electronic System");
    }
    private void startFuelSystem(){
        System.out.println("Start Fuel System");
    }
    private void startGPSSystem(){
        System.out.println("Start GPS System");
    }
    private void stopElectronicSystem(){
        System.out.println("Stop Electronic System");
    }
    private void stopFuelSystem(){
        System.out.println("Stop Fuel System");
    }
    private void stopGPSSystem(){
        System.out.println("Stop GPS System");
    }
}
