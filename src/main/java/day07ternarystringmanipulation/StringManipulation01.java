package day07ternarystringmanipulation;

public class StringManipulation01 {

    public static void main(String[] args) {

       /*
             ****  String Class Methodlari  ****
          1) equals(): i) İki tane string'in ayni olup olmadıgını anlamamıza yarar.
                       ii) equals() method'u "boolean" return eder.

          2) equalsIgnoreCase(): i) İki tane String'in ayni olup olmadıgını buyuk harf kucuk harfe dıkkat etmeksızın anlamamıza yarar.
                                 ii) equalsIgnoreCase() method'u "boolean" return eder.

          3) toLowerCase(): i) Bir string'deki tum harfleri kucuk harfe cevirmek icin kullanılır.
                            ii) toLoweCase() method'u "String" return eder.

          4) toUpperCase(): i) Bir string'deki tum harfleri buyuk harfe cevirmek icin kullanılır.
                            ii) toUpperCase() method'u "String" return eder.

           5) charAt():     i) Bir String'den belli bir index'deki characteri almak icin kullanılır.
                            ii) charAt() method'u "char" return eder.

           6) length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir.
                         ii) length() method'u "int" return eder.

           7) contains(): i) Bir String'de belli bir characterin veya characterlerin var olup olmadıgını anlamak icin kullanilir.
                          ii) contains() method'u "boolean" return eder.

           8) split():   i) Bir string'i istedigimiz characterden parcalamaya yarar.
                         ii) split() method'u "Array" return eder.

        */


        // EXample:

        /*
              Bir password'un gecerli olup olmadıgını asagıdakı kurallara gore kontrol eden kodu yazın.
                      i) En az 8 character icermeli
                       ii) Space characteri icermemeli
                        iii) İlk harfi "M" veya "m" olmali
                         iiii) son characteri "?" olmali
         */

        String pwd = "Manisa12?";

       // i) En az 8 character icermeli
        boolean first =pwd.length()>7;

        // ii) Space characteri icermemeli
       boolean second= !pwd.contains(" ");

       // iii) İlk harfi "M" veya "m" olmali
       boolean third= pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

       // iiii) son characteri "?" olmali
        boolean four =pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && four);
    }
}
