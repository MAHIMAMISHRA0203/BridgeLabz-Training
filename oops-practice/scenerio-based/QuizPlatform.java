import java.util.*;

// Custom exception
class InvalidQuizSubmissionException extends Exception {
    InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

public class QuizPlatform {

    // Method to calculate score
    static int calculateScore(String[] correctAnswers, String[] userAnswers)
            throws InvalidQuizSubmissionException {

        if (correctAnswers.length != userAnswers.length) {
            throw new InvalidQuizSubmissionException(
                "Answer count does not match");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    // Method to return grade
    static String getGrade(int score) {
        if (score >= 4) return "A";
        if (score >= 2) return "B";
        return "C";
    }

    public static void main(String[] args) {
        try {
            String[] correct = {"A", "B", "C", "D", "A"};
            String[] user = {"A", "B", "D", "D", "A"};

            List<Integer> scoreList = new ArrayList<>();

            int score = calculateScore(correct, user);
            scoreList.add(score);

            System.out.println("Score: " + score);
            System.out.println("Grade: " + getGrade(score));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
