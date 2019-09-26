package at.htl.football;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        League league = new League();


        try(Scanner scanner = new Scanner(new FileReader("bundesliga-1819.csv"))) {

            String zeile;
            String[] data;
            String homeTeam;
            String guestTeam;
            int homeGoals;
            int guestGoals;

            scanner.nextLine();

            while (scanner.hasNextLine()) {
                zeile = scanner.nextLine();
                data = zeile.split(";");
                homeTeam = data[1];
                guestTeam = data[2];
                homeGoals = Integer.parseInt(data[3]);
                guestGoals = Integer.parseInt(data[4]);

                Match match = new Match(homeTeam, guestTeam, homeGoals, guestGoals);
                league.addMatchResult(match);

            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        league.getTable();
        printTable(league.getTable());

    }

    private static void printTable(List<Team> team) {

        System.out.printf("Team                   Pts    W    D    L    GF   GA   GD");

        for (int i = 0; i < team.size(); i++) {

            System.out.printf("%19s %4d %4d %4d %4d %4d %4d %4d", team.get(i).getName(), team.get(i).getPoints(),
                    team.get(i).getWins(), team.get(i).getDraws(), team.get(i).getDefeats(),
                    team.get(i).getGoalsShot(), team.get(i).getGoalsReceived(), team.get(i).getGoalDifference());

        }

    }
}
