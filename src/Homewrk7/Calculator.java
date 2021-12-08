package Homewrk7;

import java.util.Scanner;

public class Calculator {
    static double rezultat(double number1, double number2, double number3) {
        double rezultat = (number1 + number2 + number3) / 3;
        return rezultat;
    }

    public static void main(String[] args) {
        System.out.println("Введіть перше число");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Введіть друге число");
        int number2 = sc.nextInt();
        System.out.println("Введіть третє число");
        int number3 = sc.nextInt();
        double rezultat = rezultat(number1, number2, number3);
        System.out.println("Середнє арифметичне ваших числе " + rezultat);


    }
}
