//Build a quiz Application Using Java Collection Framework.add exception handling and Junit Testing.
//@ :- RIYA MUKHERJEE

//class for answers
public class Answer {
    private String answerText;
    private boolean isCorrect;

    public Answer(String answerText, boolean isCorrect) {
        this.answerText = answerText;
        this.isCorrect = isCorrect;
    }
    //get method
    public String getAnswerText() {
        return this.answerText;
    }
    //check answer correct or not
    public boolean isCorrect() {
        return this.isCorrect;
    }
}
