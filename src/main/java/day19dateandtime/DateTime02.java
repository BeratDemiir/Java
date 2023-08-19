package day19dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        // Example: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2023/08/18

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate1 = dtf1.format(currentDate);
        System.out.println(formattedDate1);// 18/08/2023

        // Ayin ilk 3 harfini yazdirir "/MMM/"
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String formattedDate2 = dtf2.format(currentDate);
        System.out.println(formattedDate2);// 18/Ağu/2023

        // Ayin tam ismini gosterir "/MMMM/"
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedDate3 = dtf3.format(currentDate);
        System.out.println(formattedDate3);// 18/Ağustos/2023

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/M/yyyy");
        String formattedDate4 = dtf4.format(currentDate);
        System.out.println(formattedDate4);// 18/8/2023
        // Note: "M" 10'dan kucuk aylari 1,2,3,... seklinde yazar.
        // Note: "MM" 10'dan kucuk aylari 01,02,03,... seklinde yazar.

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yy");
        String formattedDate5 = dtf5.format(currentDate);
        System.out.println(formattedDate5);// 18/8/23
    }
}
