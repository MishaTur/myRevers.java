package homework223;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(3);
        Car car3 = new Car(5, 200);
        Car car4 = new Car(2, 230, 500);
        Car car5 = new Car(8, 180, 800, "Orange");
        System.out.println("Перша машина " + car1.toString());
        System.out.println("Друга машина " + car2.toString());
        System.out.println("Третя машина " + car3.toString());
        System.out.println("Четверта машина " + car4.toString());
        System.out.println("П*ята машина " + car5.toString());
    }
}
