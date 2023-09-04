package day23inheritancepolymorphism;

public class Courses {

    public void liveSessions(){
        System.out.println("Courses live");
    }

    public Courses(){
        System.out.println("Constructor A");
    }

    public Courses(String s){
        System.out.println("Constructor B");
    }
}
