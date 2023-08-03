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
    }
}
