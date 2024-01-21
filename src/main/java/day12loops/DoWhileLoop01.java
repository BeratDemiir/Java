package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        // Note: While-loop icin loop body'si icindeki kodun hic calistirilmama ihtimali vardir
        //        zero execution mumkundur
        int i=1;
        while (i<1){
            System.out.println("While Loop");
            i++;
        }

        // Note: do-while loop'un body'si icindeki kod her halikarda en az bir kere calisir.
        //        zero execution mumkun degildir.
        int k=1;

        do {
            System.out.println("Do-While Loop");
            k++;
        }while (k<1);

        // Example: Bir ondalik sayinin ondalik kismindaki rakamlarin toplamni bulunuz.

        double sayi=24.5673;
        String str =String.valueOf(sayi);

        // Note: String.valueOf() method'u parantezin icine konulan data nin tipini String yapar.

        String decimalpart =str.split("\\.")[1];
        System.out.println(decimalpart);// 5673

        // Note: Regex icin nokta kullandiginizda onune "\\" koyunuz. yani nokta "\\." seklinde kullanilir.

        int decimalInt =Integer.valueOf(decimalpart);// String'i int'e cevirir.
        int toplam=0;
        do {
            toplam=toplam+decimalInt%10;
            decimalInt=decimalInt/10;
        }while (decimalInt>0);
        System.out.println(toplam);//21
    }
}
