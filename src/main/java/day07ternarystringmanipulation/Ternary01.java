package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        // Example: Bir sayinin pozitif olup olmadıgını ekrana yazdıran kodu yazınız.

        // 1.Yol... if-else ile cozum

        int a = 12;
        if (a>0){
            System.out.println("Pozitif");
        }else {
            System.out.println("Pozitif degil");
        }

        // 2.Yol... ternary ile cozum

       String sonuc = a>0 ? "Pozitif" : "Pozitif degil";
        System.out.println(sonuc);

        // EXample: iki sayıdan kucuk olanı secen kodu yazınız.

        int b =125;
        int c =23;
        int min =b<c ? b : c;
        System.out.println("min = " + min);

        // Example: Verilen bir sayının mutlak degerini hesaplayan kodu yazınız.

        int d = -180;
        int mutlak = d<0 ? d*-1 : d;
        System.out.println("mutlak = " + mutlak);

        // Example: iki tane sayi ayni isaretli ise bu sayilari carpıniz, farkli isaretli ise "islem yapamam " mesaji veriniz.

        int e = 12;
        int f = 10;

        // Note : Ternary data tiplerinde sonuc return ederse sonucun data tipini "Object" yapiniz.

       Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "İşlem yapamam";
        System.out.println(islem);

        // Note : Java'da her class'in en az bir tane "parent" class'i vardir
        //        Sadece "Object" class'in "Parent" class'i yoktur.
        // Note: Butun class'lar non-primitive'dir.

    }
}