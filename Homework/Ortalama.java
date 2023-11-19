
import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {
        int k;
        int i;
        int total = 0;
        int cycle = 0;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k = input.nextInt();
        for (i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                cycle++;
                total += i;
            }
        }
        result = total / cycle;
        System.out.println(result);
    }
}
