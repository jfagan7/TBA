package question;

import java.util.Random;

public class ArrayQuestions implements Question {

	private int pointValue;
	private boolean isAnswered;
	private String[] questionSet;
	private String question;
	private String solution;

	public ArrayQuestions(int pointValue, boolean isAnswered, String question, String solution) {
		// TODO Auto-generated constructor stub\
		this.pointValue=pointValue;
		this.isAnswered=isAnswered;
		this.question=question;
		this.solution=solution;
	}



	@Override
	public int pointValue() {
		// TODO Auto-generated method stub
		return pointValue;
	}

	@Override
	public boolean result() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
	    return question;
	}

}
