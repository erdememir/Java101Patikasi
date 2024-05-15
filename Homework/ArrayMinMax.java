package Homework;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Arrays.sort(list);

        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        try {
            if (n < list[0]) {
                System.out.println("Girdiğiniz değerden daha küçük bir sayı yok.");
            } else if (n > list[7]) {
                System.out.println("Girdiğiniz değerden daha büyük bir sayı yok.");
            } else {
                for (int i : list) {
                    if (i < n) {
                        n1 = i;
                    }
                }
                for (int i : list) {
                    if (i > n) {
                        n2 = i;
                        break;
                    }
                }
                System.out.println("Girdiğiniz sayıya en yakın küçük sayı: " + n1);
                System.out.println("Girdiğiniz sayıya en yakın büyük sayı: " + n2);
            }
        } catch (Exception e) {
            System.out.println("Bir hata oluştu.");
        }
    }
}
