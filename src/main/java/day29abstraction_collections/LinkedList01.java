package day29abstraction_collections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
        1) LinkedList deki her eleman iki bolumden olusur i)Data ii)Pointer.
        2) LinkedList deki her bir eleman "Node" olarak adlandirilir.
        3) LinkedList ler eleman ekleme ve eleman silme islemlerinde cok basarilidirlar.
        4) LinkedList ler eleman arama islemlerinde basarisizlardir.
        5) 3. ve 4. maddelerden dolayi eleman ekleme ve eleman silme islemlerinin cok yapilacagi durumlarda LinkedList kullanilabilir.
        6) ArrayList'ler index kullanir LinkedList'ler index kullanmaz.
        7) index kullanmak eleman bulma islemlerinde cok basarilidir. Bu yuzden eleman bulma islemlerini cok yapacaksaniz ArrayList kullanmalisiniz.
     */

    public static void main(String[] args) {

        // LinkedList Nasil olusturulur
        LinkedList<String> visitors = new LinkedList<>();

        // LinkedList eleman nasil eklenir
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");

        // LinkedList nasil yazdirilir
        System.out.println(visitors);// [Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]
    }
}
