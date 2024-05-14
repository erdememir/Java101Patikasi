package Homework;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci serisi bulan program.");
        System.out.print("İstenilen eleman sayısı: ");
        int n = input.nextInt();
        int x = 0, y = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(x + " ");
            y = x + y;
            x = y - x;
        }
    }
}
