package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        // Bir string'deki "m" karekteri haric tum karakterleri yazdiriniz.
        // Andromeda ==> Androeda

        String str = "madam";

        // 1.Yol***
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm' && c != 'M') {
                System.out.print(c);
            }
        }
        System.out.println();

        // 2.Yol***
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (c == 'm') {
                continue; // Bosver  ==> Loop'un icinde bazi degerler icin Loop'un calismamasini isterseniz "continue" kullaniniz.
            }
            System.out.print(c);
        }
        System.out.println();

        // Example: 1'den 100'e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz.
        for (int i = 1; i < 101; i++) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.print(i + ", ");
        }
        System.out.println();

        // Example: Size verilen bir String'deki 'm' den onceki karekterleri yazdiriniz.
        //      Luxemburg ==> Luxe

        String str1 = "Luxemburg";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'm') {
                break;
            }
            System.out.print(ch);
        }
    }
}
