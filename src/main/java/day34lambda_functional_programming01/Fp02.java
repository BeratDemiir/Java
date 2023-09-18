package day34lambda_functional_programming01;

import java.util.ArrayList;
import java.util.List;

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
    }

    // Tekrarsiz cift elemanlarinin karelerinin toplamini hesaplayan kodu yaziniz.
    public static void tekrarsizCiftElemanlarinKupCarpimi(List<Integer> list){
      Integer carpim =  list.stream().distinct().filter(t -> t%2==0).map(t -> t*t*t).reduce(1,(t,u) -> t*u);
        System.out.println(carpim);
    }

    // List Elemanlarinin arasinda en buyuk degeri bulan bir method olusturun.
}

