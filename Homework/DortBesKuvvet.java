package Homework;

import java.util.Scanner;

public class DortBesKuvvet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        System.out.print("Sınır sayı: ");
        k = input.nextInt();
        for (int i = 1; i <= k; i *= 4) {
            System.out.print(i + " ");
        }
        for (int i = 1; i <= k; i *= 5) {
            System.out.print(i + " ");
        }
    }
}
