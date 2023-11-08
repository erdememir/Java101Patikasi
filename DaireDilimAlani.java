import java.util.Scanner;
public class DaireDilimAlani {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double r;
        double a;
        double pi = 3.14;
        
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();
        
        double dilimAlan = (pi * (r*r) * a);
        
        System.out.print("Dairede belirtilen dilimin alanı: "+ dilimAlan);
    }
}
