package org.launchcode;

public class Answer {
    private final String data;
    private final boolean correct;


    public Answer(String data, boolean correct) {
        this.data = data;
        this.correct = correct;
    }

    public Answer(String data) {
       this(data,false);
    }

    public String getData() {
        return data;
    }

    public boolean isCorrect() {
        return correct;
    }


}
