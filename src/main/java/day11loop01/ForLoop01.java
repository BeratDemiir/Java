package day11loop01;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example: 3'den 6'ya kadar tamsayilarin toplamini bulan kodu yaziniz.
        int sum =0;
        for (int i =3; i<7 ; i++){
            sum =sum+i;
        }
        // Note: System.out.println(sum); loop'un disina yazilirsa "sum" 'in sadece son degerini ekrana yazdirir.
        //       System.out.println(sum); loop'un icine yazilirsa her bir loop icin "sum"'in hangi degerleri aldigini yazdirir.
        System.out.println(sum);// 18

        // Example: 6'dan 3'a kadar tam sayilarin carpimini bulan kodu yaziniz.
        int miltiply =1;
        for (int i =6 ; i>2 ; i--){
            miltiply =miltiply*i;
        }
        System.out.println(miltiply);// 360

        // Example: size verilen  bir tamsayinin rakamlari toplamını bulunuz.
        int num =-1453;
         num=Math.abs(num);
        int sonuc = 0;
        for (int i = num; i>0 ; i=i/10){
            sonuc =sonuc+i%10;
        }
        System.out.println(sonuc);// 13

        // Example: Size verilen bir string'i ters cevirip yazdırın.
        String str = "Berat";
        for (int i = str.length()-1; i>=0 ; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

        // 2.Yol***
        String str1 ="berat";
        String ters ="";
        for (int i = str.length()-1; i>=0 ; i--){
            char c =str1.charAt(i);
            ters = ters + c;
        }
        System.out.print(ters);
    }
}
