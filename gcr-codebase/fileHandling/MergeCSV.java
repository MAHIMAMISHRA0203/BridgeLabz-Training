package fileHandling;

package fileHandling;

import java.io.*;

public class MergeCSV {

    public static void main(String[] args) {

        File file1 = new File("file1.csv");
        File file2 = new File("file2.csv");
        File merged = new File("merged.csv");

        try (
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                BufferedWriter bw = new BufferedWriter(new FileWriter(merged))) {
            String line;

            // Write header from first file
            bw.write(br1.readLine());
            bw.newLine();

            // Write data from file1
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // Skip header of file2
            br2.readLine();

            // Write data from file2
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("CSV files merged successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
