package day30collections;

import java.util.HashSet;

public class HashSet01 {

    /*
       1) "Hash" bir tekniktir birbirine benzemeyen code'lar uretir bu code'lar data'yi "unique" yapmayi saglar.
       2) Set'lere coklu ama tekrarsiz data depolamak istedigimizde ihtiyac duyariz.(Ogrenci numaralari gibi)
       3) "HashSet" ler eklenen elemanlarin siralamasi ile ugrasmaz. Siralama ile alakali zaman harcamaz bu yuzden cok hizli calisir.
       4) "HashSet" ler index kullanmazlar. Cunku siralama rastgele yapildigi icin index manali olmaz.
       5)  HashSet'ler nezaman kullanilir;
            i) Tekrarsiz elemanlarda
            ii) Siralama onemli degilse
            iii) Hiz cok onemli ise
  */

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<>();

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println(emails);// [Apple, Fig, Mango, Apricot, Orange]

        // Var olan elemani eklerseniz hata vermez, son ekleneni var olan data'nin ustune yazar.(OverWrite)
        emails.add("Mango");
        System.out.println(emails);// [Apple, Fig, Mango, Apricot, Orange]

        emails.add(null);
        emails.add(null);
        System.out.println(emails);// [null, Apple, Fig, Mango, Apricot, Orange]
    }
}
