package day15arrays_multidimensionalarrays;

public class Arrays03 {

    public static void main(String[] args) {

       // Example: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz.
       //         [ a - e - i - o - u ] - [ A - E - I - O - U ]

        String str ="Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        String harfler[] =str.split("");// split herzaman Array verir.
        int counter=0;
       str = str.toLowerCase();
        for (String w: harfler){
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
