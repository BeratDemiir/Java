package day25javaexception;

public class Exception01 {

    /*
        "Exception"(istisnai hata): javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
        1) Exception'lar ile calismanin iki yolu vardir
           a) try-catch block kullanma ve exception olussa bile calismayi devam ettirme.
           b) throw exception kullanarak calismayi durdurma
        2) Eger exception'u handle etmez isek (sorunu halletmezsek) java calismayi durdurur.
        3) try-catch kullanirken "try" kodunu bir yada birden fazla "catch" ile kullanabiliriz.
        4) try, catch olmaksizin yalniz kullanilmaz.
        5) Eger yazmis oldugunuz herhangi bir kod satirinda problem olabilecegini dusunuyorsaniz try-catch block icine koymalisiniz.
        6) catch block parantezi icerisine olmasi muhtemel exception class yazilir.
        7) "e.getMessage()", methodunu kullanarak teknik mesajlar elde edebiliriz.
        8) "e.printStackTrace(), methodunu kullanarak detayli teknik mesaj verir. Kod calismaya devam eder.
        9) Eger try body icindeki kod sorunsuz calisirsa catch block devreye girmez.
     */

    public static void main(String[] args) {

        divide(6,2);// 3
        divide(0,2);// 0
        divide(6,0);// Matematikte bir sayi "0" ile bolunemez.

        divide2(5,0);
    }

    // 1.Yol (Tavsiye edilmez) cunku tum matematik kurallarini ezbere bilmek mumkun degildir.
    public static void divide (int a, int b){
        if (b==0){
            System.out.println("Bir sayi sifir ile bolunemez");
        }else {
            System.out.println(a/b);
        }

    }

    // 2.Yol try-catch kullanarak exception'i handle etmek tavsiye edilir.
    public static void divide2(int a, int b){

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Bolme isleminde bir problem olustu"+ e.getMessage());// Bolme isleminde bir problem olustu/ by zero
        }
    }
}
