package day26exception;

public class Exception03 {

    public static void main(String[] args) {

        double d1 = divideStringByTheNumOftheChar("124");
        System.out.println(d1);// 41.0

       double d2 = divideStringByTheNumOftheChar(null);
        System.out.println(d2);

    }

    // String'deki character sayisini bulunuz, String'i Integer'e ceviriniz, Integer'i charecter sayisina bolunuz.
    public static double divideStringByTheNumOftheChar(String str){

        int length = 0;
        int i =0;
        double sonuc = 0;
        try {
             length = str.length();// NullPointerException: Null String'le "length()" kullanildiginda alinir.

             i = Integer.valueOf(str);// NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda.

           sonuc =  i / length;// ArithmeticException: Bolen sayi sifir oldugunda alinir.
        }catch (NullPointerException e){

            System.out.println(e.getMessage());

        }catch (NumberFormatException e){

            System.out.println(e.getMessage());

        }catch (ArithmeticException e){

            System.out.println(e.getMessage());
        }
        return sonuc;
    }

    // 2.Yol
    public static double divideStringByTheNumOftheCharacter(String str){

        int length = 0;
        int i =0;
        double sonuc = 0;
        try {
            length = str.length();// NullPointerException: Null String'le "length()" kullanildiginda alinir.

            i = Integer.valueOf(str);// NumberFormatException: Icinde rakamdan farkli character olan String'ler valueOf() ile kullanildiginda.

            sonuc =  i / length;// ArithmeticException: Bolen sayi sifir oldugunda alinir.
        }catch (Exception e){

            System.out.println(e.getMessage());

        }
        return sonuc;
    }
    // Note 1: Aralarinda "parent-child" relationship olan Exception Class'lari multiple catch'lerde kullanmak isterseniz
    //         "child" olan once kullanilmalidir, aksi takdirde hata verir.
    // Note 2: Aralarinda "parent-child" relationship olmayan Exception Class'lari multiple catch'lerde kullanmak isterseniz
    //         siralamanin bir onemi yoktur.
}
