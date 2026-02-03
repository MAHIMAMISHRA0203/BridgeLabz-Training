package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class SortByCol {
    public static void main(String[] args) {
        try {

            File originalFile = new File("data.txt");
            File tempFile = new File("temp.txt");

            BufferedReader br = new BufferedReader(new FileReader(originalFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains("Java")) {
                    line = line.replace("Java", "Python");
                }
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            originalFile.delete();
            tempFile.renameTo(originalFile);

            System.out.println("Value updated successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
