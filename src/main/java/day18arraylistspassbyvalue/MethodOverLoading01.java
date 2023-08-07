package day18arraylistspassbyvalue;

public class MethodOverLoading01 {

    /*
        Method Over Loading nasil yapili?
        1) Method isimleri ayni olmalidir.
        2) Method paremetreleri farkli olmalidir
          i) Paremetre sayilari degistirilebilir
          ii) Parametrelerin data tiplerini degistirebilirsiniz
          iii) Parametrelerin yerlerini degistirebilirsiniz ancak
               data tipleri farkli ise.
        3) Method ismi + paremetreler = Method Signature
        Method Signature disinda ne degistirirseniz degistirin java o method'lari farkli kabul etmez.
     */

    public static void main(String[] args) {

        add(3,5);// 8
        add(3,5.0);// 8.0
        add(3.0,8);// 11.0
        add(8,7,5);// 20
    }

    public static void add(int a,int b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public  static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }
}
