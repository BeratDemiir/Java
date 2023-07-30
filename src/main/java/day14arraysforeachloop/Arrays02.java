package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

        // Kullanici ile beraber bir Array olustrun
        //   Bir ogretmenin sinifindaki ogrencilerin isimlerin application'a yuklemesini saglayan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];


   for (int i=1; i<=numOfStd; i++){
       System.out.println("Lütfen "+ i + ". ogrencinin ilk ismini giriniz");
       String stdName =input.next();
       names[i-1] = stdName;
   }
        System.out.println(Arrays.toString(names));
    }
}
