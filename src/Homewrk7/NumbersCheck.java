package Homewrk7;

import java.util.Scanner;

public class NumbersCheck {
    static String poloj(int number) {
        if (number < 0) {
            return "Число від*ємне ";
        }
        if (number > 0) {
            return "Число плюсове";
        } else
            return "Дане число 0 ";

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String poloj = poloj(number);
        System.out.println(poloj);

    }
}
