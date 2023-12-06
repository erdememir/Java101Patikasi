package Homework;

import java.util.Scanner;

public class DortKatlariToplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int total = 0;
        do {
            System.out.print("Sayı giriniz: ");
            i = input.nextInt();
            if (i % 4 == 0) {
                total += i;
            }
        } while (i % 2 == 0);
        System.out.println("Sonuç: " + total);
    }
}
