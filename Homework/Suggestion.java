package Homework;

import java.util.Scanner;

public class Suggestion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        System.out.print("Hava kaç derece? ");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat < 25) {
            if (heat < 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (heat >= 10) {
                System.out.println("Piknik yapmaya gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
