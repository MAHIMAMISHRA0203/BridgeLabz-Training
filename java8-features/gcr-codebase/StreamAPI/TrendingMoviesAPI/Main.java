package StreamAPI.TrendingMoviesAPI;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<TrendingMovie> movies = Arrays.asList(
            new TrendingMovie("Movie A", 8.5, 2022),
            new TrendingMovie("Movie B", 9.0, 2023),
            new TrendingMovie("Movie C", 8.8, 2021),
            new TrendingMovie("Movie D", 9.2, 2023),
            new TrendingMovie("Movie E", 8.9, 2022),
            new TrendingMovie("Movie F", 9.1, 2020),
            new TrendingMovie("Movie G", 8.7, 2023)
        );

        movies.stream()
              .filter(m -> m.rating >= 8.5)   // optional filtering condition
              .sorted((m1, m2) -> {
                  if (m2.rating != m1.rating) {
                      return Double.compare(m2.rating, m1.rating);
                  }
                  return Integer.compare(m2.releaseYear, m1.releaseYear);
              })
              .limit(5)
              .forEach(m ->
                  System.out.println(m.name + " " + m.rating + " " + m.releaseYear)
              );
    }
}
