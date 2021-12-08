package Homewrk5;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.println("Введіть число для перевірки");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " Число парне");
        } else {
            System.out.println(num + " Число непарне");
        }
    }


}
