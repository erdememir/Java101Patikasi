
import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int ebob;
        int birim;

        System.out.print("n1 sayısı: ");
        n1 = input.nextInt();

        System.out.print("n2 sayısı: ");
        n2 = input.nextInt();

        if (n2 > n1) {
            birim = n1;
            do {
                if (n1 % birim == 0 && n2 % birim == 0) {
                    ebob = birim;
                    System.out.println("EBOB: " + ebob);
                    System.out.println("EKOK: " + (n1 * n2) / ebob);
                    break;
                }
                birim--;
            } while (birim >= 1);
        } else {
            birim = n2;
            do {
                if (n1 % birim == 0 && n2 % birim == 0) {
                    ebob = birim;
                    System.out.println("EBOB: " + ebob);
                    System.out.println("EKOK: " + (n1 * n2) / ebob);
                    break;
                }
                birim--;
            } while (birim >= 1);
        }
    }
}
