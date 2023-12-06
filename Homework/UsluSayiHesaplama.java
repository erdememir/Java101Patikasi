package Homework;

import java.util.Scanner;

public class UsluSayiHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        int ust;
        int total = 1;

        System.out.print("Üssü hesaplanacak sayı: ");
        sayi = input.nextInt();
        System.out.print("Üst sayısı: ");
        ust = input.nextInt();
        for (int i = 1; i <= ust; i++) {
            total *= sayi;
        }
        System.out.println("Cevap: " + total);

    }
}
