package Homework;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yil;
        System.out.print("Yıl giriniz: ");
        yil = inp.nextInt();
        if (yil % 4 > 0) {
            if (yil % 400 > 0) {
                System.out.println(yil + " Artık bir yıl değildir.");
            }
        } else {
            System.out.println(yil + " Artık bir yıldır.");
        }
    }
}
