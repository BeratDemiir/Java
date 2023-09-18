package day34lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fp02 {

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

        tekrarsizCiftElemanlarinKupCarpimi(liste);// 4096000
        getMaxEleman(liste);// 131
        getMaxEleman1(liste);// 2 8 9 10 131
        System.out.println();
        getMinEleman(liste);// 2
        getYedideBuyukCiftMin(liste);// 8
        getYedideBuyukCiftMin1(liste);
    }

    // Tekrarsiz cift elemanlarinin karelerinin toplamini hesaplayan kodu yaziniz.
    public static void tekrarsizCiftElemanlarinKupCarpimi(List<Integer> list){
      Integer carpim =  list.stream().distinct().filter(t -> t%2==0).map(t -> t*t*t).reduce(1,(t,u) -> t*u);
        System.out.println(carpim);
    }

    // List Elemanlarinin kucukten buyuge dogru siralayan ve en buyuk degeri yazdiran bir method olusturun.
    public static void getMaxEleman(List<Integer> list){
      Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u) -> u);
        System.out.println(max);
    }

    // List Elemanlarinin kucukten buyuge dogru siralayan bir method olusturun
    public static void getMaxEleman1(List<Integer> list) {
     list.stream().distinct().sorted().forEach(t -> System.out.print(t + " "));
     // sorted() method'u list'deki elemanlari kucukten buyuge dogru siralar
    }

    // List Elemanlarinin kucukten buyuge dogru siralayan ve en kucuk degeri yazdiran bir method olusturun.
       public static void getMinEleman(List<Integer> list){
        Integer min1 = list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t,u) -> t>u ? t : u);
           System.out.println(min1+ "  ");// 2
       }


    // List Elemanlari arasinda 7'den buyuk, cift, en kucuk degeri bulan bir method yaziniz.
    public static void getYedideBuyukCiftMin(List<Integer> list){
     Integer min2 = list.stream().distinct().filter(t -> t%2==0).filter(t -> t>7).reduce(Integer.MAX_VALUE,(t,u) -> t<u ? t : u);
        System.out.println(min2 + " ");// 8
    }

    // 2.Yol
    public static void getYedideBuyukCiftMin1(List<Integer> list){
      Integer ciftMin = list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t,u) -> u);
        System.out.println(ciftMin);
    }
}

