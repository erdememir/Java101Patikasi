package Homework;

import java.util.Scanner;

public class KombinasyonHesabi {

    public static void main(String[] args) {
        int n;
        int r;
        double factorial1 = 1;
        double factorial2 = 1;
        double factorial3 = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("\"n\" sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("\"r\" sayısını giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial1 *= i;
        }

        for (int i = 1; i <= r; i++) {
            factorial2 *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            factorial3 *= (n - r);
        }

        double combination = factorial1 / (factorial2 * factorial3);

        System.out.println(n + " Faktöriyel: " + factorial1);
        System.out.println(r + " Faktöriyel: " + factorial2);
        System.out.println("Kombinasyonu C(n,r): " + combination);
    }
}
