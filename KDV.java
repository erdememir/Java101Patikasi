import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double tutar, dusukKdv, yuksekKdv, kdvli, kdvFarki;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen fiyat belirtiniz: ");
        tutar = input.nextDouble();
        dusukKdv = 1.08;
        yuksekKdv = 1.18;
        kdvFarki = tutar >= 1000 ? tutar * 0.08 : tutar * 0.18;
        kdvli = tutar >= 1000 ? tutar * dusukKdv : tutar * yuksekKdv;
        System.out.println("KDV'siz ücret: " + tutar + " TL");
        System.out.println( tutar >= 1000 ? "KDV oranı: %8" : "KDV oranı: %18");
        System.out.println("KDV farkı: " + kdvFarki + " TL");
        System.out.println("Toplam: " + kdvli + " TL");
    }
}
