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

        // Example: Tom Ali den 3 yil 8 ay 13 gun sonra dogdu Ali ise veliden 1 yil 15 gun once dogdu.
        //          Tom'un dogum tarihi 18 kasim 2011 ise veli ve ali'nin dogum tarihlerini bulunuz.

        LocalDate tomBirthDay = LocalDate.of(2011,11,18);
        LocalDate aliBrithDay =tomBirthDay.minusYears(3).minusMonths(8).minusDays(13);// Method chain = method zinciri
        LocalDate veliBrithDay =aliBrithDay.plusYears(1).plusDays(15);// Method chain = method zinciri
        System.out.println("Ali'nin dogum tarihi : "+aliBrithDay);// 2008-03-05
        System.out.println("Veli'nin dogum tarihi : "+veliBrithDay);// 2009-03-20

        // Example : :Istanbul'un fethi ile cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.

        LocalDate istanbulFethi =LocalDate.of(1453,5,29);
        LocalDate cumhuriyetinKurulusu =LocalDate.of(1923,10,29);

        Long monthDiference = ChronoUnit.MONTHS.between(istanbulFethi,cumhuriyetinKurulusu);
        System.out.println(monthDiference);// 5645

        // Example : Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.

        LocalDate myDate = LocalDate.of(1999,11,2);
        int day =myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if (day<23 && month==11) {
            System.out.println("Akrep Burcu");
        } else if (day>23 && month==10) {
            System.out.println("Akrep Burcu");
        }
    }
}
