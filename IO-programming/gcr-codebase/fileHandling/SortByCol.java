package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByCol {
    public static void main(String[] args) {
        try {
            File file = new File("data.csv");
            List<String[]> rows = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            // Read file
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                rows.add(columns);
            }
            br.close();

            // Sort by column 0 (ID)
            rows.sort(Comparator.comparingInt(a -> Integer.parseInt(a[0])));

            // Write back to file
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String[] row : rows) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
            bw.close();

            System.out.println("File sorted by ID");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
