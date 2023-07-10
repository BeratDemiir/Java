package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static class scanner02 {

        public static void main(String[] args) {

            // example: sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz.

            // 1.adim: Scanner Class'indan object olustur
            Scanner input=new Scanner(System.in);

            // 2.adim: kullanıciya ne yapacagini soyle
            System.out.println("ilk sayiyi giriniz...");
            double sayi1=input.nextDouble();

            System.out.println("ikinci sayıyı giriniz");
            double sayi2=input.nextDouble();

            System.out.println(sayi1+sayi2);


        }
    }

}
