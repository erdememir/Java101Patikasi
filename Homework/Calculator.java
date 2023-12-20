package Homework;

import java.util.Scanner;

public class Calculator {
    static int plus(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println(a + " x " + b + " = " + result);
        return result;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0 olamaz.");
            return 0;
        }
        int result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + " ^ " + b + " = " + result);
        return result;
    }

    static int fact(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        System.out.println(a + "!" + " = " + result);
        return result;
    }

    static int mode(int a, int b) {
        int result = a % b;
        System.out.println(a + " sayısı " + b + "'ye bölündükten sonra kalan: " + result);
        return result;
    }

    static void rect(int a, int b) {
        System.out.println("Dikdörtgenin çevresi: " + (2 * (a + b)));
        System.out.println("Dikdörtgenin alanı: " + (a * b));
    }

    int select;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkartma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktöriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";
        int select;

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = input.nextInt();
            System.out.print("İlk sayıyı giriniz: ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            int b = input.nextInt();
            switch (select) {
                case 1:
                    plus(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    fact(a);
                    break;
                case 7:
                    mode(a, b);
                    break;
                case 8:
                    rect(a, b);
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
        System.out.println("Hoşçakalın.");
    }
}
