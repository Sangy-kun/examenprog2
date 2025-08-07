package org.example;

import java.util.List;

public class UFCLeague {
    private String name;
    private List<String> fighter;
    private List<Match> match;

    public UFCLeague(String name, List<String> fighter, List<Match> match) {
        this.name = name;
        this.fighter = fighter;
        this.match = match;
    }

}
