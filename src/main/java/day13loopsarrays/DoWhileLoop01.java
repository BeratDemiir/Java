package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        // Example: kullancidan bir sayi aliniz sayi 100'den kucuk ise ekrana "Kazandin!" yazdiriniz
        //          Aksi halde ekrana "Kaybettin!" yazdiriniz.
        //          kullanici kazandikca oyun devam etmeli.

        Scanner input =new Scanner(System.in);
        int sayi =0;
        do {
            System.out.println("Lütfen bir sayi giriniz...");
            sayi =input.nextInt();
            if (sayi<100){
                System.out.println("kazandiniz!");
            }
        }while (sayi<100);
        System.out.println("kaybettiniz!");


        // Example: kullanicidan ismini aliniz ilk harfin buyuk olup olmadıgını kontrol ediniz.
       do {
            System.out.println("isim giriniz");
            char ilkHarf =input.nextLine().charAt(0);
            if (ilkHarf>='A' && ilkHarf<='Z'){
                System.out.println("ismi basariyla girdiniz");
            }else {
                System.out.println("ismi yanlis girdiginiz icin isleminiz iptal edilmistir");
                break;
            }
        }while (true);

        // Infinite Loop: Sonsuz dongu
        // Note: Arttirma azaltma kisminda hata yaparsaniz yada yazmazsaniz "infinite loop sorunsali" olusur.
    }
}
