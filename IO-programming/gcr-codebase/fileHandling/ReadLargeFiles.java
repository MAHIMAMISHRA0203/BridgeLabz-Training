package fileHandling;

import java.io.*;

public class ReadLargeFiles {

    public static void main(String[] args) {

        String filePath = "large.csv";
        long count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");

                // Process row immediately
                String id = columns[0];
                String name = columns[1];

                count++;
            }

            System.out.println("Rows processed: " + count);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
