package day33iterators_enums;

public class Enums02 {

    public static void main(String[] args) {

        // Constants statiktir, çünkü constants'i Enum adıyla erişebiliriz
        Enums01 enm = Enums01.JANUARY;
        System.out.println(enm);

        Enums01 months = Enums01.JANUARY;

        switch (months) {
            case JANUARY:
                System.out.println("Eğer ay Ocak ise bir şey yapın");
                break;
            case FEBRUARY:
                System.out.println("Eğer ay Subat ise bir şey yapın");
                break;
            case MARCH:
                System.out.println("Eğer ay Mart ise bir şey yapın");
                break;
            case APRIL:
                System.out.println("Eğer ay Nisan ise bir şey yapın");
                break;
            case MAY:
                System.out.println("Eğer ay Mayis ise bir şey yapın");
                break;
            case JUNE:
                System.out.println("Eğer ay Haziran ise bir şey yapın");
                break;
            case JULY:
                System.out.println("Eğer ay Temmuz ise bir şey yapın");
                break;
            case AUGUST:
                System.out.println("Eğer ay Agustos ise bir şey yapın");
                break;
            case SEPTEMBER:
                System.out.println("Eğer ay Eylul ise bir şey yapın");
                break;
            case NOVEMBER:
                System.out.println("Eğer ay Ekim ise bir şey yapın");
                break;
            case OCTOBER:
                System.out.println("Eğer ay Kasim ise bir şey yapın");
                break;
            case DECEMBER:
                System.out.println("Eğer ay Aralik ise bir şey yapın");
                break;
            default:
                break;
        }
    }
}

