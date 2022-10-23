import controller.ClubController;
import model.Club;
import model.Table;

public class Main {
    public static void main(String[] args) {
        ClubController.nameFetch();
        for (Club club : Table.getClubs() ) {
            System.out.println(club.getName());
        }
    }
}