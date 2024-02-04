import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TDFFileReader {
    private final String fileName;

    public TDFFileReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Rider> readFile() throws IOException {
        List<Rider> riders = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(";");
            if (parts.length >= 3) {
                String name = parts[1];
                String team = parts[2];
                riders.add(new Rider(name, team));
            }
        }
        br.close();
        return riders;
    }
}
