package Homewrk2;

public class Work1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 3;
        x += y - x++ * z;
        z = --x - y * 5;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
        System.out.println(x);
        System.out.println(z);
        System.out.println(y);

    }
}
