package Model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTeam {

    Team realMadrid;

    @Before
    public void createTeam(){
        realMadrid = new Team("Real Madrid");
    }

    @Test
    public void winTwoGames(){
        realMadrid.win();
        realMadrid.win();

        assertEquals(realMadrid.getMatch(), 2);
        assertEquals(realMadrid.getPoint(), 6);
    }

    @Test
    public void winOneGamesAndLostOne(){
        realMadrid.win();
        realMadrid.lost();

        assertEquals(realMadrid.getMatch(), 2);
        assertEquals(realMadrid.getPoint(), 3);
    }

    @Test
    public void winDrawAndLost(){
        realMadrid.win();
        realMadrid.draw();
        realMadrid.lost();

        assertEquals(realMadrid.getMatch(), 3);
        assertEquals(realMadrid.getPoint(), 4);
    }

}
