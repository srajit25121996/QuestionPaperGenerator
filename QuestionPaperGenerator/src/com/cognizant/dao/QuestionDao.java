package com.cognizant.dao;

import java.util.ArrayList;
import java.util.Map;

import com.cognizant.model.Question;

public interface QuestionDao {
   void insertQuestion(Question question);
   ArrayList<Question>getQuestions(String skillSet ,String competencyLevel);
   int getScore(Map<String,String>answerMap);
   //int getScore1(Map<String,String>answerMap);
 }

