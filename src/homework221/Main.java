package homework221;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(50);
        Car car2 = new Car(20, "white");
        System.out.println(car.getAge() + " " + car.getColor());
        System.out.println(car1.getAge() + " " + car1.getColor());
        System.out.println(car2.getAge() + " " + car2.getColor());
    }
}
