package Model;

import java.util.List;

public class League {

    public String name;
    public Country country;
    public List<Team> teams;

    public League(String name, Country country){
        this.name = name;
        this.country = country;
    }

    //Getters
    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public List<Team> getTeams() {
        return teams;
    }

    //Methods
    public void addTeam(Team team){
        teams.add(team);
    }



}
