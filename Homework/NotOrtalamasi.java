package Homework;

import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız: " + ortalama);
        boolean gectiKaldi = ortalama >= 60;
        System.out.println(gectiKaldi ? "Sınıfı Geçti." : "Sınıfta Kaldı.");
    }
}