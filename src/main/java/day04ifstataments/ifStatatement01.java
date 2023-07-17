package day04ifstataments;

    public class ifStatatement01 {

        public static void main(String[] args) {

            // Note: if statemens belli kodlari belli sartlara bagli olarak calistirmaya yarar.

            // Example: sayi pozitif ise ekrana pozitif yazdir.

            int s= 12;

            if(s>0){
                System.out.println("pozitif");
            }

            // Example: verilen karekter buyuyk haraf ise ekrana "Büyük harf" yazdirin.

            char ch='A';

            if (ch>='A' && ch<='Z'){
                System.out.println("Büyük harf");
            }

            // Example: verilen bir sayi 3 basmakli ise ekrana 3 basamakli yazdirin.

            int sayi=999;
            sayi =Math.abs(sayi);

            if (sayi>99 && sayi<1000){
                System.out.println("Üç basamaklı");
            }

            // EXample: verilen bir sayi cift sayi ise ekrana cift sayi yazdir.

            int n=12;

            if (n%2==0){
                System.out.println("Çift sayi");
            }

            // Example: verilen bir sayi 300 den kucuk 1200 den buyuk ise "harika sayi" yazdirin

            int a=450;

            if (a<300 || a>1200){
                System.out.println("Harika sayi");
            }

        }
    }


