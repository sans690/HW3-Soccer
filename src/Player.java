import java.util.Arrays;

/**
 * Player
 */
public class Player {
    String name;
    String position;
    int minutes_played;
    int goals;
    int assists;
    double sog_percentage;

    /**
     * @param name
     * @param position
     * @param minutes_played
     * @param goals
     * @param assists
     * @param sog_percentage
     */

    public Player() {

    }

    public Player(String name, String position, int minutes_played, int goals, int assists, double sog_percentage) {
        this.name = name;
        this.position = position;
        this.minutes_played = minutes_played;
        this.goals = goals;
        this.assists = assists;
        this.sog_percentage = sog_percentage;
    }

    /**
     * @param minutes_played the minutes_played to set
     */
    public void setMinutes_played(int minutes_played) {
        this.minutes_played = minutes_played;
    }

    /**
     * @return the minutes_played
     */
    public int getMinutes_played() {
        return minutes_played;
    }

    /**
     * @param goals the goals to set
     */
    public void setGoals(int goals) {
        this.goals = goals;
    }

    /**
     * @return the goals
     */
    public int getGoals() {
        return goals;
    }

    /**
     * @param assists the assists to set
     */
    public void setAssists(int assists) {
        this.assists = assists;
    }

    /**
     * @return the assists
     */
    public int getAssists() {
        return assists;
    }

    /**
     * @param sog_percentage the sog_percentage to set
     */
    public void setSog_percentage(double sog_percentage) {
        this.sog_percentage = sog_percentage;
    }

    /**
     * @return the sog_percentage
     */
    public double getSog_percentage() {
        return sog_percentage;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", position=" + position + ", minutes_played=" + minutes_played + ", goals="
                + goals + ", assists=" + assists + ", sog_percentage=" + sog_percentage + "]";
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

        Player[] team = { player1, player2, player3, player4 };
        System.out.println(Arrays.toString(team));
    }
}