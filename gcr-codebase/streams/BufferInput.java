package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInput {

    public static void main(String[] args) {

        String source = "From.txt";
        String destination = "To.txt";

        long startTime = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

        } catch (IOException e) {
            System.out.println("Error during file copy");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Normal Stream Time: " + (endTime - startTime) + " ms");
    }
}
