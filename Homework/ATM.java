package Homework;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        System.out.println("Patika.dev bankasına hoşgeldiniz.");
        Scanner input = new Scanner(System.in);

        String userName;
        String password;
        int entryRight = 3;
        double balance = 2500;
        int selection;
        int price;

        while (entryRight > 0) {

            System.out.print("Kullanıcı adı: ");
            userName = input.nextLine();

            System.out.print("Parola: ");
            password = input.nextLine();

            if (userName.equals("emir") && (password.equals("erdem"))) {
                System.out.println("Sisteme başarıyla giriş yaptınız.");
                do {
                    System.out.println("1-Para yatırma.\n2-Para çekme.\n3-Bakiye sorgulama.\n4-Çıkış yap.");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Yetersiz bakiye.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " TL");
                            break;
                    }
                } while (selection != 4);
                System.out.println("Sağlıcakla kalın.");
                break;
            } else {
                entryRight--;
                System.out.println("Hatalı giriş yaptınız. Kalan hakkınız: " + entryRight);
                if (entryRight == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz.");
                }
            }
        }
    }
}
