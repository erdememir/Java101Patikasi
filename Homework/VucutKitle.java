package Homework;

import java.util.Scanner;
public class VucutKitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double kg;
        double boy;
        
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextDouble();
        
        double vke = kg / (boy * boy);
        System.out.print("Vücut kitle endeksiniz: " + vke);
    }    
}
