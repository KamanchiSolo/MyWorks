package sample.Homework.HomeworkLesson4.Inheritance1;

public class Train extends Transport {

    int maxSpeed;

    public Train(String releaseDate, String model, int passengerCapacity) {
        super(releaseDate, model, passengerCapacity);
    }

    public void beep(){
        System.out.println("Гудок");
    }
    @Override
    public void move(){
        System.out.println("Riding on rails");
    }
}
