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
        visitors.add(2,"Angelina Julie");
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        // LinkedList nasil yazdirilir
        System.out.println(visitors);//[Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]
        visitors.addLast("Ajda Pekkan");// Son Node(Tail) ekler  Tail--> Son Node nin ozel adidir.
        visitors.addFirst("Cuneyt Arkin");// ilk Node'ye ekler
        System.out.println(visitors);// [Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks, Ajda Pekkan]

        visitors.removeLast();// Tail'i siler --> Son Node'deki "Ajda Pekkan" i siler
        System.out.println(visitors);// [Cuneyt Arkin, Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirst();// ilk Node'yi siler  --> "Cuneyt Arkin" siler.
        System.out.println(visitors);// [Tom, Hanks, Angelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeFirstOccurrence("Tom Hanks");// ilk gorunumun node sil.
        System.out.println(visitors);// [Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        visitors.removeLastOccurrence("Brad Pitt");// Son gorunumun Node sil.
        System.out.println(visitors);// [Tom, Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]

       String firstEl = visitors.pop();// Cut + Paste ==> Kes yapistir.
        System.out.println(firstEl);// Tom

        System.out.println(visitors);// [Hanks, Angelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]

        LinkedList<String> myList = new LinkedList<>();
      //  myList.pop();// NoSuchElementException atti cunku LinkedList bos

    }
}
