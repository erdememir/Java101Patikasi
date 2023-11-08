package Homework;

import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlican;
        
        System.out.print("Armut kaç kilo?: ");
        kgArmut = input.nextDouble();
        
        System.out.print("Elma kaç kilo?: ");
        kgElma = input.nextDouble();
        
        System.out.print("Domates kaç kilo?: ");
        kgDomates = input.nextDouble();
        
        System.out.print("Muz kaç kilo?: ");
        kgMuz = input.nextDouble();
        
        System.out.print("Patlıcan kaç kilo?: ");
        kgPatlican = input.nextDouble();
        
        double tutar = (armut*kgArmut)+(elma*kgElma)+(domates*kgDomates)+(muz*kgMuz)+(patlican*kgPatlican);
        System.out.print("Toplam Tutar: "+tutar+" TL");
        
    }
}
