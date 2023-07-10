package day02methodcreation;

    public class Car {

        public String marka="Honda";
        public int fiyat=20000;


        public static void main(String[] args) {

            Car myhonda=new Car();

            System.out.println(myhonda.fiyat);
            System.out.println(myhonda.marka);

            myhonda.dur();
            myhonda.hareketEt();

            MethodCreation obj=new MethodCreation();

        }

        public void hareketEt(){
            System.out.println("Honda Güzel hareket eder...");
        }
        public void dur(){
            System.out.println("Honda güvenli durur...");
        }

    }


