import java.util.Scanner;

package Homework;

public class BasamakSayilariToplami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int result = 0;
        int value;

        System.out.print("Basamakları toplanması istenen sayı: ");
        number = input.nextInt();

        while (number != 0) {
            value = number % 10;
            result += value;
            number /= 10;
        }

        System.out.println("Toplam: " + result);
    }
}
