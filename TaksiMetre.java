import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);
        double km, toplamUcret, tmAcilis, kmUcret;
        System.out.print("Kaç km yol gidildiğini belirtiniz: ");
        km = girdi.nextDouble();
        kmUcret = 2.20;
        tmAcilis = 10;
        toplamUcret = (km * kmUcret) + tmAcilis;
        System.out.println("Katedilen mesafe: " + km + " km");
        System.out.println(toplamUcret <= 19 ? "Toplam ücret: 20 TL" : "Toplam ücret: " + toplamUcret);
    }
}
