package org.launchcode;

public class TrueFalse extends Question{
    public TrueFalse(String question, Answer[] answerArray) {
        super(question, answerArray);
    }

    @Override
    public String toString() {
        String result = getQuestion() + "\nCHOOSE TRUE OR FALSE:\n" +
                getFormattedAnswers();
        return result;
    }
}
