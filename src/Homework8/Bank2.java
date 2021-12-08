package Homework8;

import java.util.Scanner;

public class Bank2 {
    static int Pay1(int kredit, int pay1) {
        int pereplata = pay1 - kredit;
        if (kredit > pay1) {
            int borg = kredit - pay1;
            return borg;
        } else return pereplata;
    }

    static int Pay2(int kredit, int pay1, int pay2) {
        if (kredit > pay1 + pay2) ;
        int borg = kredit - pay1 - pay2;
        return borg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть сумму кредиту");
        int kredit = sc.nextInt();
        System.out.println("Введіть сумму першого платежу");
        int pay1 = sc.nextInt();
        if (Pay1(kredit, pay1) < kredit) {
            int pay2 = sc.nextInt();
            System.out.println("Ваш борг становить " + Pay2(kredit, pay1, pay2));

        } else {
            System.out.println("Ваш борг виплачено. Ваша переплата становить " + Pay1(kredit, pay1));
        }


    }
}
