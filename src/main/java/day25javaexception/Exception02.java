package day25javaexception;

public class Exception02 {

    public static void main(String[] args) {

        String arr[] ={"Ali","Can","Veli","Han"};
        getElementFromArray(arr,2);// Veli
        getElementFromArray(arr,0);// Ali
        getElementFromArray(arr,4);// ArrayIndexOutOfBoundsException
    }
    // Bir String Array den index girerek eleman elde edebilmek icin bir method olusturunu.

    public static void getElementFromArray(String arr[], int idx){

        try {
            System.out.println(arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Array index te bir Problem meydana geldi");
            // Exception ile ilgili detaylica teknik bilgi verir.
            e.printStackTrace();
        }

    }
}
