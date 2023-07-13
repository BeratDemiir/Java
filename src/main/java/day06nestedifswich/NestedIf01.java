package day06nestedifswich;

public class NestedIf01 {
    public static void main(String[] args) {

       /*
       Pasword 'un ilk harfi buyuk harf ise;
            'A' olursa gecerli password aksi halde gecersiz password
       Password'un ilk harfi kucuk harf ise;
            'z' olursa gecerli password aksi halde gecersiz password

        Note: Java "nested" kodlari calistirirken cok zaman harcar, buna "Time Complexity" denir.
              Bu yuzden mumkunse "nested" kullanmamaya calisiriz.

        */

        String pwd="5xy12!";

        char ilkHarf=pwd.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){

            if (ilkHarf=='A'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz password");
            }
        } else if (ilkHarf>='a' && ilkHarf<='z') {

            if (ilkHarf=='z'){
                System.out.println("Gecerli password");
            }else {
                System.out.println("Gecersiz password");
            }
        }else {
            System.out.println("İlk karekter harf olmalidir");
        }
    }
}
