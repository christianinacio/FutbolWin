package Model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLeague {

    League superLiga;
    Team river;
    Team boca;

    @Before
    public void createLeague(){
        superLiga = new League("Super Liga", new Country());
    }

    @Test
    public void addTwoTeams(){
        river = new Team("River Plate");
        boca = new Team("Boca Juniors");
        superLiga.addTeam(river);
        superLiga.addTeam(boca);

        assertEquals(superLiga.getTeams().size(), 2);

    }
}
