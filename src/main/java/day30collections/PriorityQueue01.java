package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {

    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");

        // Bu method Java nin belirledigi oncelikli bir kurala gore siralar.
        // Ama PriorityQueue(oncelik)'da Developer kendi istedigi gibi'de siralayabilir.
        System.out.println(myQueue);// [A, C, B, G, E]
    }
}
