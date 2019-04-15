package com.cognizant.model;

public class Question {
	private String question_id;
	private String question_creator;
	private String question;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
	private String skillSet;
	private String selection;
	private String competencyLevel;
	private int mark;
	private String answer;
	
	
	
	
	public Question() {
		super();
	}




	



	public Question(String question_id, String question_creator, String question, String choice1, String choice2,
			String choice3, String choice4, String skillSet, String selection, String competencyLevel, int mark,
			String answer) {
		super();
		this.question_id = question_id;
		this.question_creator = question_creator;
		this.question = question;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.skillSet = skillSet;
		this.selection = selection;
		this.competencyLevel = competencyLevel;
		this.mark = mark;
		this.answer = answer;
	}
	








	public String getAnswer() {
		return answer;
	}








	public void setAnswer(String answer) {
		this.answer = answer;
	}








	public Question(String question_id, String question_creator, String question, String choice1,
			String choice2, String choice3, String choice4, String selection, int mark) {
		
		this.question_id = question_id;
		this.question_creator = question_creator;
		this.question = question;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.selection = selection;
		this.mark = mark;
		
		
	}




	public String getQuestion_id() {
		return question_id;
	}




	public void setQuestion_id(String question_id) {
		this.question_id = question_id;
	}




	public String getQuestion_creator() {
		return question_creator;
	}




	public void setQuestion_creator(String question_creator) {
		this.question_creator = question_creator;
	}




	public String getQuestion() {
		return question;
	}




	public void setQuestion(String question) {
		this.question = question;
	}




	public String getChoice1() {
		return choice1;
	}




	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}




	public String getChoice2() {
		return choice2;
	}




	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}




	public String getChoice3() {
		return choice3;
	}




	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}




	public String getChoice4() {
		return choice4;
	}




	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}




	public String getSkillSet() {
		return skillSet;
	}




	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}




	public String getSelection() {
		return selection;
	}




	public void setSelection(String selection) {
		this.selection = selection;
	}




	public String getCompetencyLevel() {
		return competencyLevel;
	}




	public void setCompetencyLevel(String competencyLevel) {
		this.competencyLevel = competencyLevel;
	}




	public int getMark() {
		return mark;
	}




	public void setMark(int mark) {
		this.mark = mark;
	}








	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", question=" + question + ", choice1=" + choice1 + ", choice2="
				+ choice2 + ", choice3=" + choice3 + ", choice4=" + choice4 + "]";
	}








	/*@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", question=" + question + ", answer="+answer+"]";
	}



*/





	
	

}
