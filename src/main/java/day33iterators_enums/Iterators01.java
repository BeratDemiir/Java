package day33iterators_enums;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        System.out.println(myList);// [Z, K, A, J, M]

        // Example: Iterators kullanark List elemanlarini tersten consol'a yazdiriniz.

        ListIterator<String> itr = myList.listIterator();

        // hasNext() method'o pointer dan sonra eleman varsa "true", yoksa "false" return eder.
        // previous() method'u pointer'i bir onceki elemanin sonuna koyar ustunden atladigi elemani return eder.
        while (itr.hasNext()) {
            itr.next();
        }
        while (itr.hasPrevious()) {
            String el = itr.previous();
            System.out.print(el + " ");// M J A K Z
        }

        System.out.println(myList);// [Z, K, A, J, M]

        // Example: List'deki tum elemani siliniz.
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        System.out.println(myList);// []

        /*
          1) ListIterator da i)hasNext() ii)next() iii)set()  iv)hasPrevious()  v)previous() vi)remove() method'lari vardir.

          1) Iterator da i)hasNext() ii)next() iii)remove() method'lari vardir.
         */

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.print(el);// ZKAJM
        }
    }
}
