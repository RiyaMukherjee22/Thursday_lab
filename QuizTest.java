//Build a quiz Application Using Java Collection Framework.add exception handling and Junit Testing.
//@ :- RIYA MUKHERJEE


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
//class quiztest
public class QuizTest {
    private Quiz quiz;

    @Before
    public void setUp() {
        quiz = new Quiz();
        //instance of questions
        Question question1 = new Question("What is the capital of France?");
        question1.addAnswer(new Answer("Paris", true));
        question1.addAnswer(new Answer("Berlin", false));
        question1.addAnswer(new Answer("Madrid", false));
        quiz.addQuestion(question1);

        Question question2 = new Question("What is the largest planet in our solar system?");
        question2.addAnswer(new Answer("Jupiter", true));
        question2.addAnswer(new Answer("Saturn", false));
        question2.addAnswer(new Answer("Neptune", false));
        quiz.addQuestion(question2);

        Question question3 = new Question("What is the highest mountain in the world?");
        question3.addAnswer(new Answer("Mount Everest", true));
        question3.addAnswer(new Answer("Mount Kilimanjaro", false));
        question3.addAnswer(new Answer("Mount Fuji", false));
        quiz.addQuestion(question3);
    }

    @Test
    public void testQuizRun() {
        // Mock user input using a Scanner with a string input
        java.io.ByteArrayInputStream input = new java.io.ByteArrayInputStream("1\n1\n1\n".getBytes());
        System.setIn(input);

        quiz.runQuiz();

        // Expect 3 correct answers out of 3 questions
        assertEquals(3, quiz.getScore());
    }
}
