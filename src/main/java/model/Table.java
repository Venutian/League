package model;

import java.util.ArrayList;

public class Table {
    static ArrayList<Club> clubs = new ArrayList<>();

    public Table() {
    }

    public static ArrayList<Club> getClubs() {
        return clubs;
    }

    public void setClubs(ArrayList<Club> clubs) {
        this.clubs = clubs;
    }



}
