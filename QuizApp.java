import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> quiz = new ArrayList<>();

        quiz.add(new Question(
            "1. Which language is used for Android app development?",
            new String[]{"1. Java", "2. Python", "3. C++", "4. Ruby"},
            1
        ));

        quiz.add(new Question(
            "2. Who invented Java?",
            new String[]{"1. James Gosling", "2. Dennis Ritchie", "3. Elon Musk", "4. Bill Gates"},
            1
        ));

        quiz.add(new Question(
            "3. Which keyword is used to inherit a class in Java?",
            new String[]{"1. this", "2. super", "3. extends", "4. import"},
            3
        ));

        int score = 0;

        System.out.println("===== Welcome to the Online Quiz App =====\n");

        for (Question q : quiz) {
            System.out.println(q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == q.correctOption) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer = " + q.correctOption + "\n");
            }
        }

        System.out.println("===== QUIZ COMPLETED =====");
        System.out.println("Your Score: " + score + "/" + quiz.size());
    }
}
