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
    public Player(String name, String position, int minutes_played, int goals, int assists, double sog_percentage) {
        this.name = name;
        this.position = position;
        this.minutes_played = minutes_played;
        this.goals = goals;
        this.assists = assists;
        this.sog_percentage = sog_percentage;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
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
        String[] firstName = { "Sarah", "Victoria", "Beth" };
        String[] lastName = { " Smith", " Jackson", " Tanner" };
        String[] positionOptions = { "defense", "midfield", "foward", "goalie" };

        Player player1 = new Player(null, null, 0, 0, 0, 0);
        player1.setName(firstName[0] + lastName[0]);
        player1.setPosition(positionOptions[0]);
        System.out.println(player1.toString());
    


    }
}
