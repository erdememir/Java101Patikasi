package Homework;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int n = input.nextInt();
        System.out.println("Dizinin elemanlarını giriniz: ");
        int[] list = new int[n];
        int indexNumber = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Elemanı: ");
            int j = input.nextInt();
            list[indexNumber++] = j;
        }
        Arrays.sort(list);

        //System.out.println("Sıralama: " + Arrays.toString(list));

        System.out.print("Sıralama: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
