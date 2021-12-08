package Homewrk6;

public class Delivery {
    public static void main(String[] args) {
        int N = 7;
        int rez = 1;
        int rez2 = 1;
        do {
            rez *= N--;
        } while (N > 0);
        System.out.println(rez);
        for (int i = 6; i > 0; i--) {
            rez2 *= i;
        }
        System.out.println(rez2);

    }

}
