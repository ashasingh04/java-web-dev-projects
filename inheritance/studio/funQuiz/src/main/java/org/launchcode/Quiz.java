package org.launchcode;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {
    private  ArrayList<Question> questions = new ArrayList<>();
    private int numOfCorrectAnswers = 0;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumOfCorrectAnswers() {
        return numOfCorrectAnswers;
    }
    public void addQuestions(Question[] questionArr){
        Collections.addAll(questions,questionArr);
    }
    public void runQuiz(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the fun quiz..");
        Collections.shuffle(getQuestions());

        for (Question question : questions){
            System.out.println(question);

            ArrayList<Integer> userResponses = new ArrayList<>();
            int userResponse;
            int numCorrectAns = question.getNumOfCorrectChoice();
            do {
                System.out.println("Please enter a number: ");
                userResponse = input.nextInt();


            //System.out.println(userResponse);
            if(userResponses.contains(userResponse)){
                System.out.println("You have already been choose this option.");
            }else if(!question.getAnswers().get(userResponse-1).isCorrect()){
                System.out.println("Sorry, Correct Answer was: ");
                for(Answer ans : question.getAnswers())
                {
                    if(ans.isCorrect()){
                        System.out.println(ans.getData());
                    }
                }
                break;
            }else {
                System.out.println("Correct Answer!");
                if(numCorrectAns == 1) {
                    numOfCorrectAnswers++;
                }

                numCorrectAns--;
                userResponses.add(userResponse);
            }

            }while (numCorrectAns > 0);
        }

        input.close();
    }
}
