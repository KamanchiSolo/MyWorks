package sample.Homework.HomeworkLesson2;

public class Cat {

    String name, color, address;
    int weight, age;

    private Cat() {

    }

    public Cat(String name) {
        this.name = name;
        age = 1;
        weight = 1;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 1;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        age = 1;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 1;
    }

    @Override
    public String toString() {
        return "Cat: \n name: " + (name != null ? name : "unknown") + "\n age: " + age + "\n weight: " + weight + "\n color: " + (color != null ? color : "unknown") + "\n address: " + (address != null ? address : "unknown") + "\n" + super.toString();
    }
}
