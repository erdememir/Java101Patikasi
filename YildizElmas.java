package Homework;

import java.util.Scanner;

public class YildizElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int x = 2 * n - 1;
        int z = 0;
        for (int a = x; a >= 1; a -= 2) {
            z++;
            for (int b = 1; b <= (z * 2) - z; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c < a - 1; c++) {
                System.out.print("*");
            }
            if (a != 1) {
                System.out.println();
            }
        }
    }
}
