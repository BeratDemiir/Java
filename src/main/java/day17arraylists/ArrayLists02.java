package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {

    public static void main(String[] args) {

        // Example: Verilen bir List'deki elamanlari tekrarsiz olarak yaziniz.
        //     [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();
        for (Integer w: a){
            if (!yeni.contains(w)){
                yeni.add(w);
            }
        }
        System.out.println(yeni);// [2, 3, 5]

        // Example: Kullanicidan bir harf aliniz harf sizdeki list'in icinde varsa o harfi bulunduya ceviriniz yoksa o harfi liste ekleyiniz
        //          [A, K, R, S]  ==> R  ==> [A, K, bulundu, S]
        //          [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner input = new Scanner(System.in);
        String harf ="";
        List<String> b = new ArrayList<>();
        b.add("A");
        b.add("K");
        b.add("R");
        b.add("S");
        do {
            System.out.println("Lütfen bir harf giriniz");
             harf = input.next().substring(0,1);
            if (b.contains(harf)){
                b.set(b.indexOf(harf), "bulundu");
            }else if (!harf.equals("Q")){
                b.add(harf);
            }
            System.out.println(b);
        }while (!harf.equals("Q"));

    }
}
