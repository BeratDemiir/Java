package day15arrays_multidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        // binarySearch() Method: Bu method'u kullanarak bir elamanin Array'de olup olmadıgını anlariz
        //                        binarySearch() Method'unu kullanmadan once mutlaka "Arrays.sort()" kullanmalidir.
        //                        binarySearch() Method'u aradiginiz elaman Array'de varsa o elamanin indexini return eder.
        //                        binarySearch() Method'u aradiginiz elaman Array'de yoksa "-a" seklinde bir negatif sayi alirsiniz
        //                        bu sayidaki "-" isaretini anlami bu elaman array'de yok demektir "a" nin anlami olsaydi kacinci sirada olurdu demektir.

        // Note: binarySearch() Method'u tekrarlayan elamanlar icin kullanilmaz.

        int arr[] = {12, 31, 43, 14};
        int sayi1 =43;
        Arrays.sort(arr);
        int idx1 = Arrays.binarySearch(arr,sayi1);
        System.out.println(idx1);// 3

        int sayi2 =4;
        int idx2 =  Arrays.binarySearch(arr,sayi2);
        System.out.println(idx2);// -1

    }
}
