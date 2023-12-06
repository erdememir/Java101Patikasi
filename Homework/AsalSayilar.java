
public class AsalSayilar {

    public static void main(String[] args) {
        boolean a;
        for (int i = 2; i <= 100; i++) {
            a = true;
            for (int k = 2; k <= i - 1; k++) {
                if (i % k == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + " ");
            }
        }
    }
}
