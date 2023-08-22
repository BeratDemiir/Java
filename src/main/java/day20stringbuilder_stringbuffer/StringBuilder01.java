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
       */

        String str ="Java";
        str="Super Java";

        StringBuilder strb = new StringBuilder("Java");
        strb.append(" Super");
        System.out.println(strb);// Java Super

    }
}
