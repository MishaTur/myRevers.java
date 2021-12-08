package Homework8;

public class Delivery {
    static int factorial(int n){
        if (n==0)
            return 1;
        else
            return n = n*(factorial(n-1));
    }
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);

    }
}
