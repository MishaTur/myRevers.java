package Homework8;

import java.util.Scanner;

public class Bank {
    static void paymentFull(int kredit, int payment1, int payment2, int payment3) {
        if (kredit > payment1 + payment2 + payment3) {
            int nedoplata = kredit - payment1 - payment2 - payment3;
            System.out.println("Вам необхідно ще доплатити " + nedoplata);
        } else if (kredit == payment1 + payment2 + payment3) {
            System.out.println("Ваш кредит повністю погашено");
        } else {
            int overPay = payment1 + payment2 + payment3 - kredit;
            System.out.println("Ваш кредит повністю погашено. Ваша переплата = " + overPay);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть сумму вашого кредиту");
        int kredit = sc.nextInt();
        System.out.println("Введіть сумму вашого першого платежу");
        int pay1 = sc.nextInt();
        System.out.println("Введіть сумму вашого другого платежу");
        int pay2 = sc.nextInt();
        System.out.println("Введіть сумму вашого третього платежу");
        int pay3 = sc.nextInt();

        paymentFull(kredit, pay1, pay2, pay3);

    }
}
