package Homework;

import java.util.Scanner;

public class Prime {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int start = 2;
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        if (number < 2) {
            System.out.println("Asal sayılar 2den küçük olamaz.");
        } else if (number == 2){
            System.out.println("2 Asal sayıdır.");
        } else {
            System.out.print(number + isPrime(number, start));
        }

    }
    static String isPrime(int number, int start){
        String result;
        if (number % start == 0){
            return " Asal sayı değildir.";
        } else {
            if (start == number - 1){
                return " Asal sayıdır.";
            }
        start++;
            result = isPrime(number, start);
        }
        return result;
    }
}
