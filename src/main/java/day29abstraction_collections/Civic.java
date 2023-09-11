package day29abstraction_collections;

        /*
            "abstract method" lar sadece ne yapilacagini soyler(what to do)
            "concrete method" lar ne yapilacagi(what to do) ile birlikte nasil yapilacagini(How to do) da soyler.

            "interface" ler bir yapilacaklar isler listesidir.(To do list)
            "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz bu method'larin
            return type'lari ayni olmalidir. Aksi taktirde hata verir.

            "interface" lerde constructor olmadigi icin interface'lerden object olusturulmaz.
            "abstract class" larda class olduklari icin constructor lar abstract class'larda object olusturmazlar.
         */
public class Civic implements Engine,Ac {
    @Override
    public void run() {
        System.out.println("Civic runs well");
    }

}
