package Homework;

import java.util.Scanner;
public class BasitHesapMakinesi {
    public static void main(String[] args){
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.print("İşlem seçiniz;\n1. Toplama:\n2. Çıkarma:\n3. Çarpma:\n4. Bölme:\n");
        select = input.nextInt();
        switch(select) {
            case 1:
                System.out.println(n1+n2);
            break;
            
            case 2:
                System.out.println(n1-n2);
            break;
            
            case 3:
                System.out.println(n1*n2);
            break;
            
            case 4:
                System.out.println(n1/n2);
            break;
            
            default:
                System.out.println("Hatalı tuşlama yaptınız.");
    }
    }
}
