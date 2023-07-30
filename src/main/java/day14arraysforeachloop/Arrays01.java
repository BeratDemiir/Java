package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        // Array'lerin icine sadece "primitive data type" leri ve "reference"(adress) ler  yerlestirilebilir.

        String str[] = new String[3];
        str[0] ="Java";
        str[1] ="did";
        str[2] ="surprise you";
        System.out.println(Arrays.toString(str));

        // Example: String bir array olusturunuz ve "Tom" ve "Tom" dan onceki tum elamanlari ekrana yazdirin.
        String arr[] ={"Jane", "Mark", "Tom", "Ali", "Rojda"};

        for (String w :arr){
            System.out.println(w);
            if (w.equals("Tom")){
                break;
            }
        }

        // Example: String bir array olusturunuz "Tom" ve "Jane" haric tum elamanlari ekrana yazdirin.

        String brr[] ={"Jane", "Mark", "Tom", "Ali", "Rojda"};

        for (String w : brr){
            if (w.equals("Tom") || w.equals("Jane")){
              continue;
            }
            System.out.println(w);
        }
    }
}
