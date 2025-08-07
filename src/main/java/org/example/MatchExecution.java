package org.example;

public class MatchExecution {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("combatant1", "John", "Doe", "John Ceena", null);
        Fighter fighter2 = new Fighter("combatant2", "Bat", "Man", "Batman", null);

        Match match = new Match(1, null, "Los Angeles", fighter1, MatchType.OFFICIAL_MATCH);
        Match match2 = new Match(2, null, "Gotham", fighter2, MatchType.OFFICIAL_MATCH);



    }
}
