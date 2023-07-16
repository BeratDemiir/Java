package day08stringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {

        // Example : kullanicidan aldiginiz isimin ilk ve son harfini ekrana yazdırın.
        //           Ramazan ==> Rn

       Scanner input = new Scanner(System.in);
   //    System.out.println("Lütfen isminizi giriniz...");
   //    String isim = input.next();

   //    // 1.Yol...
   //    char ilkHarf = isim.charAt(0);
   //    char sonHarf = isim.charAt(isim.length()-1);
   //    System.out.println(""+ilkHarf+sonHarf);

   //    // 2.Yol...
   //    String ilk = isim.substring(0,1);
   //    String son = isim.substring(isim.length()-1);
   //    System.out.println(ilk+son);

        // Example: Verilen stringdeki tum hayvan isimlerini ekrana yazdırın.
        //         "Ben kedi, esim tavuk, oglum inek sever"

        String str = "Ben kedi, esim tavuk, oglum sever inek";

        // substring() in iki kullanimi vardir.
        // 1) substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar.
        // 2) substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar.

        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek = str.substring(34);

        System.out.println(kedi+"\t"+tavuk+"\t"+inek);

        // Example: ilk isimi ve soy isimi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdirin.
        //      Ali Can ==> AC     Tahsin Yurdakul ==> TY

        System.out.println("ilk ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

       String a = tamIsim.substring(0,1);
       String b = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a+b);



    }
}
