package day19dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        // Example: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2023/08/18

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dtf.format(currentDate);
        System.out.println(formattedDate);// 18/08/2023
    }
}
