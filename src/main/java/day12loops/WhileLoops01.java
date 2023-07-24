package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

        // Example: 3'den 10'a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz.

        // 1.Yol ***
        for (int i =3; i<11 ;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        // 2.Yol ***
        int i=3;
        while (i<11){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        // Example: 17'den 4'e kadar tum cift sayilari ayni satirda yazdiran kodu yaziniz.

        int k=17;
        while (k>3){
            if (k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }
        System.out.println();
        // Example: 12'den 67'ye kadar sayilarin toplamnini veren kodu yaziniz.
        int l=12;
        int toplam=0;
        while (l<68){
            toplam =toplam+l;
            l++;
        }
        System.out.println(toplam);

        // Example: Size verilen bir tamsayinin rakamlari toplamini bulan kodu yaziniz.
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi=input.nextInt();
        int rtoplam =0;
        while (sayi>0){
            rtoplam=rtoplam+sayi%10;
            sayi=sayi/10;
        }
        System.out.println(rtoplam);

        // Example: kullanicidan aldiginiz bir sayinin carpim tablosunu yazdiran kodu yazdirin.
        Scanner scan =new Scanner(System.in);
        System.out.println("Carpim tablosunu girmek icin lütfen bir tamsayi giriniz");
        int sayi1=input.nextInt();

        int n =1;
        while (n<11){

            System.out.println(sayi1+" * "+n+" = "+sayi1*n);
            n++;
        }
    }
}
