package day33iterators_enums;

public class EnumRunner {

    public static void main(String[] args) {

       String capital = UsStates.FLORIDA.getCapital();
        System.out.println(capital);// Tallahassee

      String abbreviation = UsStates.FLORIDA.getAbbreviation();
        System.out.println(abbreviation);// FL

       String state = UsStates.getStateNameFromAbbreviation("FL");
        System.out.println(state);// Florida

        String stateName = UsStates.getStateNameFromCapital("Olympia");
        System.out.println(stateName);// Washington

       String abbr = UsStates.getAbbreviationFromCapital("Olympia");
        System.out.println(abbr);// WA
    }
}
