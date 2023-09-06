package day25javaexception;

public class Exception03 {

    public static void main(String[] args) {

        String str = "Ali";
        getNumOfChars(str);// 3

        String s = "";
        getNumOfChars(s);// 0

        String t = null;
        getNumOfChars(t);// NullPointerException
        // Eger length() methodunda null kullanirsaniz bu (NullPointerException) exception'i alirsiniz

    }

    // Bir String'de bulunan charecterlerin sayisini bulabilmek icin bir method olusturun.

    public static void getNumOfChars(String str){

        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.err.println("length() methodunda bir problem olustu "+ e.getMessage());
            e.printStackTrace();
        }
    }
}