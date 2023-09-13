package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String>  names = new LinkedList<>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);// [Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        String firstEl = names.peek();// Bu method ilk Nod'yi alir ama "Pop" gibi Orjinal Variable'den silmez.
        System.out.println(firstEl);// Chris
        System.out.println(names);// [Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        LinkedList<String>  myList = new LinkedList<>();

       String first = myList.peek();// Bu method bos bir LinkedList'i aldiginda "null" yazdirir.
        System.out.println(first);// null

        // Bu method ilk Node'yi silerek verir. ayni pop gibi ama farki "LinkedList" bos ise "null" yazdirir.
       String firstElement = names.poll();
        System.out.println(firstElement);// Chris
        System.out.println(names);// [Alexandre, Mark, Tom, Jeremy, Hans]

        // Bu method ilk elemani verir ama list'den silmez "pekk" gibi ama bos list'lerde "NoSuchElementExceptioan" atar.
      // String f = names.element();
      //  System.out.println(f);// Alexandre
     //   System.out.println(names);// [Alexandre, Mark, Tom, Jeremy, Hans]

    }
}
