package Homework8;

import java.util.Scanner;


public class Calculator {
    static void calculate(int number1, int nubmer2, int number3) {
        System.out.println("Перше число = " + number1 / 5);
        System.out.println("Друге число = " + nubmer2 / 5);
        System.out.println("Третє чило = " + number3 / 5);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше число ");
        int number1 = sc.nextInt();
        System.out.println("Введіть друге число ");
        int number2 = sc.nextInt();
        System.out.println("Введіть третє число ");
        int number3 = sc.nextInt();
        calculate(number1, number2, number3);

    }
}
