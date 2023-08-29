package day21accessmodifiersinheritance;

public class Student {

        /*
            Access Modifier
            1) public   2) protected     3) default(Access Modifier'i default yapmak icin access modifier yazmayiz)    4) private

            Note: Access Modifier'lari genisden dara dogru sayiniz
                public > protected > default > private
            Note: Access Modifier'lari birer birer aciklayiniz
                 public, her Class'dan kullanilabilir.
                 protected, olanlar baska package'lerden kullanilmaz ancak baska package'de "child class" icinden kullanilabilir.
                 default, olanlar baska package den kullanilamaz.
                 private, olanlar sadece olusturduklari Class icinde kullanilabilirler
            Note: protected ile  default'un farkini soyleyiniz
                 protected, olanlar baska package'lerden kullanilmaz ancak baska package'de "child class" icinden kullanilabilir.
                 default, olanlar baska package den kullanilamaz.
            Note: Class'lar icin hangi Access Modifier kullanilabilir.
                  public, default kullanilabilir ama protected ve private kullanilmaz
       */

    // public her Class'dan kullanilabilir.
    public String stdName = "TomHanks";

    // protected olanlar baska package'lerden kullanilmaz ancak baska package'de "child class" icinden kullanilabilir.
    protected String address = "Miami";

    // default olanlar baska package den kullanilamaz.
    String email = "th@gamil.com";

    // private olanlar sadece olusturduklari Class icinde kullanilabilirler
    private String stdId = "20206517004";

    }
