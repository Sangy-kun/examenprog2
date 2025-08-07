package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Match {
    private int id;
    private LocalDate date;
    private String location;
    private List<Fighter> fighters;
    private MatchType type;

    public Match(int id, LocalDate date, String location, Fighter fighters, MatchType type) {
        this.id = id;
        this.date = date;
        this.location = location;
        this.fighters = new ArrayList<>();
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Fighter> getFighters() {
        return fighters;
    }

    public void setFighters(List<Fighter> fighters) {
        this.fighters = fighters;
    }

    public MatchType getType() {
        return type;
    }

    public void setType(MatchType type) {
        this.type = type;
    }

    public void addFighter(Fighter fighter){
        this.fighters.add(fighter);
    }

    public void removeFighter(Fighter fighter){
        this.fighters.remove(fighter);
    }

    public boolean matchHappening(Fighter fighter){
        return this.fighters.contains(fighter);
    }

    public void onGoingMatch(){
        if(this.type == MatchType.OFFICIAL_MATCH){
            
        }
    }
}
