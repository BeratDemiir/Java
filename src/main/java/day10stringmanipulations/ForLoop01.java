package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {

        /*
          Note: Tekrarli isler icin "loop" kullaniriz
          *) 4 cesit "loop" vardir
               1.) for-loop
               2.) while-loop
               3.) do-while-loop
               4.) for-each-loop
        */

        // Example: Ekrana 5 kere "Hi" yazdiriniz.

        // Note : Increment(Artirma) Decrement(Azaltma)
        // 1.bosluk kisma baslangic degeri /* 2.bosluk kisma loop hangi sart altinda calisacak /* 3. bosluk ise arttirma ve azaltma
        for ( int i =1 ; i<6 ; i++){
            System.out.println("Hi");
        }

        // Example: 4'den 7'ye kadar tum tam sayilari ekrana yazdiran kodu yaziniz.
        for (int i =4; i<8 ; i+=1){
            System.out.print(i+" ");
        }
        System.out.println();

        // Example: 14'den 5' kadar tum sayilari ekrana yazdiran kodu yaziniz.
        for (int i =14 ; i>4 ; i--){
            System.out.print(i+" ");
        }

        System.out.println();
        // Example: 14'den 5'e kadar tum cift sayilari yazdiriniz.

        // 1.Yol
        for (int i =14 ; i>4 ; i=i-2){
            System.out.print(i+" ");
        }
        System.out.println();

        // 2.Yol
        for (int i =14 ; i>4; i--){
            if (i%2==0)
                System.out.print(i+" ");
        }
        System.out.println();

        // Example: 28'den 157'e kadar tum tek sayilari yazdiriniz.
        for (int i =28 ; i<158 ; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        // Example:"Java" string'ini "J*a*v*a" string'ine ceviren kodu yaziniz.

        String str ="Java";
        for (int i =0 ; i<str.length() ;i++){
            System.out.print(str.charAt(i)+"*");
        }

        System.out.println();
        // Example: size verilen string'de tekrarsiz olan karekterleri yazdiriniz.
        //    "Hellllooooo" ==> He

        String s ="Helllooo";
        for (int i =0 ;i<s.length() ;i++){
            char c = s.charAt(i);
            if (s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);// He
            }
        }
    }
}
