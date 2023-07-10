package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {
    public static class scanner01 {

        // Scanner kullanicidan data almaya yarar, Scanner kullanici ile etkilesim kurmayı saglar.
        // Scanner bir Java Class'idir bu Class'i kullanabilmek icin "import" etmek gerekir.
        // Scanner Class'i Java nin util kütüphanesindedir.

        public static void main(String[] args) {


            // kullanicidan data almak icin yapilmasi gerekenler

            // 1.adim: Scanner Class'indan object olusturun.
            Scanner input = new Scanner(System.in);

            // 2.adim: kullaniciya ne yapacagını soyle
            System.out.println("Hey kullanıcı yasını gir...");

            // 3.adim: kullanidan aldıgınız bir data yi bir variable'nin icine koyunuz
            byte age = input.nextByte();

            System.out.println("Hey kullanıcı senin yasin " + age);


        }
    }
}

