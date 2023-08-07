package day16multidimensionalarrays_arraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {

        /*
            Array veya collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
            Array veya collection var ama "index" kullanmak zorundasiniz o zaman "foor-loop" lardan brini kullanabilirsiniz.
         */

        // Example: Bir tane integer multidimensional array olusturnuz
        // Bu array'deki tum sayilarin toplamini veren kodu yaziniz

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int sum = 0;
        for (int[] w : arr) {
            for (int k : w) {
                sum = sum + k;
                ;
            }
        }
        System.out.println(sum);

        // Example: Bir multidimensional array'i normal array' ceviren kodu yaziniz.
        // {{2, 5, 1}, {32, 75}} ==> {2, 5, 1, 32, 75}

        int brr[][] ={{2, 5, 1}, {32, 75}};
        int toplam =0;
        for (int[] w:brr){
            toplam =toplam+w.length;
        }
        System.out.println(toplam);

        int idx =0;
        int crr[] =new int[toplam];

        for (int[] w: brr){
            for (int k :w){
                crr[idx] =k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));
    }
}
