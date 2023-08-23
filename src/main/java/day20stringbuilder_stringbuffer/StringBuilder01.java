package day20stringbuilder_stringbuffer;

public class StringBuilder01 {

    public static void main(String[] args) {

        /*
         1) StringBuilder Java'da bir Class'dir.
         2) StringBuilder String olusturmaya yarar.
         3) "String" Class varken nicin "StringBuilder" a ihtiyac duyariz;
            Cunku "String" class "Immutable Class" dir, ama biz bazen "Mutable" String'lere ihtiyac duyariz,
            StringBuilder bize "Mutable" String verir.
         4) "Immutable Class" larda var olan deger degistirilemez. Siz var olan bir degeri degistirmek istediginizde
            i) Memory'de yeni bir variable yeni degerle olusturulur
            ii) Eski variable'in pointer'i yeni variable'a dondurulur
            iii) Eger bir variable'i hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir
         5) "Mutable class" larda var olan deger degistirilebilir. Orjinal deger korunmaz.
         6) "String Class" larin "immutable" yapisi "security" icin onemlidir.
            Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni degere sahip
            String'lerin bu container'i kullanmasini temin eder. Bu memory'i korumak icin iyidir ancak container deki degeri
            bir variable icin degistirdigimizde tum variable'larin etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin
            Java String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variable'nin degerini degistirmek icin Java bir yol bulmustur.
            Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu yeni variable'a yonlendirir.
            Boylelikle hem degisim saglanmis hem de digerleri etkilenmis olur.
       */

        String str ="Java";
        str="Super Java";

        // StringBuilder nasil olusturulur?
        // 1.Yol
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);// Java

        // 2.Yol
        StringBuilder strb2 = new StringBuilder();
        // Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append(" !!!");
        System.out.println(strb2);// Java is easy !!!

        // Yol b:
        strb2.append(" Learn").append(" Java earn").append(" money.");
        System.out.println(strb2);// Java is easy !!! Learn Java earn money.

        // StringBuilder'larda character sayisi nasil bulunur?  ==> length() method'u ile
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");
        int numOfChar = strb3.length();
        System.out.println(numOfChar);// 18

        // Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar.
        int capacity = strb3.capacity();
        System.out.println(capacity);// 34
    }
}
