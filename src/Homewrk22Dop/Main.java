package Homewrk22Dop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть радіус круга ");
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        double S = MyArea.areaOfCircle(R);
        System.out.println("Площа круга = " + S);

    }
}
