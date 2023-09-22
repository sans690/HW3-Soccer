// Name: Saniyah Smith
// Computing ID: xjk8nm@hogwarts.edu
// Assignment Name: HW3

import java.util.Arrays;
import java.util.Comparator;

// class Team
public class Team {
    // init of variables
    // for team array it has Player objects
    Player[] team;
    double SOGAverage;
    int positionCount;
    String name;

    // empty constructor
    public Team() {
    }

    // Team with argument of Player objects
    public Team(Player[] players) {
        // for the class, the value that should be assigned is a copy of the objects in
        // Player to the length of it and not any farther
        this.team = Arrays.copyOf(players, players.length);
    }

    // Accessor
    // sets name
    public void setName(String Name) {
        this.name = name;
    }

    // Accessor
    // sets the team with copy of values in Player
    public void setTeam(Player[] players) {
        this.team = Arrays.copyOf(players, players.length);
    }

    // Mutator
    // return true or false depending on the player status
    public Player[] getTeam() {
        return team;
    }

    // method that gets the status of whether or not a player is on a team
    // for Player objects in team, if the object's getname equals (ignore case) the
    // taken players argument that is found by getName, then return true, else
    // return false
    public boolean onTeam(String randomPersonToCheckStatus) {
        for (Player p : team) {

            if (p.getName().equalsIgnoreCase(randomPersonToCheckStatus)) {
                return true;
            }
        }

        return false;
    }

    // method sort with Player type, objects of Player in sortedPlayers equals a
    // copy
    // of the team, to the length of team, no farther
    public Player[] sort() {
        Player[] sortedPlayers = Arrays.copyOf(team, team.length);
        // sortedPlayers compares int and goes in descending order
        Arrays.sort(sortedPlayers, Comparator.comparingInt(Player::getMinutes_played).reversed());
        // printing
        System.out.println(sortedPlayers.length);
        // a return of the sort
        return sortedPlayers;

    }

    // Accessor
    // sets the SOG average, no return
    public void setSOGAverage() {
        this.SOGAverage = SOGAverage;
    }

    // Mutator
    // returns the SOG average
    public double getSOGAverage() {
        return SOGAverage;
    }

    // A method (SOGAverage) returning the overall shots on goal average of the
    // team. This is calculated by
    // finding the average of all the shots on goal percentages of all team members.
    public double SOGAverage() { // declaration and init
        if (team.length == 0) {
            return 0.0;
        }

        double totalSog_Percentage = 0.0;

        // for objects of Player in team
        for (

        Player p : team) {
            totalSog_Percentage += p.getSog_percentage();
        }
        // retunr the totalSOG divided by the team (instance of Player class).length
        return totalSog_Percentage / team.length;
    }

    // Accessor
    // sets the position count
    public void setPositionCount(int positionCount) {
        this.positionCount = positionCount;
    }

    // Mutator
    // returns the position count
    public int getPositionCount() {
        return positionCount;
    }

    // method that takes a string argument and returns an int
    public int positionCount(String targetPosition) {
        // declaration and init of count
        int count = 0;
        // for objects of Player in team, if player's position is not null and player's
        // position is equal (ignores case) to the target position, then increase count
        // by 1 and hold that value
        // if no players in that position it will return 0
        for (Player p : team) {
            if (p.getPosition() != null && p.getPosition().equalsIgnoreCase(targetPosition)) {
                count = count + 1;
            }
        }
        return count;
    }

    // method that calculates who has the most goals, returns result
    public Player mostGoals() {
        // init and declaration of largest num
        int highestNum = -1;
        // mostPlayerGoals gets type Player and declares it to be null
        Player mostPlayerGoals = null;
        // for Player objects in team
        for (Player p : team) {
            // if the player's getGoals is higher than the declared value in highest num,
            // set the mostPlayerGoals as the current player,
            if (p.getGoals() > highestNum)
                highestNum = p.getGoals();
            mostPlayerGoals = p;
        }

        return mostPlayerGoals;

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
        Player[] playerArray = { player1, player2, player3, player4 };

        // creating a new instance of Team with argument players
        Team team = new Team(playerArray);
        // prints array list
        System.out.println(Arrays.toString(playerArray));

        // all this is either printing, setting of values
        double result = team.SOGAverage();
        System.out.println("The average SOG is: " + result);
        String targetPosition = "forward";
        team.getTeam();
        int positionCount = team.positionCount(targetPosition);
        System.out.println("There are " + positionCount + " in position " + targetPosition + ".");
        Player goals = team.mostGoals();
        System.out.println(goals);
        // Person that is not on team
        Player randomPersonToCheckStatus = new Player("Ben Macky", "goalie", 0, 0, 0, 0);
        // if the person on the team, after onTeam method has checked with the instance,
        // print on team statement
        if (team.onTeam(randomPersonToCheckStatus.getName())) {
            System.out.println("They are on the team!");
            // if false, print this statement
        } else if (!team.onTeam(randomPersonToCheckStatus.getName())) {
            System.out.println("They are not on the team!");

        }

    }
}

// ChatGPT, OpenAI, Sep 18 2023, chat.openai.com. Helped with sort method
// operation, error with SOGAverage