package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static class wrapperClass01 {

        public static void main(String[] args) {
        /*
          Java primitive lere method'lar ekleyerek yeni bir yapi olusturuldu,bu yapiya "Wrapper Class" denir.

          primitive        Wrapper
           byte     ==<    Byte
           short    ==<    Short
           int      ==<    Integer
           long     ==<    Long
           float    ==<    Float
           double   ==<    Double
           boolean  ==<    Boolean
           char     ==<    Character

         */

            byte primitiveByte=12;
            // "PrimitiveByte" yazip nokta koyunca hic method göremezsiniz cunku primitivler method icermez sadece deger icerir.

            Byte wrapperByte=12;
            // "wrapperByte" yazip nokta koyunca bir cok method görürsünüz cünkü "wrapper" lar method icerir.

            // Example: byte data type'nin en buyuk ve en kucuk degerlerini ekrana yazdırın

            System.out.println(Byte.MIN_VALUE);// -128
            System.out.println(Byte.MAX_VALUE);// 127

            // example: short, int, long data type'lerinin en buyuk ve en kucuk degegrlerini yaziniz.

            System.out.println(Short.MIN_VALUE);// -32768
            System.out.println(Short.MAX_VALUE);// 32767

            System.out.println(Integer.MIN_VALUE);// -2147483648
            System.out.println(Integer.MAX_VALUE);// 2147483647

            System.out.println(Long.MIN_VALUE);// -9223372036854775808
            System.out.println(Long.MAX_VALUE);// 9223372036854775807

            // "Primitivler" nasil "wrapper" lere cevrilir.Buna(Autoboxing) denir.

            float f1=13.99f;
            Float warapperF1=f1;

            // "wrappler" ler nasil "Primitive" lere cevrilir.Buna(Unboxing) denir.

            Character w1='s';
            char  primitiveW1=w1;

            // note: Autoboxing ve Unboxing Java tarafindan otamatik olarak olarak yapılır.






        }
    }

}
