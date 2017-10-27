package question;

public class Arrays implements Question {

	private int pointValue;
	private boolean isAnswered;
	private boolean isCorrect;

	public Arrays(int pointValue, boolean isAnswered, boolean isCorrect, String[]questionSet) {
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

}
