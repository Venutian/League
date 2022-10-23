package controller;

import model.Club;
import model.Table;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClubController {
    private static final File file = new File("src/main/res/cities.txt");
    private static Club club;
    private static Table table = new Table();
    private static ArrayList <Club> clubs;
    public static String nameFetch() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String name = scanner.nextLine() + " FC";
                club = new Club(name);
                clubs = table.getClubs();
                clubs.add(club);
                table.setClubs(clubs);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
