package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir";

        // StartsWith("va",2) kodu ilk 5 karekterden sonraki String'e bakar ve o String'in "va" ile baslayip baslamadigini kontrol eder.
        // "va" ile basliyorsa "true", baslamiyorsa "false" return eder.

        boolean b =a.startsWith("va",2);

        System.out.println(b);

        // a.replaceFirst("a","*"); bu kod String'deki ilk "a" yi "*" e cevirir.
        // replaceFirst("a","*"); bu kod String'deki tum "a" lari "*" e cevirir.
      String c =  a.replaceFirst("a","*");
        System.out.println(c);// J*v* kol*ydir

        // concat() method'u iki tane String'i birbirine yapistirmaya yarar.
        // Concatination islemi iki turlu yapılabilir; "+" veya "concat()" method'u ile
        // Java bir islem icin method uretmisse o method'u kullanmak "best practice" dir.
        // Note : concat() method'u sadece bir string'in sonuna ekleme yapar.
        String d =a.concat(" Anladin mi?");
        System.out.println(d);// Java kolaydir. Anladin mi?


        String e = "   Tom Hanks    ";
        System.out.println(e);// "   Tom Hanks    "

        // trim() method'u bir String'deki bastaki ve sondaki "space" karekterlerini siler, aradaki "space" karekterlerine dokunmaz
       String f = e.trim();
        System.out.println(f);// "Tom Hanks"

        String h = "java";
        String i = "Java";

        // h.compareTo(i) bu kod iki tane String'i alfabetik(lexicographic) olarak karsilastirir.
        // Buyuk harf'e duyarlidir.
        // Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIgnoreCase(i); kullanabilirsiniz.
        // h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cıkarilir.
       int k = h.compareTo(i);
        System.out.println(k);// 32

        int l = h.compareToIgnoreCase(i);
        System.out.println(l);// 0


        // a.repeat(3); kodu "a" String'ini yanyana 5 kere yapistirir.
        // q.repeat(0) empty string return eder.
        String q ="Ali Veli. ";
        String v =q.repeat(3);
        System.out.println(v);// Ali Veli, Ali Veli, Ali Veli

    }
}
