package day19dateandtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {

    public static void main(String[] args) {

        // Example: Java'dan aldiginiz time'in formatini degistiriniz.

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);// 16:23:54.000002345

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyTime1 = dtf1.format(myTime);
        System.out.println(formattedMyTime1);// 04:23 PM

        // Note: 24 saat sistemini kullanmak icin "HH" leri 12 saat sistemini kullanmak icin "hh"  seklinde yazilmalidir.
        // Note: "hh:mm a" bu format 12 saat sistemini "am" "pm" seklinde yazdirir.

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyTime2 = dtf2.format(myTime);
        System.out.println(formattedMyTime2);// 16:23
    }
}
