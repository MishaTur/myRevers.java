package Homewrk7;

import java.util.Scanner;

public class Arithmetics {
    static int add(int number1, int number2) {
        int add = number1 + number2;
        return add;
    }

    static int sub(int number1, int number2) {
        int sub = number1 - number2;
        return sub;
    }

    static int mul(int number1, int number2) {
        int mul = number1 * number2;
        return mul;
    }

    static double div(double number1, int number2) {
        switch (number2) {
            case 0:
                System.out.println("Ділити на нуль заборонено");
                break;
            default:
                double div = number1 / number2;
                return div;
        }


        double div = number1 / number2;
        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int number1 = sc.nextInt();
        System.out.println("Введіть друге число");
        int number2 = sc.nextInt();
        System.out.println("Введіть znak");
        sc = new Scanner(System.in);
        String znak = sc.nextLine();
        switch (znak) {
            case "+":
                int add = add(number1, number2);
                System.out.println("Результат додавання " + add);
                break;
            case "-":
                int sub = sub(number1, number2);
                System.out.println("Результат віднімання " + sub);
                break;
            case "*":
                int mul = mul(number1, number2);
                System.out.println("Результат множення " + mul);
            case "/":
                double div = div(number1, number2);
                System.out.println("Результат ділення " + div);
                break;


        }


    }
}
