package day29abstraction_collections;

        /*
            "abstract method" lar sadece ne yapilacagini soyler(what to do)
            "concrete method" lar ne yapilacagi(what to do) ile birlikte nasil yapilacagini(How to do) da soyler.

            "interface" ler bir yapilacaklar isler listesidir.(To do list)

            "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz bu method'larin
            return type'lari ayni olmalidir. Aksi taktirde hata verir.

            "interface" lerde constructor olmadigi icin interface'lerden object olusturulmaz.
            "abstract class" larda class olduklari icin constructor lar abstract class'larda object olusturmazlar.

            Soru: "Abstract Class ile Interface in farklari nelerdir?"
                  1) Method
                     "Abstract Class" hem abstract hem de concrete method lar icerebilir.
                     "Interface" ler ise sadece abstract method'lar icerir.
                     Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method lar olusturabiliriz.
                  2) Variable
                     "Abstract Class" larda normal Class'lardaki gibi her turlu variable olusturulabilir.
                     "Interface" lerde ise variable'lar public static ve final olmak zorundadir.
                  3) Inheritance
                     "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezler.
                     "Interface" ler ise multiple inheritance'i desteklerler.
                  4) Object Creation
                     "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
                     "Interface" lerde ise constructor olmadigindan object olusturulmaz.

             Soru: Object Oriented Programming Language prensipleri nelerdir?
                   i) Inheritance  ii) Polymorphism  iii) Encapsulation  iiii) Abstraction
         */
public class Civic implements Engine,Ac {
    @Override
    public void run() {
        System.out.println("Civic runs well");
    }

}
