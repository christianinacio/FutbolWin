package Model;

import Model.player.Player;

import java.util.List;

public class Team {

    public String name;
    public List<Player> players;
    public int match;
    public int point;

    public Team(String name){
        this.name = name;
    }

    //Getters
    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getPoint() {
        return point;
    }

    public int getMatch() {
        return match;
    }

    //Methods
    public void win(){
        this.match ++;
        this.point += 3;
    }

    public void draw(){
        this.match ++;
        this.point += 1;
    }

    public void lost(){
        this.match ++;
    }



}
