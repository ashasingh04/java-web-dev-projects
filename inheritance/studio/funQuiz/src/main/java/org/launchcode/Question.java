package org.launchcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import static java.util.Collection.*;

public abstract  class Question {
    private final String question;
    private  final ArrayList<Answer> answers = new ArrayList<>();
    private int numOfCorrectChoice = 1;

    public Question(String question, Answer[] answerArray) {
        this.question = question;
        Collections.addAll(answers,answerArray);
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public int getNumOfCorrectChoice() {
        return numOfCorrectChoice;
    }

    public void setNumOfCorrectChoice(int numOfCorrectChoice) {
        this.numOfCorrectChoice = numOfCorrectChoice;
    }

    String getFormattedAnswers() {
        StringBuilder formattedChoices = new StringBuilder();
        int i=1;
        for (Answer answer : answers) {
            String ans = "\t" + i + " - " + answer.getData() + "\n";
            formattedChoices.append(ans);
            i++;
        }
        return formattedChoices.toString();
    }
}
