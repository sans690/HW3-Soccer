// Name: Saniyah Smith
// Computing ID: xjk8nm@hogwarts.edu
// Assignment Name: HW3

import java.util.Arrays;

public class Player {
    String name;
    String position;
    int minutes_played;
    int goals;
    int assists;
    double sog_percentage;

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

    // Accessor
    public void setMinutes_played(int minutes_played) {
        this.minutes_played = minutes_played;
    }

    // Mutator
    public int getMinutes_played() {
        return minutes_played;
    }

    // Accessor
    public void setGoals(int goals) {
        this.goals = goals;
    }

    // Mutator
    public int getGoals() {
        return goals;
    }

    // Accessor
    public void setAssists(int assists) {
        this.assists = assists;
    }

    // Mutator
    public int getAssists() {
        return assists;
    }

    // Accessor
    public void setSog_percentage(double sog_percentage) {
        this.sog_percentage = sog_percentage;
    }

    public double getSog_percentage() {
        return sog_percentage;
    }

    // Accessor
    public void setName(String name) {
        this.name = name;
    }

    // Mutator

    public String getName() {
        return name;
    }

    // Accessor
    // sets the position count
    public void setPosition(String position) {
        this.position = position.toLowerCase();
    }

    // Mutator
    // returns the position count
    public String getPosition() {
        return position.toLowerCase();
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", position=" + position + ", minutes_played=" + minutes_played + ", goals="
                + goals + ", assists=" + assists + ", sog_percentage=" + sog_percentage + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        // creation of the arrays
        String[] firstName = { "Sarah", "Victoria", "Beth", "Megan" };
        String[] lastName = { "Smith", "Jackson", "Tanner", "Williams" };
        String[] positionOptions = { "defense", "midfield", "forward", "goalie" };

        Player player1 = new Player(firstName[0] + lastName[0], positionOptions[0], 60, 4, 8, 0.20);
        Player player2 = new Player(firstName[1] + lastName[1], positionOptions[1], 100, 10, 1, 0.10);
        Player player3 = new Player(firstName[2] + lastName[2], positionOptions[2], 120, 2, 0, 0.10);
        Player player4 = new Player(firstName[3] + lastName[3], positionOptions[3], 80, 20, 13, 0.5);
        // Setting the different players into an array with the Player type
        Player[] players = { player1, player2, player3, player4 };
        System.out.println(Arrays.toString(players));
    }
}
// // ChatGPT, OpenAI, Sep 18 2023, chat.openai.com. Helped with ambiguity