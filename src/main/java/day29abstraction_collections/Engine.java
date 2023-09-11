package day29abstraction_collections;

public interface Engine extends Vehicle{

    // Child           Parent
    // Class     ---> interface  ==> implements
    // Class     ---> Class     ==> extends
    // Interface ---> Interface ==> extends
    // Interface ---> Class     ==> Mumkun degil

    // interface'lerdeki tum variable'lar otamatik olarak(default) "public" dir.
    // interface'lerdeki tum variable'lar otamatik olarak(default) "final" dir.
    // interface'lerdeki tum variable'lar otamatik olarak(default) "static" dir.
    int price = 2000;

    double weight = 23.5;

    void run();

}
