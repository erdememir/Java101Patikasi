
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
        System.out.print("Yaşınızı belirtiniz: ");
        age = input.nextInt();
        System.out.print("Sadece gidiş için \"1\", gidiş-dönüş için \"2\" yazınız: ");
        type = input.nextInt();

        total = distance * 0.10;
        if (distance > 0) {
            double discount;
            double totalV2;
            double discountV2;
            double totalV3;
            if ((age < 13) && (age >= 0)) {
                discount = total * 0.50;
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
                        System.out.println("Hatalı giriş yaptınız.");
                        break;
                }
            } else if ((age > 12) && (age < 25)) {
                discount = total * 0.10;
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
                        System.out.println("Hatalı giriş yaptınız.");
                        break;
                }
            } else if (age >= 65) {
                discount = total * 0.30;
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
                        System.out.println("Hatalı giriş yaptınız.");
                        break;
                }
            } else if ((age < 65) && (age > 24)) {
                switch (type) {
                    case 1:
                        totalV2 = total;
                        System.out.println("İndirimler sonrası toplam ücret: " + totalV2 + "TL");
                        break;
                    case 2:
                        discountV2 = total * 0.20;
                        totalV3 = (total - discountV2) * 2;
                        System.out.println("İndirimler sonrası toplam ücret: " + totalV3 + "TL");
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız.");
            }
        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
