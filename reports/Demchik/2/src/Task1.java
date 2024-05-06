import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> text = getLines();
        for (String line : text) {
            sb.append(shuffle(line)).append(" ").append("\n");
        }
        System.out.println(sb.toString());
    }

    public static ArrayList<String> getLines() throws IOException {
        String path = "C:\\Users\\nadze\\OneDrive\\Рабочий стол\\spp\\spp_po8\\reports\\Demchik\\2\\src\\text.txt";
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> lines = new ArrayList<String>();
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();
        return lines;
    }

    public static String shuffle(String string) {
        List<String> words = Arrays.asList(string.split("[\\s!:,.?!''(+)-]+")); // Added "\\s" to split by whitespace
        String[] shuff = new String[words.size()];
        words.toArray(shuff);
        Random rnd = new Random();
        for (int j = 0; j < 20; j++) {
            for (int i = shuff.length - 1; i > 0; i--) {
                int index = rnd.nextInt(i + 1);
                String temp = shuff[index];
                shuff[index] = shuff[i];
                shuff[i] = temp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String word : shuff)
            sb.append(word).append(" "); // Added space to separate words
        return sb.toString();
    }
}
