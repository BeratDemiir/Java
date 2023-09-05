package day23inheritancepolymorphism;

public class Cat extends Mammal{

    public void meow(){
        System.out.println("Cats meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    // Asagidaki method "Overriding Method"
    @Override
    public Mammal create() {
        return new Mammal();
    }

    /*
       @Override annotation'ini kullanarak, Java'nin yaptiginiz Override islemini kontrol etmesini saglariz.
       1) Override yaparken  "method'un body" si degistirilir.
       2) Override yaparken Asla method signature(isim ve parametre) degistirilmez.
       3) override yaparken "inheritance" olmak zorundadir.
       4) override yaparken "acces modifier" lar belli kurallara gore farklilastirilabilirler.
          i) "Private" method'lar override edilemezler.
          ii) Child Class'daki "override edilen" method'un access modifier'i Parent class'daki method'un
              acsess modifier'i ile ayni veya dha genis olmalidir.
              Note: Child Class daki method'un access modifier'i daha dar olamaz.
          iii) default method'lar ayni package icindeyse override edilebilirler,
               farkli package'den override edilemezler.
       5) Parent Class'daki method'un "return type" i void ise "return type" degistirilemez.
       6) Parent Class'daki method'un "return type" i primitive ise "return type" degistirilemez.
       7) Parent Class'daki method'un "return type" i wrapper Class ise "return type" degistirilemez.
       8) Parent Class'daki method'un "return type" i Parent Class ise "return type" child'lardan biri olabilir.
         Note: Child Class'daki return type Parent Class'dakinden genis olamaz.
         Note: Aralarinda Parent child iliskisi olmayan Class'lar Overriding'de Return type degisiminde
               Kullanilamazlar. Mesela "Short", "Integer" dan kucuktur, fakat aralarinda "Parent child"
               iliskisi olmadigindan "Integer" yerine "Short" kullanamazsiniz.
         Note: Child'deki method'un Return Type'indan Parent'taki method'un Return type'ina gidiste
               "IS-A" Relationship olmali.
         Note: Aralarinda "IS-A" Relationship olan Data Type'lara "Covariant" denir.
      9) Child<Parent ==> IS-A ( Her kedi hayvandir ama her hayvan kedi degildir.
                          HAS-A ==> Hayvanlar Kedileri icerir ama tum kediler tum hayvanlari icermez.
      10) "final" method'lar Override edilemezler, cunku "Overriding" de method body degistirilebilir fakat
          "final" method body degistirilmesine musade etmez.
      11) Polymorphism = Overloading + Overrriding
         Note: Polymorphism nedir? derlerse Overloading ve Overriding'i anlatin
      12) Overloading ve Overriding arasindaki farklar nelerdir?
         a) Overloading icin "inheritance" gerekmez fakat Overriding icin gerekir
         b) "private" method'lar Overload edilebilir, Override edilemezler.
         c) "final" method'lar Overload edilebilir, Override edilemezler.
         d) "Overloading" "static poltmorphism" olarak, "Overriding" "dynamic polymorphism" olarak adlandirilir.
            cunku "static" method'lar Overload edilebilir, Override edilemezler.
         e) "Overloading" de method signature degisir ama "Overriding" method signature a dokunulmaz.
    */
}
