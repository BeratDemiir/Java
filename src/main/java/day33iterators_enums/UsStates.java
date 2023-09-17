package day33iterators_enums;

import java.util.Arrays;

public enum UsStates {


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
