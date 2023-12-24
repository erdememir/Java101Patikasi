package Homework;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Taban değerini giriniz: ");
        a = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        b = input.nextInt();
        System.out.println("Sonuç: " + power(a, b));
    }

    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * power(a, b - 1);
        }
    }
}
