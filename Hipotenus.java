import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a, b, c, a2, b2, c2;
        System.out.print("Lütfen hipotenüsünü hesaplamak istediğiniz üçgenin a kenarı uzunluğunu giriniz: ");
        a = input.nextDouble();
        System.out.print("Lütfen hipotenüsünü hesaplamak istediğiniz üçgenin b kenarı uzunluğunu giriniz: ");
        b = input.nextDouble();
        b2 = b * b;
        a2 = a * a;
        c2 = a2 + b2;
        c = (double) Math.sqrt(c2);
        System.out.print("Üçgeninizin hipotenüsü: " + c);
    }
}
