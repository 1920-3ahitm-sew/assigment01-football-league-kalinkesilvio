package at.htl.football;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        League league = new League();


        try(Scanner scanner = new Scanner(new FileReader("bundesliga-1819.csv"))) {

            System.out.println();
            String zeile;
            String[] data;
            String homeTeam;
            String guestTeam;
            int homeGoals;
            int guestGoals;


            while (scanner.hasNextLine()) {
                zeile = scanner.nextLine();
                data = zeile.split(";");
                homeTeam = data[1];
                guestTeam = data[2];
                homeGoals = Integer.parseInt(data[3]);
                guestGoals = Integer.parseInt(data[4]);

                Match match = new Match(homeTeam, guestTeam, homeGoals, guestGoals);
                League.addMatchResult(match);
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }

    public void printTable(List<Team> Liga) {


    }
}
