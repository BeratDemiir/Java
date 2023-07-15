package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
            Verilen yilin "Leap Year"(Artik yil) olup olmadıgını kontrol eden kodu yaziniz.
            i) Yil 100'e bolunurse 400'e de bolunmelidir ==> 1600+  1800-
            ii) Yil 100'e bolunmezse 4'e bolunmelidir ==> 1996+  2001-
       */

        int year = 2001;

      Object leapYear=  year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year": "Leap year degil");
        System.out.println("==> " + leapYear);

        // Asagidagi kurallara'a gore password'un gecerli olup olmadıgını kontrol eden kodu yazınız.
        // i) Sekiz karekterden fazla veya sekiz karekter varsa ilk harfi 'i' olmalidir.
        // ii) Sekiz karekterden az karekter varsa ilk harfi 'k' olmalidir

        String pwd= "i2a3ed54";
        char ch= pwd.charAt(0);

       String gecerli= pwd.length()<8 ? (ch=='K' ? "Gecerli password" : "Gecersiz Password")
                                      : (ch=='i' ? "Gecerli password" : "Gecersiz password");

        System.out.println(gecerli);
    }
}
