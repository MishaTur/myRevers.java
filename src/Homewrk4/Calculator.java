package Homewrk4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введіть знак калькулятору");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        String znac = sc.nextLine();
        System.out.println("Введіть перше значення");
        sc = new Scanner(System.in);
        double operand1 = sc.nextDouble();
        System.out.println("Введіть друге значення");
        sc = new Scanner(System.in);
        double operand2 = sc.nextDouble();
        double sign;
        switch (znac) {
            case "+":
                sign = operand1 + operand2;
                System.out.println(sign);
                break;
            case "-":
                sign = operand1 - operand2;
                System.out.println(sign);
                break;
            case "*":
                sign = operand1 * operand2;
                System.out.println(sign);
                break;
            case "/":
                if (operand2 != 0) {
                    sign = operand1 / operand2;
                    System.out.println(sign);
                } else {
                    System.out.println("НА НУЛЬ ДІЛИТИ НЕ МОЖНА");
                }
                break;
            default:
                System.out.println("Ви ввели не коректний знак");

        }

    }
}

