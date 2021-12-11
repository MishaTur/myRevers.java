package Homewor2k4;

public class Computer {
    String detail;

    public static void main(String[] args) {
        Computer[] computer = new Computer[5];
        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();
        for (int i = 0; i < 5; i++) {
            computer[i].detail = "detail" + i;

        }
        for (Computer comp : computer) {
            System.out.println("detail: " + comp.detail);
        }


    }

}
