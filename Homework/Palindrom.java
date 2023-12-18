package Homework;

public class Palindrom {
    static boolean isPalindrom(int number) {
        int temporary = number;
        int revNumber = 0;
        int lastNumber;
        while (temporary != 0) {
            lastNumber = temporary % 10;
            revNumber = (revNumber * 10) + lastNumber;
            temporary /= 10;
        }
        if (number == revNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(8621268));
    }
}
