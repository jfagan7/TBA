package question;

public class StringQuestions implements Question {

	private int pointValue;
	private String question;
	private String solution;

	public StringQuestions(int pointValue, String question, String solution) {
		// TODO Auto-generated constructor stub
		this.pointValue=pointValue;
		this.question=question;
		this.solution=solution;
	}

	@Override
	public int getPointValue() {
		// TODO Auto-generated method stub
		return pointValue;
	}

	@Override
	public String getSolution() {
		// TODO Auto-generated method stub
		return solution;
	}

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}

}
