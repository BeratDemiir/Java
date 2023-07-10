package day04ifstataments;

import java.util.Scanner;

public class Scanner01 {

    public static class scanner01 {
        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            // 1.yol:
            System.out.println("ilk isminizi giriniz...");
            String ilkisim = input.next();

            System.out.println("ikinci isminizi giriniz...");
            String ortaisim = input.next();

            System.out.println("soy isminizi giriniz...");
            String soyisim = input.next();

            System.out.println("kimlik numaranızı giriniz...");
            String kimlikNo = input.next();

            System.out.println(ilkisim + " " + ortaisim + " " + soyisim);
            System.out.println(kimlikNo);


            //  2. yol


            System.out.println("ilk orta  soy isminizi ve kimlik numaranızı  giriniz...");
            String ilk = input.next();
            String orta = input.next();
            String soy = input.next();
            String kimlik = input.next();

            System.out.println(ilk+" "+orta+" "+soy);
            System.out.println(kimlik);

        /*
        next() ile nextLine() in farki nedir?
        next() method u kullanicidan gelen Stringin sadece ilk kelimesini alir.
        nextLine() method u kullanicidan gelen String in tamamini alir.
         */


            // 3.yol

            System.out.println("ilk orta ve soy isminizi giriniz...");
            String tamisim=input.nextLine();

            System.out.println(tamisim);

            System.out.println("kimlik numarasini yaziniz...");
            String kimliknumarasi=input.next();
            System.out.println(kimliknumarasi);

        }
    }
}
