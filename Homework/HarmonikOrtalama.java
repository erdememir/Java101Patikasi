import java.util.Scanner;

public class HarmonikOrtalama {

    public static double harmonicAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += 1 / arr[i];
        }
        return arr.length / sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı: ");
        int n = input.nextInt();

        double[] list = new double[n];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını gir: ");
            list[i] = input.nextInt();
        }
        double hAvg = harmonicAverage(list);

        System.out.println("Dizideki sayıların harmonik ortalaması: " + hAvg);
    }
}
