
import java.util.Scanner;

public class SiralamaV2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("a sayısı: ");
        a = input.nextInt();
        System.out.print("b sayısı: ");
        b = input.nextInt();
        System.out.print("c sayısı: ");
        c = input.nextInt();
        System.out.print("d sayısı: ");
        d = input.nextInt();

        if ((a > b) && (a > c)) {
            if (a > d) {
                if ((b > c) && (b > d)) {
                    if (c > d) {
                        System.out.println("a > b > c > d");
                    } else {
                        System.out.println("a > b > d > c");
                    }
                } else if ((c > b) && (c > d)) {
                    if (b > d) {
                        System.out.println("a > c > b > d");
                    } else {
                        System.out.println("a > c > d > b");
                    }
                } else {
                    if ((d > b) && (d > c)) {
                        if (b > c) {
                            System.out.println("a > d > b > c");
                        } else {
                            System.out.println("a > d > c > b");
                        }
                    }
                }
            } else {
                if (b > c) {
                    System.out.println("d > a > b > c");
                } else {
                    System.out.println("d > a > c > b");
                }
            }
        } else if ((b > a) && (b > c)) {
            if (b > d) {
                if ((a > c) && (a > d)) {
                    if (c > d) {
                        System.out.println("b > a > c > d");
                    } else {
                        System.out.println("b > a > d > c");
                    }
                } else if ((c > a) && (c > d)) {
                    if (a > d) {
                        System.out.println("b > c > a > d");
                    } else {
                        System.out.println("b > c > d > a");
                    }
                } else {
                    if ((d > a) && (d > c)) {
                        if (a > c) {
                            System.out.println("b > d > a > c");
                        } else {
                            System.out.println("b > d > c > a");
                        }
                    }
                }
            } else {
                if (a > c) {
                    System.out.println("d > b > a > c");
                } else {
                    System.out.println("d > b > c > a");
                }
            }
        } else if ((c > a) && (c > b)) {
            if (c > d) {
                if ((a > b) && (a > d)) {
                    if (b > d) {
                        System.out.println("c > a > b > d");
                    } else {
                        System.out.println("c > a > d > b");
                    }
                } else if ((b > a) && (b > d)) {
                    if (a > d) {
                        System.out.println("c > b > a > d");
                    } else {
                        System.out.println("c > b > d > a");
                    }
                } else {
                    if ((d > a) && (d > b)) {
                        if (a > b) {
                            System.out.println("c > d > a > b");
                        } else {
                            System.out.println("c > d > b > a");
                        }
                    }
                }
            } else {
                if (a > b) {
                    System.out.println("d > c > a > b");
                } else {
                    System.out.println("d > c > b > a");
                }
            }
        }
    }
}
