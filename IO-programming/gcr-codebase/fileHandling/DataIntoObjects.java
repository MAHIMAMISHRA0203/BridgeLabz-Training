package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +

                '}';
    }
}

public class DataIntoObjects {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                Student s = new Student(id, name);
                students.add(s);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

}
