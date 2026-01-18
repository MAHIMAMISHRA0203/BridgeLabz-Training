package dsa_practice.StringsANdSearch;

public class SearchWord {

    static String searchSentence(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;   // word found
            }
        }

        return "Not Found";   // word not found in any sentence
    }

    public static void main(String[] args) {

        String[] s = {
            "Java is easy to learn",
            "Linear search works step by step",
            "Practice makes you perfect",
            "Data structures are important"
        };

        String word = "search";

        System.out.println(searchSentence(s, word));
    }
}

