package at.htl.football;

public class Team implements Comparable<Team> {

    private String name;
    private int points;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsShot;
    private int goalsReceived;

    public Team(String name) {
        this.name = name;
    }

    public void addMatch(Match match) {

        if (this.name.equals(match.getHomeTeam())) {
            points += match.getHomePoints();

            if (match.getHomePoints() == 3) {
                wins++;
            } else if (match.getHomePoints() == 1) {
                draws++;
            } else {
                defeats++;
            }

            goalsShot += match.getHomeGoals();
            goalsReceived += match.getGuestGoals();

        } else {
            points += match.getGuestPoints();

            if (match.getGuestPoints() == 3) {
                wins++;
            } else if (match.getGuestPoints() == 1) {
                draws++;
            } else {
                defeats++;
            }

            goalsShot += match.getGuestGoals();
            goalsReceived += match.getHomeGoals();
        }

        /*goalsShot = match.getHomeGoals();
        goalsReceived = match.getGuestGoals();


        if (this.name.equals(match.getHomeTeam())) {
            if (goalsShot - goalsReceived < 0) {
                this.defeats++;
            } else if (goalsShot - goalsReceived > 0) {
                this.wins++;
                this.points += 3;
            } else {
                this.draws++;
                this.points += 1;
            }
        } else if (this.name.equals(match.getGuestTeam())) {
            if (goalsShot - goalsReceived < 0) {
                this.defeats++;
            } else if (goalsShot - goalsReceived > 0) {
                this.wins++;
                this.points += 3;
            } else {
                this.draws++;
                this.points += 1;
            }
        }*/

    }

    public String getName() {
      return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public int getGoalDifference() {
        return goalsShot - goalsReceived;
    }

    public int compareTo(Team team) {

        if (team.getPoints() > this.points) {
            return 1;
        } else if (this.points > team.getPoints()){
            return -1;
        } else {
            return team.getGoalDifference() - this.getGoalDifference();
        }

    }

}
