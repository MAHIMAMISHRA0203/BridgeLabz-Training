package collectors.StudentResultGrouping;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("Java Basics", "Education", 350),
                new Book("Spring Boot", "Education", 500),
                new Book("Harry Potter", "Fiction", 450),
                new Book("Lord of Rings", "Fiction", 600),
                new Book("Atomic Habits", "Self Help", 320));

        // Group by genre and summarize pages
        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getGenre,
                        Collectors.summarizingInt(Book::getPages)));

        // Print statistics
        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Maximum Pages: " + stats.getMax());
            System.out.println("---------------------------");
        });
    }
}