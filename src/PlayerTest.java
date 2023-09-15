import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    void testEquals() {

    }

    @Test
    void testGetName() {
        Player player1 = new Player(null, null, 0, 0, 0, 0);
        String[] firstName = { "Sarah", "Victoria", "Beth" };
        String[] lastName = { " Smith", " Jackson", " Tanner" };
        player1.setName(firstName[0] + lastName[0]);
        assertEquals("Sarah Smith", player1.getName());

    }

    @Test
    void testGetPosition() {
        

    }

    @Test
    void testMain() {

    }

    @Test
    void testSetName() {

    }

    @Test
    void testSetPosition() {

    }

    @Test
    void testToString() {

    }
}
