package collectors.LibraryBook;

public class Main {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Amit", "A"),
                new Student("Neha", "B"),
                new Student("Ravi", "A"),
                new Student("Priya", "C"));

        Map<String, List<String>> result = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(
                                Student::getName,
                                Collectors.toList())));

        System.out.println(result);
    }
}