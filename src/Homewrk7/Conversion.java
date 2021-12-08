package Homewrk7;

import java.util.Scanner;

public class Conversion {
    static int dollar(int sum, int kurs) {
        int dollar = sum * kurs;
        return dollar;
    }

    static int euro(int sum, int kurs) {
        int euro = sum * kurs;
        return euro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть вашу валюту ");
        String valuta = sc.nextLine();
        System.out.println("Введіть курс до гривні");
        int kurs = sc.nextInt();
        System.out.println("Введіть сумму в валюті яку хочете обміняти");
        int sum = sc.nextInt();
        switch (valuta) {
            case "dollar":
                int dollar = dollar(kurs, sum);
                System.out.println("Ви отримаєте " + dollar + " гривень за " + sum + " dollars");
                break;
            case "euro":
                int euro = euro(kurs, sum);
                System.out.println("Ви отримаєте " + euro + " гривень за " + sum + " euros");
                break;
            default:
                System.out.println("Неккоректна валюта");
        }


    }
}
