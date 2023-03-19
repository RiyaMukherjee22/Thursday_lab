//Build a quiz Application Using Java Collection Framework.add exception handling and Junit Testing.
//@ :- RIYA MUKHERJEE


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
//quiz class
public class Quiz {
    private List<Question> questions;
    //method for make array of questions
    public Quiz() {
        this.questions = new ArrayList<>();
    }
    //method for add questions
    public void addQuestion(Question question) {
        this.questions.add(question);
    }
    //method for run the quiz app
    public void runQuiz() {
        int score = 0;
        Scanner scanner = new Scanner(System.in); //take user input
        for (Question question : this.questions) {
            System.out.println(question.getQuestionText()); //call the method
            int i = 1;
            for (Answer answer : question.getAnswers()) {
                System.out.println(i + ". " + answer.getAnswerText());
                i++;
            }
            int answerIndex = -1; //initial point
            do {
                try {
                    System.out.print("Enter your answer (1-" + question.getAnswers().size() + "): ");
                    answerIndex = scanner.nextInt() - 1;
                    if (answerIndex < 0 || answerIndex >= question.getAnswers().size()) {
                        System.out.println("Invalid answer index. Please try again.");
                    }
                } catch (InputMismatchException e) {
                    scanner.nextLine(); // Clear the input buffer
                    System.out.println("Invalid input. Please enter a number.");
                }
            } while (answerIndex < 0 || answerIndex >= question.getAnswers().size());

            if (question.getAnswers().get(answerIndex).isCorrect()) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getCorrectAnswerText()); //call the method
            }
        }

        System.out.println("Your final score is: " + score + "/" + this.questions.size()); //obtained the score
    }
}
