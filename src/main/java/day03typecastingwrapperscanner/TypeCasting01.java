package day03typecastingwrapperscanner;

public class TypeCasting01 {

    public static class typeCasting01 {

        // Type casting: Bir numeric data type'ini diger numeric data type'ine cevirmek demektir.

        // byte <short < int < long < float < double

        // note: Küçük data type'ini Büyük data type'ine çevirmeye "Auto Widening" denir.
        // note: Büyük data type'ini Küçük data type'ine çevirmeye "Expilicit Narrowing" denir.

        public static void main(String[] args) {

            byte age=23;
            int newAge= age;

            long population=1234;
            int newPopulation=(int) population;

            // Example: short'u double ceviren kodu yaziniz.
            // float'i byte yapan kodu yaziniz.

            short urunfiyati=125;
            double yeniurunfiyati=145; // Auto Widening

            float yas=56.5f;
            byte yeniyas=(byte) yas; // Expilicit Narrowing

            System.out.println(yeniyas);//56 ==< Java ondalık sayıyı tam sayıya cevirirken yuvarlama islemi yapmaz.
            // Java ondalık sayıyı tam sayıya cevirirken ondalık kısmı siler.

            int number=515;
            byte newnumber=(byte) number;

            System.out.println(newnumber);// 3 ==> Java 515'i 256(byte'deki sayilarin sayisi)'ya böldü kalanını return etti.

            int num=510;
            byte newnum=(byte) num;

            System.out.println(newnum);// -2


        }
    }
}
