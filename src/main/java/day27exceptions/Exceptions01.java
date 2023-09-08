package day27exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

       double r1 = compareNumOfcharacters("Java","xy");
        System.out.println(r1);// 2.0

        double r2 = compareNumOfcharacters(null,"xy");
        System.out.println(r2);// length() method'u null ile kullanilamaz

        double r3 = compareNumOfcharacters("Selenium","");
        System.out.println(r3);// Herhangi bir sayi sifir ile bolunemez
    }

    // Verilen iki String'den birinin karekter sayisinin digerinin kackati oldugunu veren method olusturun.

    public static double compareNumOfcharacters(String s, String t){

        double sonuc =0;

        try {
         sonuc = s.length()/ t.length();
        }catch (NullPointerException e){
            System.out.println("length() method'u null ile kullanilamaz");
        }catch (ArithmeticException e){
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        }finally {
            System.out.println("Database ile connection kesildi");
        }
        return sonuc;
    }

    /*
       "final", "finally", "finalize" aciklayiniz.
       1) "final" bir keyword'dur. Variable, Class, ve Method'lar icin kullanilir.
           "final" icin;
           i) Variable'larda kullanilabilir
        Public final int age =12;
         a) Atanan deger degistirilemez.
         b) Deger atamasi yapmak zorundasiniz.
       ii) Method'larda kullanilabilir.
        public final int add(){
            return a+b;
       }
        a) Bir method olustururken "final" olarak olusturulmus ise
           o method'un body'si asla degistirilemez. Dolayisiyla o method override edilemez.
       iii) Class'larda kullanilabilir.
            Bir Class'i "Final" yaparsaniz o Class'i kisirlastirmis olursunuz.
            Bir Class "final" is o Class'a extend edilemez.
            "final" Class Child olabilir.
       2) "finally" bir "code block" dur.
          "try-catch" veya sadece "try" ile kullanilir.
          "finally" code block icine yazilan code'lar her halukarda calistirilir.
          Mesela Database ile connection'i kesmek herhalukarda yapilmasi gereken bir fiildir. Bunu "finally" ile yapabiliriz.
       3) "finalize" bir method'dur. Bu method java tarafindan data'lar imha edilmeden once cagrilir, bu method data'lari
           imha edebilecek hale getirir ve daha sonra "Garbage Collector" bu data'lari imha eder.

           "finalize" method'unu Java Developer'lar da cagirabilir ama Java kendi bildigini yapar.
     */
}
