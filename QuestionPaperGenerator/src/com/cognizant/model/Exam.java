package com.cognizant.model;

public class Exam {

	private String examid;
	private String examdescription;
	private String skillset;
	private String competencylevel;
	private int userid;
	public Exam(String examid, String examdescription, String skillset, String competencylevel, int userid) {
		super();
		this.examid = examid;
		this.examdescription = examdescription;
		this.skillset = skillset;
		this.competencylevel = competencylevel;
		this.userid = userid;
	}
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getExamid() {
		return examid;
	}
	public void setExamid(String examid) {
		this.examid = examid;
	}
	public String getExamdescription() {
		return examdescription;
	}
	public void setExamdescription(String examdescription) {
		this.examdescription = examdescription;
	}
	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	public String getCompetencylevel() {
		return competencylevel;
	}
	public void setCompetencylevel(String competencylevel) {
		this.competencylevel = competencylevel;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
}
