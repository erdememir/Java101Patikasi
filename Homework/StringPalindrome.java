package Homework;

import java.util.Scanner;

public class StringPalindrome {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Palindrom olup olmadığını öğrenmek istediğiniz kelimeyi giriniz: ");
        String word = scan.nextLine();

        if(isPalindrome(word)){
            System.out.println("'" + word + "'" + " kelimesi palindrom bir kelimedir.");
        } else {
            System.out.println("'" + word + "'" + " kelimesi palindrom bir kelime değildir.");
        }
    }
}
