package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays03 {
    public static void main(String[] args) {


        // Example: [0,2,3,0,12,0] sifirlari en sona koyunuz

        int original[] ={0, 2, 3, 0, 12, 0};
        int yeni[] = new int[original.length];
        int idx =0;

        for (int i=0; i< original.length; i++){
            if (original[i] !=0){
                yeni[idx] =original[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        // Example: Bir Array'in icinde herhangi bir elamanin olup olmadıgını kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz.
        //  [2, 1, 2, -3, 2, ] kullanici 2'yi sordu ==> 2 elamani var ve 3 kere tekrarlandi

        int arr[] ={2, 1, 2, -3, 2,};
        int elaman =1;
        int counter =0;// "flag" bazi durumlarin var olup olmadıgını kontrol etmek icin "flag" kullanilir.
        for (int w: arr){
            if (w==elaman){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(elaman+ " array'de "+ counter+ " defa var");
        }else
            System.out.println(elaman+ " array'de yok");

        // Example: size verilen bir array'deki en uzun kelimeyi bulunuz.

        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        sentence =sentence.replaceAll("\\p{Punct}","");

        String words[] =sentence.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
        System.out.println(words[words.length-1]);

    }
}
