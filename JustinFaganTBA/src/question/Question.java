package question;
/**
 * An abstract class that defines a Question and the different properties that it has.
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



	public int getPointValue() {
		// TODO Auto-generated method stub
		return pointValue;
	}

	public String getSolution() {
		// TODO Auto-generated method stub
		return solution;
	}
	

	public String getQuestion() {
		// TODO Auto-generated method stub
	    return question;
	}
	
	public void isAnswered()
	{
		pointValue=0;
	}



	
}
