package streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fw = new FileWriter("To.txt")) {

            System.out.print("Enter name: ");
            String name = br.readLine();

            System.out.print("Enter age: ");
            String age = br.readLine();

            System.out.print("Enter favorite programming language: ");
            String language = br.readLine();

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Language: " + language + "\n");

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error reading input or writing file.");
        }
    }
}
