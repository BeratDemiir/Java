package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulation01 {

    public static void main(String[] args) {

        String str = "Java is easy";

        // Note : indexOf() method'u verilen charecter veya charecter'lerin ilk gorunumun index'ini verir.

        int idxA = str.indexOf("a");
        System.out.println(idxA);// 1

        // Note : lastIndexOf() method'u verilen charecter veya charecter'lerin son gorunumun index'ini verir.

        int lidxA = str.lastIndexOf("a");
        System.out.println(lidxA);// 9

        String s ="Mississippi";

       int idxI = s.indexOf('i'); // indexOf() hem string hem de char ile kullanilabilir.
        System.out.println(idxI);// 1

        int a =s.indexOf("iss");// ilk gorunumun ilk character'inin index'ini verir.

        System.out.println(a);// 1

        int b = s.lastIndexOf("iss");// Son gorunumun ilk character'inin index'ini verir.
        System.out.println(b);// 4

        // Example: bir string'deki bir characterin tekrarli veya tekrarsiz olup olmadıgını gosteren kodu yazınız.
        //         Helloooo  H--> tekrarsiz  l--> tekrarli

        String t = "Heloooo";
        char ch ='o';

        if (t.indexOf(ch)==t.lastIndexOf(ch)){
            System.out.println("Tekrarsiz");
        }else
            System.out.println("Tekrarli");

        String u ="Learn Java earn money";

        // Note : indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar character'i gectikten sonra
        //        istenen ccharecter'in ilk index'ini return eder.

       int sonuc = u.indexOf("a",6);// "a"'nin ilk gorunumunun 6. character'den sonrasinin ilk gorunumunun index'ini almak demektir.
        System.out.println(sonuc);// 7

        int son =u.lastIndexOf("a",5);
        System.out.println(son);// 2

        // Note : lastIndexOf() iki paremetre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip en bastan
        // bu index'e kadar olan karakterleri bir kutu icine aliniz ve lastIndexOf() method'unu sadece bu kutu icindeki String icin kullaniniz.
        String m = "Hello everyone";
       int e = m.lastIndexOf("e",7);
        System.out.println(e);// 6

        String v ="Java is Java";

        // Note : isEmpty() method'u verilen string'in bos olup olmadıgını kontrol eder.
        //  eger string'de hic character yoksa isEmpty() "true" return eder. herhangi bir character varsa "false" return eder.
        // length()==0 demek isEmpty() true verir demektir. **) tercih edilen bir kullanim degildir.

       boolean bosMu = v.isEmpty();
        System.out.println(bosMu);// true

        // Note: isBlank() method'u hem bos string icin hem de "sadece space" iceren string'ler icin true return eder.

        boolean blankMi = v.isBlank();
        System.out.println(blankMi);// true

        // Example: kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if (ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");
        }else
            System.out.println(ilk);
    }
}
