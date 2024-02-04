import java.util.*;

public class Statistics {

    private List<Rider> riders;

    public Statistics(List<Rider> riders) {
        this.riders = riders;
    }

    public Set<String> getTeams() {
        Set<String> teams = new HashSet<>();
        for (Rider rider : riders) {
            teams.add(rider.getTeam());
        }
        return teams;
    }

    public Map<String, List<String>> getTeamsWithMembers() {
        Map<String, List<String>> teamsWithMembers = new HashMap<>();
        for (Rider rider : riders) {
            String team = rider.getTeam();
            if (!teamsWithMembers.containsKey(team)) {
                teamsWithMembers.put(team, new ArrayList<>());
            }
            teamsWithMembers.get(team).add(rider.getName());
        }
        return teamsWithMembers;
    }

    public List<String> getTeamMembers(String team) {
        List<String> teamMembers = new ArrayList<>();
        for (Rider rider : riders) {
            if (rider.getTeam().equals(team)) {
                teamMembers.add(rider.getName());
            }
        }

        return teamMembers;
    }
}

