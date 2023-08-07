package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
        1) Java variable'lerin orjinal degerlerini korumak ister.
        2) Variable method 'lar icinde kullanildiginda, java method'un icine orjinal degeri koymaz.
           o degerin kopyasini uretir ve method'a o kopyayi yollar. Method kopya ustunde degisiklik,
           yapar dolayisiyla variable'nin orjinal degeri korunmus olur. Bu sisteme "Pass By Value" denir.

          Note: Java "Pass By Value" kullanir. "Pass By Reference" kullanmaz.
          Note: Bazi proglama dilleri orijinal degeri koruma altina almamistir. Bu isi developer'lara birakmistir.
                Bu tarz diller "Pass By Reference" kullanir.
     */

    public static void main(String[] args) {
        int x =5;
        System.out.println(x);// 5
        // static method olan "main method" un icindeki hersey static olmalidir
        change(x);// 15
        System.out.println(x);// 5

        int ucret =100;

       int kopya = indirim(ucret);
       ucret =indirim(ucret);
        System.out.println(kopya);// 90
        System.out.println(ucret);// 90
    }

    public static void change(int a){
        System.out.println(a*3);
    }
    // Void disindaki "return" type'lerde method body'si icinde "return" keyword kullanilmalidir.
    public static int indirim(int gomlekUcreti){
        return  gomlekUcreti -10;
    }
}
