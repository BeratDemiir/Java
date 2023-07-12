package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {


        // Example: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrena yazan kodu yazın

        Scanner input =new Scanner(System.in);

        System.out.println("Bir sayi giriniz...");

        int sayi=input.nextInt();

        // 1.Yol...

        if (sayi%2==0){
            System.out.println("Sayiniz cift sayidir.");
        }
        if (sayi%2!=0){
            System.out.println("Sayiniz tek sayidir");
        }

        // 2.Yol...

        if (sayi%2==0){
            System.out.println("Çift sayi...");
        }else {
            System.out.println("Tek sayi...");
        }

        // Example: Bir sayinin negatif pozitif veya notr oldugunu soyleyen kodu yaziniz

        System.out.println("Bir sayi giriniz");
        double d= input.nextDouble();

        if (d>0){
            System.out.println("Pozitif...");
        } else if (d==0) {
            System.out.println("Notr...");
        }else {
            System.out.println("Negatif...");
        }
    }
}
