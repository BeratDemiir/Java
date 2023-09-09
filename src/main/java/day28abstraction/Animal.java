package day28abstraction;

public abstract class Animal {

    // Body'si olmayan method'lar "abstract method" olarak adlandirilir.
    // Note: Bir method'u abstract yapmak icin;
    //     1) Method body'i sil.
    //     2) "Access modifier" ile "return type" arasina "abstract" yazilmali.("public abstract void eat();")
    // Note: Abstract method'lar "abstract class" icinde olmalidir.("public abstract class Animal {}")
    // Note: Abstract method child'ler icin zorunlu olmalidir.
    public abstract void eat();

    // "abstract class" larda hem "abstract hem de "concrete"(non-abstract) method kullanilabilir.
    public void drink (){
        System.out.println("Animals drink...");
    }

    // Abstract "move" method olusturunuz
    public abstract void move();

}
