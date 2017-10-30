package question;

public interface Question {

	boolean isAnswered = false;

	public abstract int getPointValue();

	public abstract String getSolution();
	
	public abstract String getQuestion();
}
