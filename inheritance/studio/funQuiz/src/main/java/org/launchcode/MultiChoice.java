package org.launchcode;

public class MultiChoice extends Question {
    public MultiChoice(String question, Answer[] answerArray) {
        super(question, answerArray);
    }

    @Override
    public String toString() {
        String result = getQuestion() + "\nCHOOSE ONE OPTION:\n" +
                getFormattedAnswers();
        return result;
    }
}
