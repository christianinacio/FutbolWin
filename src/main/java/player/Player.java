package player;


public class Player {

    public String name;
    public String lastname;
    //TODO: team
    public int goles;

    public Player(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
