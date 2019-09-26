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
        if (getHomeGoals() > getGuestGoals()) {
            return 3;
        } else if (getHomeGoals() == getGuestGoals()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getGuestPoints() {
        if (getGuestGoals() > getHomeGoals()) {
            return 3;
        } else if (getGuestGoals() == getHomeGoals()) {
            return 1;
        } else {
            return 0;
        }
    }
}
