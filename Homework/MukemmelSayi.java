package Homework;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        int toplam = 0;

        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if ((toplam - n) == n) {
            System.out.println(n + " Mükemmel bir sayıdır.");
        } else {
            System.out.println(n + " Mükemmel bir sayı değildir.");
        }
    }
}
