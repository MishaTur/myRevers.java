package Homewrk5;

import java.sql.SQLOutput;

public class DeMorganComparison {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if(!a | !b)
            System.out.println((!a | !b));

        else
            System.out.println((!a | !b));
        if(!(a && b))
            System.out.println(!(a && b));
        else
            System.out.println(!(a && b));

    }
}
