package day24statickeyword_encapsulation;


// Encapsulation: "Data Hiding(Gizlemek)" demektir.
// Data'yi nicin gizlersiniz?
   //  Data'yi dis etkenlerden korumak icin.
// Data'yi nasil9 gizlersiniz?
   //  Access Modifier'ini "private" yaparak gizlerim
// Data'yi gizledikten sonra baska Class'lardan okumak isterseniz ne yaparsiniz?
   // "get(getter)" method'lar olusturarak gizledigimiz data'lari okunur hale getirebiliriz.
// Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
   // "set(stter)" method lar olusturarak gizledigimiz data'lari degistirebilirsiniz.
// Notes...
// Variable'nin "data type" i ile get method'un "return type" i ayni olmalidir.
// "get method" lari isimlendirirken "get + <variable name>" ancak;
  // variable'in data type'i "boolean" ise "is + <variable name>"
// "set method" lari ismlendirirken "set + <variable name>" seklinde yazilir.
// Encapsulation'da "set" method'u ile degisim yapinca objeler degisir Class'daki orjinal bilgiler korunur.
public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}
