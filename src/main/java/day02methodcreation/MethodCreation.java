package day02methodcreation;

public class MethodCreation {
    public static void main(String[] args) {

        System.out.println(toplamayap(1.2,5));

        System.out.println(ucsayiyicarp(5,8,9));

        System.out.println(carptopla(3,5,4));

    }
    public static double toplamayap(double a, double b){
        return a+b;
    }

    public static double ucsayiyicarp(double x, double y, double z){
        return x*y*z;
    }

    public static double carptopla(double a,double b, double c){
        return (a+b)*c;
    }
}

