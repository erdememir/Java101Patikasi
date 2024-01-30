package Homework;

import java.util.Scanner;

public class SolutionV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            for (int j = 0; j < n; j++) {
                a = a + ((int) Math.pow(2, j) * b);
                System.out.print(a);
                if (j != n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}