
import java.util.Scanner;

public class NotOrtalamaV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat;
        double fzk;
        double tr;
        double kmy;
        double mzk;
        System.out.println("Sınıfta geçti/kaldı uygulamasına hoşgeldiniz. Lütfen ders notlarını 0-100 arasında giriniz.");
        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextDouble();
        if (mat > 100) {
            System.out.println("Hatalı giriş yaptınız. Lütfen 0-100 arasında olmayan değerler ortalamaya dahil edilmez.");
        }
        System.out.print("Fizik notunu giriniz: ");
        fzk = input.nextDouble();
        if (fzk > 100) {
            System.out.println("Hatalı giriş yaptınız. Lütfen 0-100 arasında olmayan değerler ortalamaya dahil edilmez.");
        }
        System.out.print("Türkçe notunu giriniz: ");
        tr = input.nextDouble();
        if (tr > 100) {
            System.out.println("Hatalı giriş yaptınız. Lütfen 0-100 arasında olmayan değerler ortalamaya dahil edilmez.");
        }
        System.out.print("Kimya notunu giriniz: ");
        kmy = input.nextDouble();
        if (kmy > 100) {
            System.out.println("Hatalı giriş yaptınız. Lütfen 0-100 arasında olmayan değerler ortalamaya dahil edilmez.");
        }
        System.out.print("Müzik notunu giriniz: ");
        mzk = input.nextDouble();
        if (mzk > 100) {
            System.out.println("Hatalı giriş yaptınız. Lütfen 0-100 arasında olmayan değerler ortalamaya dahil edilmez.");
        }
        double ortalama;
        if (mat > 100) {
            ortalama = (fzk + tr + kmy + mzk)/4;
            System.out.println("Not ortalaması: " + ortalama);
            if (ortalama > 54){
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        } else if ( fzk > 100) {
            ortalama = (mat + tr + kmy + mzk)/4;
            System.out.println("Not ortalaması: " + ortalama);
        if (ortalama > 54){
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        } 
        else if (tr > 100) {
            ortalama = (mat + fzk + kmy + mzk)/4;
            System.out.println("Not ortalaması: " + ortalama);
        if (ortalama > 54){
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
        else if (kmy > 100) {
            ortalama = (mat + fzk + tr + mzk)/4;
            System.out.println("Not ortaması: " + ortalama);
        if (ortalama > 54){
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
        else if (mzk > 100) {
            ortalama = (mat + fzk + tr + kmy)/4;
            System.out.println("Not ortalaması: " + ortalama);
        if (ortalama > 54){
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
        else {
            ortalama = (mat + fzk + tr + kmy + mzk)/5;
            System.out.println("Not ortalaması: " + ortalama);
        if (ortalama > 54){
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
    }
}
