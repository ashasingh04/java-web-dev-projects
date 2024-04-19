package org.launchcode;

public class Checkbox extends Question{
    public Checkbox(String question, Answer[] answerArray) {
        super(question, answerArray);
        setNumOfCorrectChoice(getNumOfCorrectAnswers());
    }

    @Override
    public String toString() {
        String result = getQuestion() + "\nCHOOSE ONE OR MORE OPTION:\n" +
                getFormattedAnswers();
        return result;
    }
    public int getNumOfCorrectAnswers(){
        int numCorrectAns = 0;
        for(int i =0; i < getAnswers().size();i++){
            if(getAnswers().get(i).isCorrect()){
                numCorrectAns ++;
            }
        }
        return numCorrectAns;
    }
}
