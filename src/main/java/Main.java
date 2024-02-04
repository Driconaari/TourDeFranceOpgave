import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args)  throws IOException {
        String fileName = "tdffinishers2023.csv";
        TDFFileReader reader = new TDFFileReader(fileName);
        List<Rider> riders = reader.readFile();

        Statistics stats = new Statistics(riders);


        Set<String> teams = stats.getTeams();
        Map<String, List<String>> teamsWithMembers = stats.getTeamsWithMembers();
        List<String> teamMembers = stats.getTeamMembers("UaeTEamEmirates");

        System.out.println("Teams: " + teams);
        System.out.println("Teams with members:  " + teamsWithMembers);
        System.out.println("Team members of UaeTeamEmirates: " + teamMembers);

    }
}
