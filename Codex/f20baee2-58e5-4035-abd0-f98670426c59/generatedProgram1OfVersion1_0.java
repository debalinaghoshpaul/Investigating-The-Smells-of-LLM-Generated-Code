import java.io.*;
import java.util.*;

public class HighScoreTracker {
    private static final int MAX_SCORES = 5;
    private List<String> names;
    private List<Integer> scores;

    public HighScoreTracker() {
        names = new ArrayList<>();
        scores = new ArrayList<>();
        loadScoresFromFile();
    }

    public void playerScore(String name, int score) {
        int index = getInsertionIndex(score);
        if (index >= MAX_SCORES) {
            return;
        }
        names.add(index, name);
        scores.add(index, score);
        if (names.size() > MAX_SCORES) {
            names.remove(MAX_SCORES);
            scores.remove(MAX_SCORES);
        }
        saveScoresToFile();
    }

    public String[] getTopNames() {
        return names.toArray(new String[0]);
    }

    public int[] getTopScores() {
        return scores.stream().mapToInt(Integer::intValue).toArray();
    }

    private int getInsertionIndex(int score) {
        for (int i = 0; i < scores.size(); i++) {
            if (score > scores.get(i)) {
                return i;
            }
        }
        return scores.size();
    }

    private void loadScoresFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/debal/OneDrive/Desktop/PhD folder/text_files/scores.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                names.add(parts[0]);
                scores.add(Integer.parseInt(parts[1]));
            }
        } catch (IOException e) {
            // File does not exist, do nothing
        }
    }

    private void saveScoresToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/debal/OneDrive/Desktop/PhD folder/text_files/scores.txt"))) {
            for (int i = 0; i < names.size(); i++) {
                writer.write(names.get(i) + "," + scores.get(i));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}