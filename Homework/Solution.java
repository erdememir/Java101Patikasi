package Homework;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String xStr = input.nextLine();
        String yStr = input.nextLine();
        String zStr = input.nextLine();

        String[] wordsX = xStr.split(" ");
        int stringSizeX = wordsX[0].length();

        System.out.println("================================");
        System.out.print(wordsX[0]);
        for (int j = 1; j <= 15 - stringSizeX; j++) {
            System.out.print(" ");
        }
        System.out.println(getInt(wordsX[1]));


        String[] wordsY = yStr.split(" ");
        int stringSizeY = wordsY[0].length();

        System.out.print(wordsY[0]);
        for (int i = 1; i <= 15 - stringSizeY; i++) {
            System.out.print(" ");
        }
        System.out.println(getInt(wordsY[1]));


        String[] wordsZ = zStr.split(" ");
        int stringSizeZ = wordsZ[0].length();

        System.out.print(wordsZ[0]);
        for (int i = 1; i <= 15 - stringSizeZ; i++) {
            System.out.print(" ");
        }
        System.out.println(getInt(wordsZ[1]));

        System.out.println("================================");

    }

    static String getInt(String word) {
        int stringSizeX = word.length();
        if (stringSizeX == 2) {
            word = "0" + word;
        } else if (stringSizeX < 2) {
            word = "00" + word;
        }
        return word;
    }
}