package HomeWork2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше число");
        double a = sc.nextDouble();
        System.out.println("Введіть друге число");
        double b = sc.nextDouble();
        Rectangle rec = new Rectangle();
        System.out.println("Площа прямокутник " + rec.areaCalculator(a, b));
        System.out.println("Периметр прямокутника " + rec.perimeterCalculator(a, b));
    }


}
