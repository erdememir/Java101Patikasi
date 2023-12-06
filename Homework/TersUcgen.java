package Homework;

import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        int n = input.nextInt();
        int z = 0;
        int k = n * 2 - 1;
        for (int x = 1; x <= n; x++) {
            z++;
            for (int y = 1; y <= z - 1; y++) {
                System.out.print(" ");
            }
            for (int u = 1; u <= k; u++) {
                System.out.print("*");
            }
            k -= 2;
            System.out.println();
        }
    }
}
