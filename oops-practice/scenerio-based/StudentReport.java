import java.util.*;

// Custom exception
class InvalidMarkException extends Exception {
    InvalidMarkException(String message) {
        super(message);
    }
}

// Student class
class StudentReportGenerator {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentReportGenerator {

    // Calculate average marks
    static double calculateAverage(int[] marks)
            throws InvalidMarkException {

        int total = 0;
        for (int m : marks) {
            if (m < 0 || m > 100) {
                throw new InvalidMarkException(
                    "Marks must be between 0 and 100");
            }
            total += m;
        }
        return total / (double) marks.length;
    }

    // Assign grade
    static String assignGrade(double average) {
        if (average >= 80) return "A";
        if (average >= 60) return "B";
        return "C";
    }

    public static void main(String[] args) {
        try {
            List<Student> students = new ArrayList<>();

            students.add(new Student(
                "Anita", new int[]{85, 78, 90}));

            for (Student s : students) {
                double avg = calculateAverage(s.marks);

                System.out.println("Name: " + s.name);
                System.out.println("Average: " + avg);
                System.out.println("Grade: " + assignGrade(avg));
                System.out.println("-------------------");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
