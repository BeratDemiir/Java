package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
         1) Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz "varargs" kullanmalisiniz.
         2) "varargs" arka tarfta "array" kullanir, bu yuzden "varargs" larla calisirken "Array" lerle calisiyormus gibi davranabilirsiniz.
         3) "varags" olusturmak icin "<data type>... <varargs ismi>"
         4) Bir method'da "varargs" in yaninda baska bir parametre kullanilabilir mi?
           "varargs" en sonda olmak sarti ile kullanilabilir.
         5) Bir method'da birden fazla "varargs" kullanilmaz
   */

    public static void main(String[] args) {


      int r1 =  toplam(2,3);
        System.out.println(r1);// 5

        int r2 =  toplam(2,3,4);
        System.out.println(r2);// 9

        int r3 =  toplam(2,3,4,5,6,7,8,4);
        System.out.println(r3);// 39


    }
    // iki sayinin toplamini return eden bir method olusturunuz.

    public static int toplam(int a,int b){
      return   a+b;
    }

    // uc sayinin toplamini return eden bir method olusturunuz.

    public static int toplam(int a,int b,int c) {
        return a + b + c;
    }

    // dort sayinin toplamini return eden bir method olusturunuz.

    public static int toplam(int a,int b,int c,int d) {
        return a + b + c+d;
    }

    // istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturunuz.

    public static int toplam(int... a){
        int sum =0;
        for (Integer w: a){
            sum=sum+w;
        }
        return sum;
    }
}
