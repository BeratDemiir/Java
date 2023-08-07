package day16multidimensionalarrays_arraylists;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

       // Bir Multidimensional array'deki en buyuk ve en kucuk elamanin toplamini veren kodu yaziniz.

        int arr[][] ={{2, 5, 1}, {32, 75}};
        int max =arr[0][0];
        int min =arr[0][0];

        for (int[] w: arr){
            for (int k: w){
                max =Math.max(max,k);
                min =Math.min(min,k);
            }
        }
        System.out.println(max+min);
    }
}
