package day31maps;

import java.util.*;

public class HashMap01 {

    /*
       1) "Map" ler "key-value" structer'ini kullanir.
       2) "Map" lerde "key" kismi unique(tekrarsiz) olmalidir.
       3) "Map" lerde "value" kismi non-unique(tekrarli) olabilir.
       4) "Map" lerde "key" kisminda null tekrarsiz olarak kullanilir.
       5) "Map" lerde "value" kisminda null tekrarli kullanilabilir.
       6) Map lerde eleman degil EntrySet kullaniriz.
       7) HashMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz, rastgele siralar.
       8) Siralama ile vakit kaybetmedigi icin HashMap'ler cok hizli calisir.
    */
    public static void main(String[] args) {

        // HashMap'ler nasil olusturulur.
        HashMap<String, Integer> studentAges = new HashMap<>();

        // HashMap'lere eleman nasil eklenir.
        studentAges.put("Ali", 13);
        studentAges.put("Tom", 21);
        studentAges.put("Brad", 12);
        studentAges.put("Ajda", 76);
        studentAges.put("Cuneyt", 75);
        studentAges.put("Ali", 88);// Ayni key degerini tekrar kullandiginizda hata vermez "overwrite" yapar.
        studentAges.put(null, 55);
        studentAges.put(null, 66);
        studentAges.put("Ayhan Isik", null);
        studentAges.put("Sadri Alisik", null);

        System.out.println(studentAges);// {null=66, Ayhan Isik=null, Sadri Alisik=null, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        // Map'den sadece key'ler nasil alinir.
        Set<String> keys = studentAges.keySet();
        System.out.println(keys);// [null, Ayhan Isik, Sadri Alisik, Tom, Ajda, Brad, Cuneyt, Ali]

        // Map'den sadece value'ler nasil alinir.
        Collection<Integer> values = studentAges.values();
        System.out.println(values);// [66, null, null, 21, 76, 12, 75, 88]

        // Belli bir Key'e ait value nasil alinir.
        Integer cuneytAge = studentAges.get("Cuneyt");
        System.out.println(cuneytAge);// 75

        // Example: Tum Integer yaslarin ortalamasini hesaplayan kodu yaziniz.

        Collection<Integer> ages = studentAges.values();
        int sum = 0;
        double counter = 0;

        for (Integer w : ages) {
            if (w != null) {
                sum = sum + w;
                counter++;
            }
        }
        System.out.println("Ortalama yas :" + (sum / counter));// Ortalama yas :56.33


        // Example: "A" ile baslamayan isimlerin icerdigi toplam karekter sayisini bulan kodu yaziniz.
        Set<String> names = studentAges.keySet();
        int sum1 = 0;

        for (String w : names) {
            if (w != null && !w.startsWith("A")) {
                sum1 = sum1 + w.length();
            }
        }
        System.out.println(sum1);// 25

        // remove("Ajda",76); key'si Ajda ve value'su 76 olan EntrySet'i siler ve size boolean return eder.
        boolean result = studentAges.remove("Ajda", 76);
        System.out.println(result);// true

        Integer result1 = studentAges.remove(null);
        System.out.println(result1);// 66

        // Key varsa value'u ver, key yoksa sizin istediginiz degeri verir.
        Integer result2 = studentAges.getOrDefault("Brad", 0);
        System.out.println(result2);// 12 --> cunku benim map'imde Brad'in degeri 12 yoksa sifir girecekti.

        // Key var ise; Value null ise ekleme yapar, value null degilse ekleme yapmaz.
        Integer result3 = studentAges.putIfAbsent("Tom", 100);
        System.out.println(result3);// 21
        System.out.println(studentAges);//{Ayhan Isik=null, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        Integer result4 = studentAges.putIfAbsent("Ayhan Isik", 100);
        System.out.println(result4);// {Ayhan Isik=100...} Ayhan isigin degerine 100 ekledi.
        System.out.println(studentAges);// {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Ali=88}

        // key yoksa ekleme yapar.
        Integer result5 = studentAges.putIfAbsent("Acun Ilicali", 200);
        System.out.println(result5);
        System.out.println(studentAges);// {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=200, Ali=88}

        // replace() method'u value'lari key'e bakarak degistirdi.
        studentAges.replace("Acun Ilicali", 49);
        System.out.println(studentAges);// Acun Ilicalinin degerini 49'a update yapar.

        // replace() method'u value'lari key ve value'yu kontrol ettikten sonra  degistirdi.
        studentAges.replace("Acun Ilicali", 49, 53);// Burada AcunI Ilicalinin yasi 49 ise degistir yoksa degistirme.
        System.out.println(studentAges);// {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=53, Ali=88}

        studentAges.replace("Acun Ilicali", 47, 60);
        System.out.println(studentAges);// {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Acun Ilicali=53, Ali=88}

        // Example: Map deki herbir entry'i ekrana farkli bir satirda olacak sekilde yazdiriniz.

        // entrySet() method'u Map deki elemanlari bir Set'in icine koyarak size verir.
        Set<Map.Entry<String, Integer>> entries = studentAges.entrySet();
        for (Map.Entry<String, Integer> w : entries) {
            System.out.println(w);
        }
    }
}
