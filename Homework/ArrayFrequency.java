package Homework;

import java.util.Arrays;

public class ArrayFrequency {

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        int count = 1;
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] == list[i + 1]) {
                count++;
            } else {
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
                count = 1;
            }

        }
        System.out.println(list[list.length - 1] + " sayısı " + count + " kere tekrar edildi.");
    }
}
