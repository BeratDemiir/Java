package day11loop01;

public class NestedLoop01 {

    public static void main(String[] args) {

        /*
           Example: Asagidaki ciktiyi verecek kodu yaziniz.
               Week:1
                 Day:1
                 Day:2
                 Day:3
                 ....
               Week:2
                Day:1
                Day:2
                Day:3
                ....
               Week:3
                Day:1
                Day:2
                Day:3
                ....
         */

        for ( int i=1; i<5;i++){

            System.out.println("Week: "+ i);

            for (int k=1; k<8 ; k++){
                System.out.println("Day: "+ k);
            }
        }
    }
}
