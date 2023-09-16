import java.util.Arrays;

public class Team extends Player {
    // the objects in Player are given to the array team
    // init of variables
    Player[] team;
    double SOGAverage;
    int positionCount;

    /**
     * @param targetPosition
     * @return the positionCount
     */
    public int getPositionCount(String targetPosition) {
        return positionCount;
    }

    /**
     * @param positionCount the positionCount to set
     */
    public void setPositionCount(int positionCount) {
        this.positionCount = positionCount;
    }

    public void onTeam() {

    }

    // if (player.name.equals(result)) {
    // System.out.println("worked");
    // }
    // else{System.out.println("failed");}

    // }
    // return result;

    public Player mostGoals() {
        int highestNum = -1;
        Player mostPlayerGoals = null;
        for (Player player : team) {
            if (player.getGoals() > highestNum)
                highestNum = player.getGoals();
            mostPlayerGoals = player;
        }
        return mostPlayerGoals;
    }

    // empty constructor Team
    public Team() {
    }

    // constructor that holds parameter of an array
    public Team(Player[] players) {

        // the class team arguement passes in players array
        this.team = players;
    }

    /**
     * @return the positionCount
     */

    public int positionCount(String targetPosition) {
        int count = 0;
        // for currrent Player object in team
        for (Player player : team) {
            // if players' position is not nothing and players' position is equal to
            // targetPosition, add to the count
            if (player.getPosition() != null && player.getPosition().equalsIgnoreCase(targetPosition)) {
                count = count + 1;

            }
        }

        return count;

    }

    /**
     * @param sOGAverage the sOGAverage to set
     */
    public void setSOGAverage() {
        // init and declaration or totalGoals
        int totalGoals = 0;
        // for current Player object in team
        for (Player player : team) {
            // totalGoals equals player's goals sum
            totalGoals += player.getGoals();
            // the average of which is calculated by dividing the total goals by the number
            // of players on the team
            this.SOGAverage = (double) totalGoals / team.length;
        }
    }

    /**
     * @return the sOGAverage
     */
    public double getSOGAverage() {
        return SOGAverage;
    }

    /**
     * @return the team
     */
    public Player[] getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(Player[] team) {
        this.team = team;
    }

    @Override
    // Override of equals method returns new assignment
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    public static void main(String[] args) {
        // arrays that hold values
        String[] firstName = { "Sarah", "Victoria", "Beth", "Megan" };
        String[] lastName = { "Smith", "Jackson", "Tanner", "Williams" };
        String[] positionOptions = { "defense", "midfield", "forward", "goalie" };

        // creation on new Player instance, player1, has parameter
        Player player1 = new Player(null, null, 0, 0, 0,
                0);
        // player1's setName is equal to index of these arrays
        player1.setName(firstName[0] + lastName[0]);
        // player1's setPosition is equal to array to index
        player1.setPosition(positionOptions[0]);
        // gives player1's setMinutes_played an int
        player1.setMinutes_played(60);
        // gives player1's setGoals an int
        player1.setGoals(4);
        // gives player1's setAssists an int
        player1.setAssists(8);
        // gives player1's setSog_percentage an double
        player1.setSog_percentage(5.0);

        // repeat of prior steps just on a diffrent instance
        Player player2 = new Player(null, null, 0, 0, 0,
                0);
        player2.setName(firstName[1] + lastName[1]);
        player2.setPosition(positionOptions[1]);
        player2.setMinutes_played(100);
        player2.setGoals(10);
        player2.setAssists(1);
        player2.setSog_percentage(30.0);

        Player player3 = new Player(null, null, 0, 0, 0,
                0);
        player3.setName(firstName[2] + lastName[2]);
        player3.setPosition(positionOptions[2]);
        player3.setMinutes_played(120);
        player3.setGoals(2);
        player3.setAssists(0);
        player3.setSog_percentage(1.0);

        Player player4 = new Player(null, null, 0, 0, 0,
                0);
        player4.setName(firstName[3] + lastName[3]);
        player4.setPosition(positionOptions[3]);
        player4.setMinutes_played(80);
        player4.setGoals(20);
        player4.setAssists(13);
        player4.setSog_percentage(60.0);
        Player[] players = { player1, player2, player3, player4 };
        System.out.println(Arrays.toString(players));
        // team is an array of Player
        Team team = new Team(players);
        team.setSOGAverage();
        System.out.println("The average SOG is: " + team.getSOGAverage());
        String targetPosition = "forward";
        // count the target
        int positionCount = team.positionCount(targetPosition);
        System.out.println("There are " + positionCount + " in position " + targetPosition + ".");
        Player result = team.mostGoals();
        System.out.println(result);

    }

}
