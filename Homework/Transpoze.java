package Homework;

import java.util.Arrays;

public class Transpoze {
    public static void main(String[] args) {
        int[][] list = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] tList = new int[list[0].length][list.length];
        for (int i = 0; i < list[0].length; i++) {
            for (int j = 0; j < list.length; j++) {
                tList[i][j] = list[j][i];
            }
        }
        System.out.println("Matris : ");
        for (int[] arr : list) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Transpoze : ");
        for (int[] arr : tList) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
