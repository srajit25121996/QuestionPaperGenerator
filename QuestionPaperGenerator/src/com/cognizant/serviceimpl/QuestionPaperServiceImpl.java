package com.cognizant.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;

import com.cognizant.dao.QuestionDao;
import com.cognizant.daoImpl.QuestionDaoImpl;
import com.cognizant.model.Question;
import com.cognizant.service.QuestionPaperService;

public class QuestionPaperServiceImpl implements QuestionPaperService{
/*
	public LinkedHashMap<Question,String[]> getQuestionPaper(String skill,String level) {
		Random rand = new Random();
		QuestionDao qDao=new QuestionDaoImpl();
		//ArrayList<Question>QuestionForTest= new ArrayList<Question>();
		ArrayList<Question> aList=qDao.getQuestions(skill, level);
		LinkedHashMap<Question,String[]>hMap= new LinkedHashMap<Question, String []>();
		
		for(int i=0;i<10;i++){
			       int index=   rand.nextInt(10);
			       Question qFromDb=aList.get(index);
			       ArrayList<String> givenList = new ArrayList<String>();
		      		 givenList.add(qFromDb.getChoice1());   
		      		 givenList.add(qFromDb.getChoice2());
		      		 givenList.add(qFromDb.getChoice3());
		      		 givenList.add(qFromDb.getChoice4());
		      		 String value[]=new String [4];
		      		 int numberOfElements = 4;
		      		 Random rand1 = new Random();
		      		 for (int j = 0; j < numberOfElements; j++) 
		      		 {
		      		 int randomIndex1 = rand1.nextInt(givenList.size());
		      		 String randomElement1 = givenList.get(randomIndex1);
		      		 value[j]=randomElement1;
                     givenList.remove(randomIndex1);
		              }     
			       
		      		
		      		 qFromDb.setChoice1(value[0]);
		      		qFromDb.setChoice2(value[1]);
		      		qFromDb.setChoice3(value[2]);
		      		qFromDb.setChoice4(value[3]);
			       hMap.put(qFromDb, value);
			       
			       // QuestionForTest.add(aList.get(index));
			       
			       aList.remove(index);
		}
		
		
		return hMap;
	}
	*/
	public ArrayList<Question>getQuestionPaper1(String skill,String level) {
		Random rand = new Random();
		QuestionDao qDao=new QuestionDaoImpl();
		//ArrayList<Question>QuestionForTest= new ArrayList<Question>();
		ArrayList<Question> aList=qDao.getQuestions(skill, level);//from db
		System.out.println(aList);
		ArrayList<Question>questionaForTest = new ArrayList<Question>();
		for(int i=0;i<10;i++){
			       int index=   rand.nextInt(aList.size());
			       Question qFromDb=aList.get(index);
			       ArrayList<String> givenList = new ArrayList<String>();
		      		 givenList.add(qFromDb.getChoice1());   
		      		 givenList.add(qFromDb.getChoice2());
		      		 givenList.add(qFromDb.getChoice3());
		      		 givenList.add(qFromDb.getChoice4());
		      		 String value[]=new String [4];
		      		 int numberOfElements = 4;
		      		 Random rand1 = new Random();
		      		 for (int j = 0; j < numberOfElements; j++) 
		      		 {
		      		 int randomIndex1 = rand1.nextInt(givenList.size());
		      		 String randomElement1 = givenList.get(randomIndex1);
		      		 value[j]=randomElement1;
                     givenList.remove(randomIndex1);
		              }     
			       
		      		
		      		 qFromDb.setChoice1(value[0]);
		      		qFromDb.setChoice2(value[1]);
		      		qFromDb.setChoice3(value[2]);
		      		qFromDb.setChoice4(value[3]);
			       
			       // QuestionForTest.add(aList.get(index));
		      		questionaForTest.add(qFromDb);
			       aList.remove(index);
		}
		
		System.out.println(questionaForTest);
		return questionaForTest;
	}
	
public static void main(String s[]){
	QuestionPaperServiceImpl qImpl=new QuestionPaperServiceImpl();
        ArrayList<Question>qTest=     qImpl.getQuestionPaper1("java", "1");
        
        for(Question Q:qTest){
        	
        	
        	System.out.println(Q);
        }
	/*HashMap<Question,String[]>aList=qImpl.getQuestionPaper("java", "1");
	   Set<Question> keys=aList.keySet();   
	    for(Question Q:keys){
	    	System.out.println(Q.getQuestion_id()+" "+Q.getQuestion());
	    	                String ch[]=aList.get(Q);
	    	                for(String str:ch){
	    	                System.out.println(str);
	    	                }
	    	                
	    }
*/	
}

}
