package com.cognizant.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.cognizant.model.Question;

public interface QuestionPaperService {

	ArrayList<Question>getQuestionPaper1(String skill,String level);
}
