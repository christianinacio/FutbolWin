import player.Player;

import java.util.List;

public class Team {

    public String name;
    public List<Player> players;
    public int match;
    public int point;

    public Team(String name){
        this.name = name;
    }

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



}
