package Homewrk9;

public class UserArray {
    static int[] method(int[] array1, int value) {
        int[] arrayFirst = new int[array1.length + 1];
        for (int i = 0; i < arrayFirst.length; i++) {
            if (i == 0) {
                arrayFirst[i] = value;
                continue;
            }
            arrayFirst[i] = array1[i-1];

        }
        return arrayFirst;
    }

    public static void main(String[] args) {
        int[] arr = method(new int[]{5, 14, 66, 28, 5}, 16);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }

    }

}
