package sample.Homework.HomeworkLesson4.Inheritance1;

public class Airplane extends Transport {
    int maxHeight;

    public Airplane(String releaseDate, String model, int passengerCapacity, int maxSpeed) {
        super(releaseDate, model, passengerCapacity);
        this.maxHeight = maxSpeed;
    }

    public void autopilotMove() {
        System.out.println("Летим с включенным авто-пилотом...");
    }

    @Override
    public void move() {
        System.out.println("Летим...");
    }
}

