package Model.player;

import Model.Team;

public class Player {

    public String name;
    public String lastname;
    public Team team;
    public int goles;

    public Player(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
