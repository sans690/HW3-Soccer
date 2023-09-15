import java.util.Arrays;

public class Team {
    // the osbjects in array player are given to the array team
    Player[] team = {};
    // init of team name
    String teamName;
    static double SOGAverage;
    int positionCount;
    boolean onTeam;

    // empty constructor
    public Team() {
    }

    // constructor that holds parameter of an array of an array
    public Team(Player[] players) {
        // the class team arguement passes in team array
        this.team = players;
    }

    /**
     * @return the sOGAverage
     */
    public double getSOGAverage() {
        return SOGAverage;
    }

    /**
     * @param sOGAverage the sOGAverage to set
     */
    public void setSOGAverage(double sOGAverage) {
        this.SOGAverage = team[0].getGoals() * team[1].getGoals()* team[2].getGoals() * team[3].getGoals() / 4;
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
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    public static void main(String[] args) {
        String[] firstName = { "Sarah", "Victoria", "Beth", "Megan" };
        String[] lastName = { "Smith", "Jackson", "Tanner", "Williams" };
        String[] positionOptions = { "defense", "midfield", "foward", "goalie", };

        Player player1 = new Player(null, null, 0, 0, 0,
                0);
        player1.setName(firstName[0] + lastName[0]);
        player1.setPosition(positionOptions[0]);
        player1.setMinutes_played(60);
        player1.setGoals(4);
        player1.setAssists(8);
        player1.setSog_percentage(5.0);

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
        System.out.println(SOGAverage);
    }

}