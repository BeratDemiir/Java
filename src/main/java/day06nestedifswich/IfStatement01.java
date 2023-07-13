package day06nestedifswich;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        // Example: kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazin.
        // 0 - 4 => Bebek
        // 5 - 12 => Cocuk
        // 13 - 20 => Genc
        // 21 - 30 => yetiskin
        // Tanimlanmamis evre

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz...");
        byte yas =input.nextByte();

        if (yas<0){
            System.out.println("Gecerli bir yas giriniz...");
        } else if (yas<5) {
            System.out.println("Bebek");
        } else if (yas<13) {
            System.out.println("Cocuk");
        } else if (yas<21) {
            System.out.println("Genc");
        } else if (yas<31) {
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanimlanmamis evre");
        }
    }
}
