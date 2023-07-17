package day04ifstataments;

import java.util.Scanner;

    public class Scanner02 {

        /*
        Note: char variable'leri matematiksel islemlerde kullanirsaniz, Java onlarin ASCII degerlerini kullanir.
               örnegin; System.out.println('A'+'C') ekrana AC yerine 132 yazdirir.
        Note: Java da "+" sembolunun iki anlami vardir. (toplama ve birlestirme(Concatenation))
              Java "+" sembolunu gorunce ilk toplama islemi yapmaya calisir yapamazsa birlestirme islemi yapmaya calisir oda olmazsa hata verir.
         */
        public static void main(String[] args) {

            // Example: kullanicidan ilk ve soy ismini aliniz,ilk ve soy isminin ilk harflerini ekrana yazdirin
            //   Ali Can ==< AC

            Scanner input=new Scanner(System.in);

            // 1.yol:

            System.out.println("ilk isminizi giriniz...");
            char ilk=input.next().charAt(0);//A

            System.out.println("soy isminizi giriniz...");
            char soy=input.next().charAt(0);//C

            System.out.println(""+ilk+soy);// AC

            // 2.yol:

            System.out.println("Tam isminizi giriniz...");
            String tamisim=input.nextLine();

            char ilkharf=tamisim.charAt(0);//A

            char soyIsminIlkHarfi=tamisim.split(" ")[1].charAt(0);

            System.out.println(""+ilkharf+soyIsminIlkHarfi);

        }
    }


