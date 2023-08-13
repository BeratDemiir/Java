package day19dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        // Example: Anlik tarihi ekrana yazdiran kodu yaziniz.
        // currentDate = Anlik tarih
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2023-08-13

        // Example : Anlik zamani ekrana yazdiran kodu yaziniz.
        // currentTime = Anlik zaman
        LocalTime currentTime =LocalTime.now();
        System.out.println(currentTime);// 16:17:53.410955400

        // Example:  Anlik tarihi ve zamani ekrana yazdiran kodu yaziniz.
        LocalDateTime dateAndTime =LocalDateTime.now();
        System.out.println(dateAndTime);// 2023-08-13T16:23:47.991198200

        // Example: Japonya'daki anlik tarih ve zamani ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);// 2023-08-13T22:29:09.788474400

        // Example: Istanbul'daki anlik tarih ve zamani ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInTurkey = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInTurkey);// 2023-08-13T16:33:19.531056900

        // Example: bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
       LocalDate countDate = LocalDate.of(2023,8,13);
        LocalDate retireDate = countDate.plusDays(789);
        // retireDate = emeklilik gunu
        System.out.println(retireDate);// 2025-10-10

        // Example : iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        // between() methodu kullanildiginda dha eski olan tarih once yazilmalidir.
        Long diference = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diference);// 2824
    }
}
