import java.util.Scanner;
public class UcgenAlani {
    public static void main (String[] args) {
        double a, b, c, u, cevre, alan2;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen birinci kenar uzunluğunu giriniz: ");
        a = input.nextDouble();
        System.out.print("Lütfen ikinci kenarın uzunluğunu giriniz: ");
        b = input.nextDouble();
        System.out.print("Lütfen üçüncü kenarın uzunluğunu giriniz: ");
        c = input.nextDouble();
        u = (a+b+c) / 2;
        cevre = u * 2;
        alan2 = u * (u - a) * (u - b) * (u - c);
        double alan = (double) Math.sqrt(alan2);
        System.out.println("Üçgenin alanı : " + alan);
    }
}
