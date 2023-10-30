import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class TeamTest {

    // creation of the arrays

    String[] firstName = { "Sarah", "Victoria", "Beth", "Megan" };
    String[] lastName = { "Smith", "Jackson", "Tanner", "Williams" };
    String[] positionOptions = { "defense", "midfield", "forward", "goalie" };

    Player player1 = new Player(firstName[0] + lastName[0], positionOptions[0], 60, 4, 8, 0.20);
    Player player2 = new Player(firstName[1] + lastName[1], positionOptions[1], 100, 10, 1, 0.10);
    Player player3 = new Player(firstName[2] + lastName[2], positionOptions[2], 120, 2, 0, 0.10);
    Player player4 = new Player(firstName[3] + lastName[3], positionOptions[3], 80, 20, 13, 0.5);
    // Setting the different players into an array with the Player type
    Player[] playersArray = { player1, player2, player3, player4};
    // creating a new instance of Team with argument player;
    Team team=new Team(playersArray);

    @Test
    void testSOGAverage() {
        // init and declaration
        int totalGoals = 0;

        for (Player players : team.getTeam()) {

            totalGoals += players.getGoals();

        }
        assertEquals(36, totalGoals);
    }

    @Test
    void testGetTeam() {

    }

    @Test
    void testGetName() {
        
    }
}