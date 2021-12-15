package homework223;

public class Car {
    int age;
    double speed;
    int weight;
    String color;

    Car() {
        age = -1;
        speed = -1;
        weight = -1;
        color = "Black";
    }

    Car(int age) {
        this.age = age;

    }

    Car(int age, double speed) {
        this.age = age;
        this.speed = speed;

    }

    Car(int age, double speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;


    }

    Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return " age " + age + " speed " + speed + " weight " + weight + " color " + color;
    }


}
