package sample.Classwork.ClassworkLesson5.interfacesNew;

public class Human implements Runnable, Swimmable {
    public void run() {
        System.out.println("RUN");
    }

    public void swim() {
        System.out.println("SWIM");
    }
}
