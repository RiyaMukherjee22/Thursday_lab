//Build a quiz Application Using Java Collection Framework.add exception handling and Junit Testing.
//@ :- RIYA MUKHERJEE


import java.util.ArrayList;
import java.util.List;
//qustion class
public class Question {
    private String questionText; //variable for qustions
    private List<Answer> answers;

    public Question(String questionText) {
        this.questionText = questionText;
        this.answers = new ArrayList<>();
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
    }
    //method for answers
    public List<Answer> getAnswers() {
        return this.answers;
    }
    //method for questions
    public String getQuestionText() {
        return this.questionText;
    }
    //method for checking correct answer
    public String getCorrectAnswerText() {
        for (Answer answer : this.answers) {
            if (answer.isCorrect()) {
                return answer.getAnswerText();
            }
        }
        return "";
    }
}
