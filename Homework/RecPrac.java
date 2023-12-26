package Homework;

import java.util.Scanner;

public class RecPrac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = input.nextInt();
        boolean incStatus = true;
        System.out.print(pos(a, a, incStatus));
    }

    static int pos(int a, int oldA, boolean incStatus) {
        if (a >= 0 && incStatus) {
            System.out.print(a + " ");
            a -= 5;
            if (a <= 0) incStatus = false;
        } else if (a < oldA && !incStatus) {
            System.out.print(a + " ");
            a += 5;
            if (a >= oldA) incStatus = true;
        }
        if (a == oldA) {
            return oldA;
        }
        return pos(a, oldA, incStatus);
    }
}
