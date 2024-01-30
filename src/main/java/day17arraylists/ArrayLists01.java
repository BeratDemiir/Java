package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);// [Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        // Note: removeAll() kullandiginizda sadece ilk list degisir parantez icindeki list degismez.
        names.removeAll(cities);
        System.out.println(names);// [Thomas, Tahsin]


        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        // Note: containsAll() Method'u bir list'in icinde coklu elamanlarin var olup olmadigini kontrol eder.
        //       hepsi varsa "true"  en az biri varsa "false" verir.
        boolean sonuc1 = names.containsAll(myNames);
        System.out.println(sonuc1);// true


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("Tv");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        // Example: a Listin'de "Shoes" elamaninin ilk gorunumunu siliniz.

        a.remove("Shoes");// remove() ilk gorunumu siler
        System.out.println(a);// [Tv, Radio, Laptop, Shoes, Book, Shoes]

        // Example : a Listin'deki tum "Shoes" elamaninin  siliniz.

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);// Tum "shoes" leri siler.
        System.out.println(a);// [Tv, Radio, Laptop, Book]

        // Example: Bir tane salary(maas) list'i olusturun, eger salary 10000'den az ise %20 10000 ve 10000'den cok ise %10 zam yap.
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.00);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        for (Double w : salary) {
            if (w < 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else {
                salary.set(salary.indexOf(w), w * 1.1);
            }
        }
        System.out.println(salary);

        // Example: iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
        // Note: Iki Arraylist'in esit olabilmesi icin, elamanlar esit olmali ve ayni elamanlar ayni index'te olmali.
        //       ArrayList'lerin size() leri de esit olmali.

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Yol

        int counter = 0;// Flag
        for (int i = 0; i < m.size(); i++) {

            if (m.size() != n.size()) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Listler esittir.");
        }

        // 2.Yol
        boolean esitMi = m.equals(n);
        if (esitMi) {
            System.out.println("Listler esittir");
        } else {
            System.out.println("Listler esit degildir");
        }
    }
}
