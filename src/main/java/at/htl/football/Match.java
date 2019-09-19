package at.htl.football;

public class Match {

    private String homeTeam;
    private String guestTeam;
    private int homeGoals;
    private int guestGoals;

    public Match(String homeTeam, String guestTeam, int homeGoals, int guestGoals) {
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
        this.homeGoals = homeGoals;
        this.guestGoals = guestGoals;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public int getHomePoints() {
        return 0;
    }

    public int getGuestPoints() {
        return 0;
    }
}
