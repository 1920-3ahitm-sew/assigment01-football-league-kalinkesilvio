package at.htl.football;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {


    private List<Team> teams = new ArrayList<>();

    public void addMatchResult(Match match) {

        Team team1 = findOrCreateTeam(match.getHomeTeam());
        Team team2 = findOrCreateTeam(match.getGuestTeam());

        team1.addMatch(match);
        team2.addMatch(match);

    }

    private Team findOrCreateTeam(String team) {

        for (Team newTeam : teams) {

            if (newTeam.getName().equals(team)) {
                return newTeam;
            }
        }

        Team otherTeam = new Team(team);

        teams.add(otherTeam);
        return otherTeam;


    }

    public List<Team> getTable() {
        Collections.sort(teams);

        return teams;
    }


}
