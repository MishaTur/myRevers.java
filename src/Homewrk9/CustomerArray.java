package Homewrk9;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        int[] array = {5, 105, 20, 30, -5};
        int min = array[0];
        int max = array[0];
        int sum = 0;
        int arg = 0;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];

            if (max < array[i])
                max = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0)
                System.out.println("Непарні елементи массиву " + array[i]);

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            arg += array[i] / array.length;

        }


        System.out.println("Мінімальне значення масиа " + min);
        System.out.println("Максимальне значення масива " + max);
        System.out.println("Сумма всіх елементів массива " + sum);
        System.out.println("Середнє арифметичне значення всього масива " + arg);

    }
}
