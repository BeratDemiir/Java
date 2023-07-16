package day08stringmanipulation;

public class StringManipulation02 {

    public static void main(String[] args) {

        // Example: Bir String'deki space haric kac tane karekter oldugunu gosteren kodu yazınız.
        //          "Ali okula gitti." ==> 14 character bosluk harıc

        String str = "Ali okula gitti.";

        // replace() methodu bir string'deki herhangi bir karekteri veya karekterleri degistirmek icin kullanilir.
        int num = str.replace(" ","").length();
        System.out.println(num);

        // Example: Bir string'deki tum 'a' harflerini 'A' ya ceviriniz

        String str2 = "Ankara'nin tasina gozlerimin yasina bak.";
        String s = str2.replace("a","A");
        System.out.println(s);

        // Example: Bir string'deki "kara" kelimesinin yerine "*" koyunuz.

        String t = "Kara kara dusunme ankara";
       String yeniT = t.replace("kara","*");
        System.out.println(yeniT);

        // Example: Bir string'deki tum sayilari "*" a ceviriniz.
        //          "AC202117004" ==> AC*********

        String stdId = "AC202117004";
        String yenistdId = stdId.replaceAll("[0-9]","*");
        System.out.println(yenistdId);

        /*
          Bir grup data'yi ifade eden kod'lara "Regex" denir.
          "Regex" Regular Expression in kisaltilmis halidir.
          1) Tum rakamlar ==> [0-9]
          2) Tum kucuk harfler ==> [a-z]
          3) Tum buyuk harfler ==> [A-Z]
          4) Tum harfler ==> [a-zA-z]
          5) Sesli harfler ==> [aeiouAEIOU]
          6) space ==> [ ]
          7) Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
          8) Tum noktalama isaretleri ==> \\p{Punct}

          1) Rakamlar haric tum karekterler ==> [^0-9]
          2) kucuk harfler haric tum karekterler ==> [^a-z]
          3) buyuk harfler haric tum karakterler ==> [^A-Z]
          4) Tum harfler haric tum karekterler ==> [^a-zA-Z]
          5) space haric ==> [^ ]
      */

        // Example: Verilen bir string'de kullanilan noktalama isareti ve rakamlar ve space karekteri haric
        //          tum karekterlerin sayisina bulan kodu yaziniz.

        String u = "Ali 13 yasinda, dersem inanma!...";
       int sonuc = u.replaceAll("[0-9]","").
                   replace(" ","").
                   replaceAll("\\p{Punct}","").
                   length();
        System.out.println(sonuc);

        // Example: Bir pasword'un gecerli olup olmadıgını asagıdakı kurallara gore test eden kodu yazınız.
        //           i) space haric en az 8 karekter olmali
        //           ii) En az 1 sembol icermeli
        //           iii) En az 1 rakam icermeli
        //           iiii) En az 1 buyuk harf icermeli
        //           iiiiii) En az 1 kucuk harf icermeli

        String pwd = "B78c? k!m";

       // i) space haric en az 8 karekter olmali

        boolean first = pwd.replace(" ","").length()>7;

       //  ii) En az 1 sembol icermeli
       boolean second = pwd.replaceAll("[0-9a-zA-Z]","").length()>0;

       // iii) En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;

        // iiii) En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;

        //           iiiiii) En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if (pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else {
            System.out.println("Password'unuz gecerli degildir...");
        }

        // Exapmle: Bir String'deki noktalama isaretleri haric karekter sayılarını gosteren kodu yazınız.

        String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";

       int number = cumle.replaceAll("[\\p{Punct}]","").length();
        System.out.println(number);

        // Example: Verilen bir string "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" Yazdirin.
        //              aksi halde "Normal" yazdırın.

        String v = "Alex";

        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        String sonuc1 = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(sonuc1);

    }
}
