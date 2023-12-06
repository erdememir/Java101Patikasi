package Homework;

import java.util.Scanner;

public class MinMaxFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gireceğiniz sayı adeti: ");
        int n = input.nextInt();
        int maxValue = 1;
        int minValue = 1;
        int current;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            current = input.nextInt();
            if (i == 1) {
                maxValue = current;
                minValue = current;
            }
            if (current > maxValue) {
                maxValue = current;
            } else if (current < minValue) {
                minValue = current;
            }
        }
        System.out.println("En küçük sayı: " + minValue + "\nEn büyük sayı: " + maxValue);
    }
}
