import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> log = new ArrayList<>();

    public void addLog(String operation) {
        log.add(operation);
    }

    public void showLogs() {
        System.out.println("Journaling Log:");
        for (String entry : log) {
            System.out.println(entry);
        }
    }
}
