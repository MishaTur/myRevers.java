package Homewrk6;

public class SumMin {
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int sum = 0;
        for (int i = A; i < B; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел " + sum);
        for (int i = A; i < B; i++) {
            if (!(i % 2 == 0)) {
                System.out.println("Непарні числа з діапазона " + i);
            }
        }

    }
}

