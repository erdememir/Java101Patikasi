package Homework;

import java.util.Scanner;

public class ChZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Çin Zodyağı burcu bulma programına hoşgeldiniz.");
        int year;
        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();
        int zNumber = year%12;
        int zAnimal;
        switch(zNumber){
            case 0:
                System.out.println("Çin zodyağı burcunuz \"maymun\"");
                break;
            case 1:
                System.out.println("Çin zodyağı burcunuz \"horoz\"");
                break;
            case 2:
                System.out.println("Çin zodyağı burcunuz \"köpek\"");
                break;
            case 3:
                System.out.println("Çin zodyağı burcunuz \"domuz\"");
                break;
            case 4:
                System.out.println("Çin zodyağı burcunuz \"fare\"");
                break;
            case 5:
                System.out.println("Çin zodyağı burcunuz \"öküz\"");
                break;
            case 6:
                System.out.println("Çin zodyağı burcunuz \"kaplan\"");
                break;
            case 7:
                System.out.println("Çin zodyağı burcunuz \"tavşan\"");
                break;
            case 8:
                System.out.println("Çin zodyağı burcunuz \"ejderha\"");
                break;
            case 9:
                System.out.println("Çin zodyağı burcunuz \"yılan\"");
                break;
            case 10:
                System.out.println("Çin zodyağı burcunuz \"at\"");
                break;
            case 11:
                System.out.println("Çin zodyağı burcunuz \"koyun\"");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
