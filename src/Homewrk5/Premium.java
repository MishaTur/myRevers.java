package Homewrk5;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        System.out.println("Введіть ваш стаж");
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int staj = sc.nextInt();
        System.out.println("Введіть вашу зп");
        int zp = sc.nextInt();
        int premia;
        if (staj >= 1 && staj <= 5) {
            premia = 10 * (zp / 100);
            System.out.println("Ваша премія = 10% від заробітньої плати. Сумма вашої премії = " + premia);
        } else if (staj >= 5 && staj < 10) {
            premia = 15 * (zp / 100);
            System.out.println("Ваша премія = 15% від заробітньої плати. Сумма вашої премії = " + premia);
        } else if (staj >= 10 && staj < 15) {
            premia = 25 * (zp / 100);
            System.out.println("Ваша премія = 25% від заробітньої плати. Сумма вашої премії = " + premia);
        } else if (staj >= 15 && staj < 20) {
            premia = 35 * (zp / 100);
            System.out.println("Ваша премія = 35% від заробітньої плати. Сумма вашої премії = " + premia);
        } else if (staj >= 20 && staj < 25) {
            premia = 45 * (zp / 100);
            System.out.println("Ваша премія = 45% від заробітньої плати. Сумма вашої премії = " + premia);
        } else if (staj >= 25 && staj < 100) {
            premia = 50 * (zp / 100);
            System.out.println("Ваша премія = 50% від заробітньої плати. Сумма вашої премії = " + premia);
        } else {
            System.out.println("Ви ввели некоректний стаж");
        }
    }
}
