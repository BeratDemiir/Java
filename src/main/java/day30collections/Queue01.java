package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
       Ilk giren elemani ilk kullanmaniz(First In First Out ==> FIFO) gerektiginde Queue en iyi secimdir.
       Queue da elemanlar "insertion order" a gore dizilirler.
       Queue da pop(), Peek(), Poll, element(), remove() gibi ilk elemani ilgilendiren bir cok method vardir.
       offer() method'u kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.
     */

    public static void main(String[] args) {

        // "queue" nasil olusturulur
        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);// [Milk, Meat, Bread, Honey, Tomatoes]

        // "offer" method'u boolean return eder. olusturdugun variable'nin capacity'e gore ekler(true) veya capacity dolu(false) diye eklemez exception atar.
        wareHouse.offer("Potatoes");
        System.out.println(wareHouse);// [Milk, Meat, Bread, Honey, Tomatoes, Potatoes]

    }
}
