package day34lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {

    /*
        1) Lambda(Functional Programming) Java 8 ile kullanilmaya baslamistir.
        2) Functional Programming'de "ne yapilacak" (What to do) üzerine yogunlasilir.
           Structured Programming "nasil yapilacak" (How to do)  uzerine yogunlasilir.
        3)  Functional Programming Arrays ve Collections ile kullanilir.
        4) "entrySet()" methodu ile Map, set'e donusturulerek  Functional Programming'de kullanilir.
     */
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);// [8, 9, 131, 10, 9, 10, 2, 8]

        listElemanlariniYazdirStructured(liste);// 8 9 131 10 9 10 2 8
        System.out.println();
        listElemanlariniYazdirFunctional(liste);// 8 9 131 10 9 10 2 8
        System.out.println();
        ciftElemanlariniYazdiranStructured(liste);// 8 10 10 2 8
        System.out.println();
        ciftElemanlariniYazdiranFunctional(liste);// 8 10 10 2 8
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);// 81 17161 81
        System.out.println();
        tekrarsizTekElemanlarinKupleriniYazdir(liste);// 729 2248091
        System.out.println();
        tekrarsizCiftElemaninKaresininToplami(liste);// 168
    }

    // Ardisik list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun.(Structured)
    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    // Ardisik list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
        // stream() method'u collection'dan elemanlari akisa dahil etmek icin ve methodlara ulasmak icin kullanilir.
    }

    // Cift list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun.(Structured)
    public static void ciftElemanlariniYazdiranStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    // Cift list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun.(Functional)
    public static void ciftElemanlariniYazdiranFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //  Tek list elemanlarinin karelerini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun.(Functional)
    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        // Elemanlarin degerleri degisecekse map() methodu kullanilir.
    }

    // Tek list elemanlarinin kuplerini tekrarsiz olarak ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun.(Functional)
    public static void tekrarsizTekElemanlarinKupleriniYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
        // Tekrarsiz elemanlari yazdirmak icin distinct() method'u kullanilir.
    }

    // Tekrarsiz cift elemanlarinin karelerinin toplamini hesaplayan kodu yaziniz.
    public static void tekrarsizCiftElemaninKaresininToplami(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam);
        // Dusurme azaltma( Toplama cıkarma carpma bolme) gibi islemlerde reduce() method'u kullanilir.
    }
}
