package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateColums {

    public static void main(String[] args) {

        Set<String> uniqueEmails = new HashSet<>();
        boolean duplicateFound = false;

        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String email = data[2]; // email column index

                if (!uniqueEmails.add(email)) {
                    System.out.println("Duplicate email found: " + email);
                    duplicateFound = true;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (!duplicateFound) {
            System.out.println("No duplicates found");
        }
    }
}
