package Homework;

import java.util.Scanner;

public class SolutionV3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        for (int i = 1; i <= k; i++) {
            long n = input.nextLong();
            boolean check = n < Long.MIN_VALUE && n > Long.MAX_VALUE;
            if (check) {
                System.out.println(n + " can't be fitted anywhere.");
            }
            if (!check) {
                System.out.println(n + " can be fitted in:");
            }
            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                System.out.println("* long");
            }
        }
    }
}
