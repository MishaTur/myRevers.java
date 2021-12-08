package Homewrk2;

public class Volume {
    public static void main(String[] args) {
        final double Pi = 3.141592653;
        int R = 5;
        int H = 2;
        double V = Pi * Math.pow(R, 2) * H;
        double S = 2 * Pi * Math.pow(R, 2) + 2 * Pi * Math.pow(R, 2);
        System.out.println(V);
        System.out.println(S);

    }
}
