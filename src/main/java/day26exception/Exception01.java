package day26exception;

public class Exception01 {

    public static void main(String[] args) {

        String str = "123";
       int result = convertStringToInteger(str);
        System.out.println(result + 5);// 128

        String st = "1a2b";
       int r = convertStringToInteger(st);
        System.out.println(r + 10);// NumberFormatException: Eger icinde rakamdan farkli charecter barindiran bir String'i
                                   // valueOf() kullanarak Integer'e cevirmek isterseniz NumberFormatException alirsiniz.
    }

    public static int convertStringToInteger(String str){

        int i =0;
        try {
            // Herhangi bir satirda "Exception atilirsa java direkt "catch" bolumune gecer try icindeki sonraki kodlari calistirmaz.
           i = Integer.valueOf(str);
            System.out.println("Burasi try bolumu");
        }catch (NumberFormatException e){
            System.out.println("Rakam olmayan karekter iceren String'ler Integer'a cevrilmez");
        }
        return i;
    }
}
