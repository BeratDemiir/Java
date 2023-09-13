package day30collections;

import java.util.LinkedList;

public class LinkedList02 {

    public static void main(String[] args) {

        // Example 1: "A" ile baslayan tum isimleri "*****" e ceviriniz.


        LinkedList<String>  names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);// [Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        for (String w : names){
            if (w.startsWith("A")){
                names.set(names.indexOf(w),"******");
            }
        }
        System.out.println(names);// [Chris, ******, Mark, Tom, Jeremy, Hans]

        // Example 2: List'deki 4 harften cok harf iceren isimleri siliniz.

        for (int i=0; i<names.size(); i++){
            if (names.get(i).length()>4){
                names.remove(names.get(i));
                i--;
            }
        }
        System.out.println(names);// [Mark, Tom, Hans]
    }
}
