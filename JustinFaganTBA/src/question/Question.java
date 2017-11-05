package question;
/**
 * An abstract class that defines a Question and the different properties and methods it has.
 * @author Justin Fagan
 * @date November 2017
 */
public abstract class Question {

	public int pointValue;
	private String question;
	private String solution;

	public Question(int pointValue, String question, String solution) {
		// TODO Auto-generated constructor stub\
		this.pointValue=pointValue;
		this.question=question;
		this.solution=solution;
	}


	/**
	 * Gets the point value of the question.
	 * @return the point value of the question
	 */
	public int getPointValue() {
		// TODO Auto-generated method stub
		return pointValue;
	}
	/**
	 * Gets the answer to the question.
	 * @return the answer to the question
	 */
	public String getSolution() {
		// TODO Auto-generated method stub
		return solution;
	}
	
	/**
	 * Gets the question the player has to answer.
	 * @return the question the player chose
	 */
	public String getQuestion() {
		// TODO Auto-generated method stub
	    return question;
	}
	/**
	 * Changes the point value of the question to 0 to avoid double counting.
	 * @return void
	 */
	public void isAnswered()
	{
		pointValue=0;
	}



	
}
