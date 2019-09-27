package at.htl.football;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {


    public static void main(String[] args) {

        League league = new League();

        String[] data;

        Path file = Paths.get("bundesliga-1819.csv");

        try {

            List<String> zeilen = Files.readAllLines(file, UTF_8);

            for (int i = 1; i < zeilen.size(); i++) {

                data = zeilen.get(i).split(";");
                league.addMatchResult(new Match(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4])));
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        league.getTable();
        printTable(league.getTable());

    }

    private static void printTable(List<Team> team) {

        System.out.printf("Team                  Pts   W   D    L    GF   GA   GD");

        for (int i = 0; i < team.size(); i++) {

            System.out.printf("\n%19s %4d %4d %4d %4d %4d %4d %4d", team.get(i).getName(), team.get(i).getPoints(),
                    team.get(i).getWins(), team.get(i).getDraws(), team.get(i).getDefeats(),
                    team.get(i).getGoalsShot(), team.get(i).getGoalsReceived(), team.get(i).getGoalDifference());

        }

    }
}
