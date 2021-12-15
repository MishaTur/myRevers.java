package homework221;

public class Car {
    int age;
    String color;


    Car() {
        age = 10;
        color = "Blue";
    }

    Car(int age) {
        this.age = age;
        color = "Red";

    }

    Car(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
