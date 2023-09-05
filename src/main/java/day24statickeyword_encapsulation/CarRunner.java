package day24statickeyword_encapsulation;

public class CarRunner {


    /*
        Static Keyword nedir?
         1) Class'a baglanmis Class elamanidir.
         2) Static Class elamanlari butun Objelerin ortak elamanidir.
         3) Static uzerinde yapilan her degisiklikte butun Objeleri etkiler butun Objeler tarafindan gorulur.
         4) Static Class elamanlarina Class uzerinden ulasilir. Objeler static'lere ulasmak icin kullanilmaz(tavsiye edilmez)
         5) Static'ler Overriding edilemez, cunku ortak method oldugu icin herkes etkilenir ve izin verilmez.
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        // static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        System.out.println(car1.counter);// 4
        // static variable'lara Class ismi kullanarak ulasilmalidir
        System.out.println(Car.counter);
        System.out.println(car1.price);// 20001


        System.out.println(car2.counter);// 4
        System.out.println(car2.price);// 20001
    }
}
