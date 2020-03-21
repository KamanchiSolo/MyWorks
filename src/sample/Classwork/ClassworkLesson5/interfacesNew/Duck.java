package sample.Classwork.ClassworkLesson5.interfacesNew;

public class Duck implements Runnable,Swimmable, Flyable {

    public void run() {
        System.out.println("RUN");
    }
    public void swim() {
        System.out.println("SWIM");
    }
    public void fly() {
        System.out.println("FLY");
    }
}
