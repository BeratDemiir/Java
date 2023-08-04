package daymultidimensionalarrays_arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        /*
            ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
            Array ile ArrayList'in farki nedir?
                1) Array olsutururken Array'in icine kac tane elaman koymaniz gerektigini soylemeliyiz, soyledigimiz elaman sayisindan
                fazla elaman koyamayız. Array'ler elaman sayisinda "fixed" dirler

                Arraylist'leri olsutururken elaman sayisi soylemeye gerek yok, cunku ArrayList'ler elaman sayisindan "flexible"(esnek) dirler

               2) array'lerin icine "Primitive" ve "referance" ler konabilir
               ArrayList'lerin icine ise sadece "non-primitive" ler konur.

               3)Array'ler "super fast"(cok hizli). Array'ler memory'i cok az kullanir.

              Note: Elaman sayisi belli olan coklu data'lari depolamak icin Array kullaniriz, ama
              elaman sayisi degisken olan coklu data'lar icin Array kullanma riskini almayin.
         */

        // ArrayList nasil olusturulur?
        // 1.Yol
        ArrayList<Integer> ages = new ArrayList<Integer>();
        // 2.Yol
        ArrayList<Integer> heights = new ArrayList<>();
        // 3.Yol
        List<Integer> numes = new ArrayList<>();

        // ArrayList'ler nasil yazdirilir?
        System.out.println(numes);// []

        // ArrayList'lere elaman nasil eklenir?
        // add() her zaman elamani en sona ekler.(insertion order)
        numes.add(21);
        numes.add(18);
        numes.add(20);
        System.out.println(numes);// [21, 18, 20]

        numes.add(1,50); // verilen index'e elaman ekler.
        System.out.println(numes);// [21, 50, 18, 20]

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        numes.addAll(prices);
        System.out.println(numes);// [21, 50, 18, 20, 23, 185]

        numes.addAll(2,prices);
        System.out.println(numes);// [21, 50, 23, 185, 18, 20]

        // ArrayList'lerin eleman sayisi nasil bulunur?
       int elamanSayisi = numes.size();
        System.out.println(elamanSayisi);// 8

        // ArrayList'lerde herhangi bir elaman nasil secilir?
        // get() methodu istenen bir index'teki elamani verir.
        int e1 = numes.get(3);// 185

        // ArrayKist'lerin bos olup olmadigini nasil anlariz?
       boolean bos1 = numes.isEmpty();
        System.out.println(bos1);// false

        // ArrayList'de bir eleman nasil degistirir?
        numes.set(3,200);
        System.out.println(numes);// [21, 50, 23, "200", 18, 20]

        // Example: numes ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

        for (int w :numes){
            if (w%2!=0){
                numes.set(numes.indexOf(w),w+11);
            }
        }
        System.out.println(numes);// [32, 50, 34, 200, 18, 20]

        // remove() method'unun icine tamsayi koyarsaniz java onu index olarak kabul eder
        // Example: ArrayList'den 200 elamanini siliniz
        // Note: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir yani "int" dir.
        // Note: "primitive" ler Arraylist'lerin elamani olamazlar.
        // Note: "primitive" i "wrapper Class" a cevirirseniz, non primitive olur ve non primitive ler ArrayList'lerin elamani olur index olmaz.
        Integer sayi = 200;
        numes.remove(sayi);
        System.out.println(numes);// [32, 50, 34, 18, 20]

    }
}
