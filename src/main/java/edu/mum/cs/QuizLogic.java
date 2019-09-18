package edu.mum.cs;

import java.util.HashMap;

public class QuizLogic {
    QuizLogic(){

    }
    private static String [] questions = {
           "3, 1, 4, 1, 5, __",
           "1, 1, 2, 3, 5, __",
           "1, 4, 9, 16, 25, __",
           "2, 3, 5, 7, 11, __",
           "1, 2, 4, 8, 16, __"
    };
    private static int [] answers = {9, 8, 36, 13, 32};

    public HashMap<Integer,String> getMap(){
        HashMap<Integer,String> map = new HashMap<>();
        for(int i = 0; i < answers.length; i++){
            map.put(answers[i],questions[i]);
        }
        return map;
    }

    public HashMap<Integer,String> shuffleMap(){
        HashMap<Integer,String> map = new HashMap<>();

        List<Integer> 
        for(int i = 0; i < answers.length; i++){
            map.put(answers[i],questions[i]);
        }
        return map;
    }










}
