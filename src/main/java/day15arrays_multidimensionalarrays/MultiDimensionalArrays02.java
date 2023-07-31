package day15arrays_multidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        // MultiDimensional Array kisa yoldan nasil olustrurulur?
        char arr[][] ={{'a', 'b'}, {'C', 'D', 'E'},{'?'}};
        System.out.println(Arrays.deepToString(arr));// [[a, b], [C, D, E], [?]]

        // Example1: Bir String multidimensional Array'de icinde "a" olan elamanlari concol'a yazdiriniz.
        String brr[][] ={{"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w :brr){
            for (String k: w){
                if (k.contains("a"))
                    System.out.print(k+ " ");
            }
        }
    }
}
