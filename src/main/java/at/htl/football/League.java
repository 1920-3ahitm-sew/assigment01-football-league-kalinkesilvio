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

        for (int i = 0; i < teams.size(); i++) {

            Team newTeam = new Team(team);

            if (newTeam.getName().equals(team)) {
                return newTeam;
            }
        }

        teams.add(new Team(team));
        return teams.get(teams.size() - 1);
    }

    public List<Team> getTable() {
        Collections.sort(teams);

        return teams;
    }


}
