package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    /*
       1) TreeSet tekrarsiz elemanlari "alfabetik" veya kucukten buyuge (Naturel Order) dizer.
       2) TreeSet cokkk yavas calisir.

       Note: Tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak mantiklidir ama TreeSet ler cook yavas calistigi icin biz,
             elemanlari once HashSet depolariz sonra HashSet'i TreeSet e cevirerek TreeSet in yavas olma problemini asmis oluruz.
    */
    public static void main(String[] args) {

        // Example 1: sekiz tane unique String elemani alfabetik sirada depolayiniz.
        // 1.Yol:
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String>  emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);// [a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1 - start1);// 996200

        // 2.Yol:
        HashSet<String>  myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");

        // Bu code HashSet'i TreeSet'e cevirir. burda code hem hizli calisir hemde code alfabetik siraya gore siralanir.
        TreeSet myEmailsSorted = new TreeSet(myEmails);
        System.out.println(myEmailsSorted);// [a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]

        Long end2 = LocalTime.now().toNanoOfDay();
        System.out.println(end2 - end1);// 0  --> 1 nanoSecond dan dha az surede bitirdi.


    }
}
