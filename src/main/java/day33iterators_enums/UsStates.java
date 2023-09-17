package day33iterators_enums;

import java.util.Arrays;

public enum UsStates {

    /*
     1)Enum nedir?
	    Bir "enum", bir grup sabiti temsil eden özel bir "sınıftır"
	   (değiştirilemez değişkenler, statik + final değişkenler).
	 2) Enum ve sınıf arasındaki fark nedir?
	   a)Bir enum, tıpkı bir sınıf gibi, niteliklere ve yöntemlere sahip olabilir.
	   Tek fark, enum sabitlerinin genel, statik ve final (değiştirilemez - geçersiz kılınamaz) olmasıdır.
	   b)Bir enum nesne yaratmak için kullanılamaz ve diğer sınıfları genişletemez
	   (ancak arayüzleri uygulayabilir).
	 3) Enumlar Neden ve Ne Zaman Kullanılır?
	   Değişmeyeceğini bildiğiniz değerlere sahip olduğunuzda enum'ları kullanın,
	   ay günleri, günler, renkler, kart destesi vb. gibi.
	 4) Sabitler büyük harflerle yazılmalı, virgül ile ayrılmalı, sonunda noktalı virgül kullanılmamalıdır
	 */

    ALABAMA("Alabama", "AL", "Montgomery"),
    ALASKA("Alaska", "AK", "Juneau"),
    ARIZONA("Arizona", "AZ", "Phoenix"),
    FLORIDA("Florida", "FL", "Tallahassee"),
    GUAM("Guam", "GA", "Hagatna"),
    WASHINGTON("Washington", "WA", "Olympia");

    private final String stateName;
    private final String abbreviation;
    private final String capital;

    UsStates(String stateName, String abbreviation, String capital) {
        this.stateName = stateName;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }

    public static String getStateNameFromAbbreviation(String abbreviation){
     return    Arrays.stream(values()).filter(UsStates->UsStates.getAbbreviation().equals(abbreviation)).findFirst().get().getStateName();
    }

    public static String getStateNameFromCapital(String capital){
      return   Arrays.stream(values()).filter(UsStates->UsStates.getCapital().equals(capital)).findFirst().get().getStateName();
    }

    // Example: Baskenti verilen state'in kisaltmasini ekrana yazdiran kodu yazdirin.

    public static String getAbbreviationFromCapital(String capital){
     return   Arrays.stream(values()).filter(t->t.getCapital().equals(capital)).findFirst().get().getAbbreviation();
    }
}
