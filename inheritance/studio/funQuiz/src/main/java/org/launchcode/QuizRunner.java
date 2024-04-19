package org.launchcode;

import java.awt.*;

public class QuizRunner {
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        String q1 = "Which of the following Scanner methods should you use to return an expected String input?";
        Answer[] q1Choices = new Answer[] {
                new Answer(".nextLine()", true),
                new Answer(".hasNext()"),
                new Answer(".nextFloat()"),
                new Answer(".next()", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "An import statement is required to use a Java class defined in another package.";
        Answer[] q2Choices = new Answer[] {
                new Answer("True", true),
                new Answer("False")
        };
        TrueFalse question2 = new TrueFalse(q2, q2Choices);

        String q3 = "Which of the following is NOT a number data type in Java?";
        Answer[] q3Choices = new Answer[] {
                new Answer("int"),
                new Answer("number", true),
                new Answer("float"),
                new Answer("double")
        };
        MultiChoice question3 = new MultiChoice(q3, q3Choices);

        quiz.addQuestions(new Question[] { question1, question2, question3 });

        quiz.runQuiz();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumOfCorrectAnswers() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);

    }
}
