package Homework;

import java.util.Scanner;

public class Ticket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distance;
        int age;
        int type;
        double total;
        System.out.print("Mesafeyi km cinsinde giriniz: ");
        distance = input.nextDouble();
        if (distance <= 0) {
            System.out.println("Hatalı giriş yaptın.");
            return;
        }
        System.out.print("Yaşınızı belirtiniz: ");
        age = input.nextInt();
        if (age <= 0) {
            System.out.println("Hatalı giriş yaptın.");
            return;
        }
        System.out.print("Sadece gidiş için \"1\", gidiş-dönüş için \"2\" yazınız: ");
        type = input.nextInt();

        total = distance * 0.10;

        double discount = 0;
        double totalV2;
        double discountV2;
        double totalV3;
        if ((age < 13) && (age >= 0)) {
            discount = total * 0.50;
        } else if ((age > 12) && (age < 25)) {
            discount = total * 0.10;

        } else if (age >= 65) {
            discount = total * 0.30;
        } else if ((age < 65) && (age > 24)) {
            discount = 0;
        } else {
            System.out.println("Hatalı giriş yaptın.");
        }

        switch (type) {
            case 1:
                totalV2 = total - discount;
                System.out.println("İndirimler sonrası toplam ücret: " + totalV2 + "TL");
                break;
            case 2:
                totalV2 = total - discount;
                discountV2 = totalV2 * 0.20;
                totalV3 = (totalV2 - discountV2) * 2;
                System.out.println("İndirimler sonrası toplam ücret: " + totalV3 + "TL");
                break;
            default:
                System.out.println("Hatalı giriş yaptın.");
                break;
        }


    }
}