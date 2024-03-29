package day15arrays_multidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        // Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki "en buyuk negatif" ve "en kucuk pozitif" elamani bulunuz.
        int arr[] ={-12, 18, -5, 23, -2, 0};
        Arrays.sort(arr);
        int maxNegative =arr[0];
        int minPozitive =arr[arr.length-1];

        for (int w : arr){
            if (w<0){
                maxNegative = Math.max(maxNegative,w);
            }
            if (w>0){
                minPozitive =Math.min(minPozitive,w);
            }
        }
        System.out.println(maxNegative);
        System.out.println(minPozitive);
    }
}
