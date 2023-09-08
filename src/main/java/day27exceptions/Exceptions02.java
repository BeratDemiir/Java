package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    /*
     1) FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
        "new" den sonra "FileInputStream" hata verir. Cunku; biz Java'ya verilen adresteki dosya'ya git dedik, Java
        iki endise'ye kapildi i) Ya adres yanlissa  ii) Ya verilen adreste dosya yoksa.
        Biz "method isminden" sonra, "throws FilNotFoundException" yazarak, Java'ya bu iki endise duydugun durum
        olusursa "Exception At" dedik.

     2) while ((k=fis.read()) != -1){} yazdigimizda "read()" method'u hata verir. Cunku biz Java'ya dosya'daki
        karakterleri oku dedik. Java bir endiseye kapildi i) ya okumasi gereken karekterler Java'nin bilmedigi karekterlerse
        Biz method isminden sonra  "throws IOException" yazarak, Java'ya bu durumla karsilastiginda "Exception At" dedik.

     3) method isminden sonra  "throws IOException" yazarsaniz Java "throws FilNotFoundException" i siler. Cunku;
        "IOException", "FilNotFoundException" i kapsar. "IOException", "FilNotFoundException" in parent'idir, onun yaptigi
        herseyi yapabilir o yuzden "IOException" varken "FilNotFoundException" a gerek yoktur.

        "IOException", "Input Output Exception" demektir.
     4) Gordugunuz gibi "IOException" ve "FilNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.
        Bu tarz Exception'lara "Compile Time Exception" denir, diger adlari "Checked Exception" dir.

        "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz.
     */

    public static void main(String[] args) throws IOException {

        readTheFromTheFile();
        readTheText();

    }

    // Bir text file'daki text'i okuyan kodu yaziniz.

    // 1.Yol
    public static void readTheFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

        int k =0;
        while ((k=fis.read()) != -1){
            System.out.print((char) k);
        }
    }

    // 2.Yol
    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

            int k =0;
            while ((k=fis.read()) != -1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya varligi ile ilgili bir problem var");
        } catch (IOException e) {
            System.out.println("Dosya da okunamayan bir karekter var");
        }
    }
}
