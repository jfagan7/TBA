package question;

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
	
	public void invalidChoice(Question question)
	{
		if(Question.isAnswered())
		{
			question.pointValue=0;
		}
	}


	public String getQuestion() {
		// TODO Auto-generated method stub
	    return question;
	}
	
	public static boolean isAnswered()
	{
		return true;
	}



	
}
