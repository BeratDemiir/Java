package day21accessmodifiersinheritance;

public class AnimalRunner {

    /*
       1) "Inheritance" sayesinde
            i) Code tekrarlarindan kurtuluruz
            ii) Code tamiri(maintenance) kolay olur
            iii) Child Class'lari dha atomic yapmis oluruz

       2) Bir Class'i baska bir Class'in Child Class'i yapmak icin
          "Extends" keyword kullanilir. ılk yazilan Class Child, ikinci
          yazilan Class parent olur

       3) child Class object'leri Parent Class'dan method ve variable'leri
          kullanabilirler

       4) Parent Class object'leri Child Class'dan method ve variable'leri
          kullanamazlar

       5) Object Class her class'in parent'idir
          Java da Object Class haric her Class'in parent'i vardir.
          Java'da parent'i olmayan tek Class object Class dir.

      6) "private" method ve variable'lar Child Class'lar tarafindan kullanilamaz
         "protected" method ve variable'lar Child Class'lar tarafindan kullanilabilir.
         "default" method ve variable'lar ayni package tarafindan Child Class'lar tarafindan kullanilabilir.
         "public" method ve variable'lar Child Class'lar tarafindan kullanilabilir
         Note: "Child Class'lar tarafindan kullanilabilir" olmak "inherit edilebilir" demektir.

      7) 4 tip inheritance vardir
         i) Multilevel Inheritance: Java bunu kabul eder
         ii) Hierarchial Inheritance: Bir parent icin coklu child, Java bunu kabul eder
         iii) Multiple Inheritance: Bir Child'a coklu Parent, Java bunu desteklemez.(Java does not support Multiple Inheritance)
         iiii) Single Inheritance: Bir Child Class icin bir parent Class demektir, Java bunu destekler.
     */

    public static void main(String[] args) {

        Cat c1 = new Cat();

        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1 = new Dog();

        d1.eat();
        d1.drink();
        d1.bark();

        Bird b1 = new Bird();

        b1.tweet();
        b1.eat();
        b1.drink();
    }
}
