package day19dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime04 {

    public static void main(String[] args) {

        // Example: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz.

        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japan);// 2023-08-19T17:32:22.365486700

        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(germany);// 2023-08-19T10:32:22.366485700

        Long fark = ChronoUnit.HOURS.between(germany,japan);
        System.out.println(fark);// 6

        // Example: Sabit bir tarih olusturunuz
        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);// 2011-04-13

        /*
         Note: Java'da sabit datalari(gun,ay,yil) depolamak ve gerektiginde kullanmak icin depolar olustururuz. Bu depolara "Enum" denir.
       */

        // Example: USA icin "Woow", UK icin "Big", "CANADA" icin "cold", "TURKEY" icin "vatan"

        Countries country = Countries.TURKEY;

        switch (country){
            case USA:
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big!");
                break;
            case CANADA:
                System.out.println("Cold!");
                break;
            case TURKEY:
                System.out.println("Vatan!");
                break;
            default:
                System.out.println("Tanimlanmamis ulke");
        }

    }
}
