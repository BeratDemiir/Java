package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
        1) HashTable bir map'dir.
        2) HashTable entrySet'leri herhangi bir siralamaya tabi tutmaz.
        3) HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir.
        4) HashTable'ler de key null olamaz. Key'i null yaparsaniz NullPointerException atar.
        4) HashTable'ler de value null olamaz. Value'yi null yaparsaniz NullPointerException atar.

        Note: toString() method'u obje'leri console'de detaylari ile gorebilmek icin class'larin icinde olusturulur.
              toString() method'unu olusturmadan object'i console'a yazdirirsaniz Java o object'in address'ini yazdirir.
    */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations);// {USA=400000000, Germany=83000000, Turkey=90000000}

        // countryPopulations.put(null, 90000000);// HashTable'ler de key null olamaz NullPointerException atar.
        // countryPopulations.put("France", null); // HashTable'ler de value null olamaz NullPointerException atar.

        Hashtable<String,Students>  myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks", "th@gamil.com", 21,true));
        System.out.println(myStudents);// {Math=[name='Tom Hanks', email='th@gamil.com', age=21, success=true]}


        // HashTable'ye yerlestirdiginiz date nin detaylarini asagidaki kodu yazarak birer birer alabiliriz.
        String name = myStudents.get("Math").name;
        System.out.println(name);// Tom Hanks

       int age = myStudents.get("Math").age;
        System.out.println(age);// 21
    }
}
