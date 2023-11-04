
import java.util.Scanner;

public class IdPw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id;
        String pw;
        System.out.print("Kullanıcı Adı: ");
        id = input.nextLine();
        System.out.print("Şifre: ");
        pw = input.nextLine();
        if (id.equals("emir") && pw.equals("123456")) {
            System.out.println("Kullanıcı girişi başarılı.");
        } else {
            String onay;
            System.out.println("Hatalı giriş yaptınız. Şifrenizi yenilemek istiyorsanız \"Evet\", istemiyorsanız \"Hayır\" ile cevaplayınız.");
            onay = input.nextLine();
            if (onay.equals("Evet")) {
                String nPw;
                System.out.println("Yeni şifrenizi giriniz:");
                nPw = input.nextLine();
                if (nPw.equals("123456")) {
                    System.out.println("Yeni şifre eskisiyle aynı olamaz.");
                } else {
                    System.out.println("Şifreniz başarıyla değiştirilmiştir.");
                }
            } else {
                System.out.println("Tekrar deneyiniz.");
            }

        }
    }
}
