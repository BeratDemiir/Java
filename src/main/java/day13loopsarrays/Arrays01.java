package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        /*
            1) Ayni data tipinde coklu data'yi depolamak icin Java'nin olusturdugu yapilar vardir
            Bu yapilardan birisi de "Array" lerdir.
         */

        // Array nasil olsuturulur?
        int stdAges[] = new int[7];

        // Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        // Array'lere elamanlar nasil eklenir.// [0, 0, 0, 0, 0, 0, 0]
        stdAges[0] =12;
        stdAges[1] =11;
        stdAges[2] =13;
        stdAges[3] =14;
        stdAges[4] =10;
        stdAges[5] =12;
        stdAges[6] =12;
        System.out.println(Arrays.toString(stdAges));// [12, 11, 13, 14, 10, 12, 12]

        // Array'deki herhangi bir elamani nasil yazdirilir.
        System.out.println(stdAges[4]);// 10


        // Example: Array'deki en kucuk ve en buyuk elamanin toplamini ekrana yazdirin.
        Arrays.sort(stdAges); // Bu method Array'i kucuk'ten buyuge dogru siralar.
        System.out.println(Arrays.toString(stdAges));// [10, 11, 12, 12, 12, 13, 14]

        int ilk =stdAges[0];// ilk index
        // Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir.
        int son =stdAges[stdAges.length-1]; // son index
        System.out.println(ilk+son);// 24


        // Example: stdAges Array'i icindeki tum elamanlarin toplamini ekrana yazdiran kodu yaziniz.
        // 1.Yol ****
        int sum =0;
        for (int i =0; i<stdAges.length; i++){
         sum = sum +stdAges[i];
        }
        System.out.println(sum);// 84


        // 2.Yol ****
        int toplam=0;;
        int i=0;
        while (i<stdAges.length){
            toplam=toplam+stdAges[i];
            i++;
        }
        System.out.println(toplam);


        // 3.Yol ****
        int k=0;
        int tplm=0;
        do {
            tplm=tplm+stdAges[k];
            k++;
        }while (k<stdAges.length);
            System.out.println(tplm);


            // 4.Yol **** for each loop Array'lerde ve Collections'larda kullanilir.
        int t =0;
        for (int w: stdAges ){
          t=t+w;
        }
        System.out.println(t);

        // Example: String bir Array olustrun
        //    Bu Array'e 5'tane isim yerlestiriniz
        //    Bu isimlerdeki karekter sayilarini ekrana yazdirin

        String ismler[] = new String[5];
        ismler[0]="Ali";
        ismler[1]="Tom";
        ismler[2]="Veli";
        ismler[3]="Kemal";
        ismler[4]="Cem";
        System.out.println(Arrays.toString(ismler));// [Ali, Tom, Veli, Kemal, Cem]

        int karekterSayilariToplami =0;
        for (String w: ismler ){
          karekterSayilariToplami =  karekterSayilariToplami+w.length();
        }
        System.out.println(karekterSayilariToplami);// 18

        // Example: Char bir array olusturunuz
        //          Bu array' 5 elaman ekleyiniz
        //          Bu array; deki sadece buyuk harfleri yazdirin

        char harfler[] = {'a','D','b','C','T'};
        for (char w: harfler){
            if (w>='A' && w<='Z'){
                System.out.println(w);
            }
        }
    }
}
