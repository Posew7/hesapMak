package hesapmaki;

import java.util.Scanner;

public class islem {

    Scanner input = new Scanner(System.in);
    private double giris1;
    private double cikis = 0;
    private String islem;

    public void hesapM() {
        System.out.println("hoşgeldiniz\n"
                + "toplama için +\n"
                + "çıkarma için -\n"
                + "çarpma için *\n"
                + "bölme için /\n"
                + "çıkmak için q basınız\n"
                + "************************");

        while (true) {
            System.out.println("yapmak istediğiniz işlemi seçiniz");
            islem = input.nextLine();
            if (islem.equals("q")) {
                System.out.println("sonuç değer : " + cikis
                        + " \nprogram sonlandırıldı");
                break;
            } else if (islem.equals("+")) {
                System.out.println("sayıyı giriniz");
                giris1 = input.nextDouble();
                cikis += giris1;
                System.out.println("sonuc : " + cikis);
                input.nextLine();
            } else if (islem.equals("-")) {
                System.out.println("sayıyı giriniz");
                giris1 = input.nextDouble();
                cikis -= giris1;
                System.out.println("sonuc : " + cikis);
                input.nextLine();
            } else if (islem.equals("*")) {
                System.out.println("sayıyı giriniz");
                giris1 = input.nextDouble();
                cikis *= giris1;
                System.out.println("sonuc : " + cikis);
                input.nextLine();
            } else if (islem.equals("/")) {
                System.out.println("sayıyı giriniz");
                giris1 = input.nextDouble();
                cikis /= giris1;
                System.out.println("sonuc : " + cikis);
                input.nextLine();
            } else {
                System.out.println("mevcut olmayan bir seçim yaptınız\n"
                        + "tekrar deneyiniz");
                System.out.println("sonuc : " + cikis);
                input.nextLine();
            }

        }

    }
}
