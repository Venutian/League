package model;

public class Club {
    private String name;
    private int wins;
    private int loses;

    public Club(String name) {
        this.name = name;
    }

    private int draws;

    public Club(String name, int wins, int loses, int draws, int points, int goalDiff) {
        this.name = name;
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
        this.points = points;
        this.goalDiff = goalDiff;
    }

    private int points;
    private int goalDiff;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoalDiff() {
        return goalDiff;
    }

    public void setGoalDiff(int goalDiff) {
        this.goalDiff = goalDiff;
    }

}
