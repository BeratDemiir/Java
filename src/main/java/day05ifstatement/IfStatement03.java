package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    // Note: iki tane String in birbirine esit olup olmadıgını anlamak icin "==" degil "equals()" kullanilir.
    // Note: iki tane String in birbirine esit olup olmadıgını anlamak icin iki tane method kullanilir.
      //  1:) equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir.
      //  2:) equalsIgnoreCase() ==> Buyuk harf kucuk harf ayrimi yapmaz "A" ile "a" aynidir.

    public static void main(String[] args) {

        // Example: Kullanicidan gun isimlerini aliniz, o gunu hafta sunu mu hafta ici mi oldugunu kullaniciya soyleyin.

        Scanner input=new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz...");
        String gun=input.next();

        if (gun.equalsIgnoreCase("pazar")){
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("pazartesi")) {
            System.out.println("Hafta içi...");
        }else if (gun.equalsIgnoreCase("sali")) {
            System.out.println("Hafta içi...");
        }else if (gun.equalsIgnoreCase("carsamba")) {
            System.out.println("Hafta içi...");
        }else if (gun.equalsIgnoreCase("persembe")) {
            System.out.println("Hafta içi...");
        }else if (gun.equalsIgnoreCase("cuma")) {
            System.out.println("Hafta içi...");
        } else if (gun.equalsIgnoreCase("cumartesi")) {
            System.out.println("Hafta sonu...");
        }else {
            System.out.println("Gecerli bir gün ismi giriniz");
        }

        // 2.Yol...

        if (gun.equalsIgnoreCase("Pazar")||gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        } else if (gun.equalsIgnoreCase("pazartesi") ||
                   gun.equalsIgnoreCase("Sali") ||
                   gun.equalsIgnoreCase("carsamba") ||
                   gun.equalsIgnoreCase("persembe") ||
                   gun.equalsIgnoreCase("cuma")) {
            System.out.println("Hafta içi...");
        }else {

            System.out.println("Gecerli bir gün ismi giriniz");

        }

        //**// 3.yol...****

       boolean haftaSonu= gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

       boolean haftaIci= gun.equalsIgnoreCase("pazartesi") ||
                         gun.equalsIgnoreCase("Sali") ||
                         gun.equalsIgnoreCase("carsamba") ||
                         gun.equalsIgnoreCase("persembe") ||
                         gun.equalsIgnoreCase("cuma");

        if (haftaSonu){
            System.out.println("Hafta sonu...");
        } else if (haftaIci) {
            System.out.println("Hafta içi...");
        }else {

            System.out.println("Gecerli bir gün ismi giriniz");

        }
    }
}
