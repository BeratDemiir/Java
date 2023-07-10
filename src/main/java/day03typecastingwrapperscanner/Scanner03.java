package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static class scanner03 {

        public static void main(String[] args) {

            // kullanicidan bir dikdortgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yazınız

            Scanner input=new Scanner(System.in);

            System.out.println("dikdortgenin enini giriniz...");
            int en=input.nextInt();
            System.out.println("digdortgenin boyunu giriniz...");
            int boy=input.nextInt();

            System.out.println("Alan "+ en*boy);

            System.out.println("cevre "+ 2*(en+boy));

        }
    }

}
