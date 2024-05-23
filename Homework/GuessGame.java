package Homework;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random guess = new Random();
        int number = guess.nextInt(100);
        int right = 0;
        int userGuess;
        int[] wrongGuess = new int[5];
        boolean isWrong = false;
        boolean isWin = false;
        while (right < 5) {
            System.out.print((right + 1) + ". tahmininizi giriniz: ");
            userGuess = scan.nextInt();
            if (userGuess > 99 || userGuess < 0) {
                System.out.println("Lütfen 0-100 aralığında bir sayı giriniz.");
                if (!isWrong) {
                    System.out.println("Tekrar hatalı giriş yaparsanız hakkınızdan düşülecektir.");
                    isWrong = true;
                } else {
                    right++;
                    System.out.println("0-100 arasında bir sayı girmediniz. Kalan hakkınız: " + (5 - right));
                }
                continue;
            }
            if (userGuess == number) {
                System.out.println("Tebrikler doğru cevap!");
                isWin = true;
                break;
            } else {
                wrongGuess[right] = userGuess;
                if (number > userGuess) {
                    System.out.println("Tahmininiz gizli sayıdan küçüktür.");
                } else {
                    System.out.println("Tahmininiz gizli sayıdan büyüktür.");
                }
                right++;
                System.out.println("Hatalı giriş yaptınız. Kalan hakkınız: " + (5 - right));

            }
        }
        if (!isWin) {
            System.out.println("Hakkınız kalmadı. Tekrar deneyiniz.");
            System.out.println("Gizli sayı: " + number);
            if (!isWrong) {
                System.out.println("Hatalı girişleriniz: " + Arrays.toString(wrongGuess));
            }
        }
    }
}
