package Homewrk4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число від 1 до 100");
        sc = new Scanner(System.in);
        int chislo = sc.nextInt();
        if (chislo >= 0 && chislo <= 14) {
            System.out.println("Число знаходиться в діапазоні від 1 до 14");
        } else if (chislo >= 15 && chislo <= 35) {
            System.out.println("Число знаходиться в діапазоні від 15 до 35");
        } else if (chislo >= 36 && chislo <= 50) {
            System.out.println("Число знаходиться в діапазоні від 36 до 50");
        } else if (chislo >= 51 && chislo <= 100) {
            System.out.println("Число знаходиться в діапазоні від 51 до 100");
        } else {
            System.out.println("Чмсла немає в діапазоні 0-100");
        }


    }
}
