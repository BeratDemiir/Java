package day22inheritancepolymorphism;

public class CatRunner {

    /*
        1) Java'da Object olustururken Constructor'lar Parent'dan Child'a dogru calistirilir.
        2) Java en ust Parent Constructor'a cikabilmek icin "super()" kodunu kullanir.
        3) "super()" kodu her Constructor'in "ilk satirinda" "gizli" olarak bulunur.
        4) "super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, Java kizmaz
        5) "super()" kodunu gorunur sekilde de yazarsaniz sakin haa ilk satir disinda bir satira koymayiniz, hata verir.
        6) "super()" kodu parent Class'dan Constructor cagirmaya yarar.
     */

    public static void main(String[] args) {

        Cat cat1 = new Cat();// Animal Mammal Cat

    }
}
