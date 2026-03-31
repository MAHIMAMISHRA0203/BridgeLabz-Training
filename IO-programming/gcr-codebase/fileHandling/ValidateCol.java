package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCol {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        try {

            File originalFile = new File("data.txt");

            BufferedReader br = new BufferedReader(new FileReader(originalFile));

            String line;

            while ((line = br.readLine()) != null) {
                String data[] = line.split(",");
                String email = data[3];
                Matcher matcher = pattern.matcher(email);
                if (!matcher.matches()) {
                    System.out.println("Email not matches");
                    br.close();
                    return;

                }

            }

            System.out.println("All email are validates");
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
