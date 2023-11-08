package Homework;

import java.util.Scanner;

public class NotOrtalamasiV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, kimya, turkce, muzik;
        double ortalama;

        System.out.println("Not ortalaması hesaplama programına hoş geldiniz. Lütfen değerleri 0-100 arası giriniz.");
        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        if (mat >= 0 && mat <= 100) {
            if (fizik >= 0 && fizik <= 100) {
                if (kimya >= 0 && kimya <= 100) {
                    if (turkce >= 0 && turkce <= 100) {
                        if (muzik >= 0 && turkce <= 100) {
                            ortalama = (mat + fizik + kimya + turkce + muzik) / 6;
                            System.out.println("Ortalama: " + ortalama);
                            if (ortalama >= 55) {
                                System.out.println("Sınıfı geçti.");
                            } else {
                                System.out.println("Sınıfta kaldı.");
                            }
                        } else {
                            System.out.println("Değerler 0-100 arasında olmalıdır!");
                        }
                    } else {
                        System.out.println("Değerler 0-100 arasında olmalıdır!");
                    }
                } else {
                    System.out.println("Değerler 0-100 arasında olmalıdır!");
                }
            } else {
                System.out.println("Değerler 0-100 arasında olmalıdır!");
            }
        } else {
            System.out.println("Değerler 0-100 arasında olmalıdır!");
        }
    }
}
