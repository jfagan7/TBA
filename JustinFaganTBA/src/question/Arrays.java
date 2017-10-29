package question;

import java.util.Random;

public class Arrays implements Question {

	private int pointValue;
	private boolean isAnswered;
	private boolean isCorrect;
	private String[] questionSet;

	public Arrays(int pointValue, boolean isAnswered, boolean isCorrect, String questionSet, String solution) {
		// TODO Auto-generated constructor stub\
		this.pointValue=pointValue;
		this.isAnswered=false;
		this.isCorrect=false;
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
		int rnd = new Random().nextInt(questionSet.length);
	    return questionSet[rnd];
	}

}
