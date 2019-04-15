package com.cognizant.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cognizant.dao.QuestionDao;
import com.cognizant.model.Question;
import com.cognizant.util.JdbcConnection;

public class QuestionDaoImpl implements QuestionDao {

	public void insertQuestion(Question question) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Question> getQuestions(String skillSet, String competencyLevel) {
		ArrayList<Question> qList = new ArrayList<Question>();
		Connection con = null;
		con = JdbcConnection.getConnection();
		String query = "select * from question where skillSet=? and competencyLevel=?";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, skillSet);
			pst.setString(2, competencyLevel);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String m_question_id = rs.getString(1);
				String m_question_creator = rs.getString(2);
				String m_question = rs.getString(3);
				String m_choice1 = rs.getString(4);
				String m_choice2 = rs.getString(5);
				String m_choice3 = rs.getString(6);
				String m_choice4 = rs.getString(7);
				String m_selection = rs.getString(8);
				;
				String m_skillSet = rs.getString(9);
				String m_competencyLevel = rs.getString(10);

				int m_mark = rs.getInt(11);
				String m_answer = rs.getString(12);
				Question question = new Question(m_question_id, m_question_creator, m_question, m_choice1, m_choice2,
						m_choice3, m_choice4, m_skillSet, m_selection, m_competencyLevel, m_mark, m_answer);

				qList.add(question);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

		return qList;
	}

	public int getScore(Map<String, String> answerMap) {
		System.out.println("in daoImpl " + answerMap);
		int totalmarks = 0;
		Connection con = null;
		con = JdbcConnection.getConnection();
		String query = "Select answer  from question where questionid=?";
		try {

			PreparedStatement pst = con.prepareStatement(query);
			Set<String> m_qid = answerMap.keySet();
			for (String Q : m_qid) { // for
				pst.setString(1, Q);
				ResultSet rs = pst.executeQuery();
				rs.next();
				String answer = rs.getString(1);// ans from db
				String ans = answerMap.get(Q);// ans from user
				System.out.println(" answer db "+answer);
				System.out.println(" ans user "+ans);
				
				if (ans !=null && ans.contains(",") && ans.length()==answer.length()) {
					 String tokens[]=ans.split(",");
					 boolean flag=false;
					 for(int i=0;i<tokens.length;i++){
						 flag=false;	    
						  if(answer.contains(tokens[i])){
						    	flag=true;
						    }
						   
					   }//for
					  if(flag){
						  totalmarks+=1;
					  }
					} 
				//radio button logic
				
				else if (ans!=null && answer.equals(ans) ) {
					totalmarks += 1;
				}
				System.out.println(totalmarks);
			} // for
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return totalmarks;
	}// mtd

	/*public int getScore(Map<String, String> answerMap) {
		System.out.println("in daoImpl " + answerMap);
		int totalmarks = 0;
		Connection con = null;
		con = JdbcConnection.getConnection();
		String query = "Select answer  from question where questionid=?";
		try {

			PreparedStatement pst = con.prepareStatement(query);
			Set<String> m_qid = answerMap.keySet();
			for (String Q : m_qid) { // for
				pst.setString(1, Q);
				ResultSet rs = pst.executeQuery();
				rs.next();
				String answer = rs.getString(1);// ans from db
				String ans = answerMap.get(Q);// ans from user
				if (answer.contains(",")) {
					int counter = 0;
					String struser[] = ans.split(",");
					String strdata[] = answer.split(",");
					for (int i = 0; i < struser.length; i++) {
						for (int j = i; j < strdata.length; j++) {
							 if (strdata.length == struser.length) { 
							if (struser[i].equals(strdata[j])) {
								counter++;
							}
						}
						// }
					}

					// for ends

					if (counter == strdata.length) {
						totalmarks += 1;
					}

				} else if (answer.equals(ans)) {
					totalmarks += 1;
				}
				System.out.println(totalmarks);
			} // for
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return totalmarks;
	}// mtd
*/
}
