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
