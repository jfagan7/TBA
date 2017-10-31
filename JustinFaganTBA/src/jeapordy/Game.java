package jeapordy;

import question.Question;
import board.Board;
import jeapordy.JeapordyRunner;
//import utilities.GameUtilities;

public class Game {
	/*public static int numOfCorrect=0;
	public static int playerBalance=0;
	public static int numOfIncorrect=0;*/
	//public static Question[][] gameBoard;
	
public static String getGreeting()
	{
		return "Welcome to Java Jeapordy! You probably know how Jeapordy works so there's no point in explaining"
				+ "\n You have 3 categories: Arrays, Strings, and Logic. To pick a question say it like "
				+ "\n'Arrays for 200'."
				+ "\nNow what will your first question be?";
	}
public static String getResponse(String statement)
{
	return "What would you like to pick?";
}
	
	if(statement.equals("Arrays for 200"))
	{
		arraysfor200(gameBoard,statement);
	}
	if(statement.equals("Strings for 200"))
	{
		stringsfor200(gameBoard,statement);
	}
	if(statement.equals("Logic for 200"))
	{
		logicfor200(gameBoard,statement);
	}



private void stringsfor200(Question[][] gameBoard, String statement)
{
	Question query = gameBoard[0][1];
	String answer= query.getSolution();
	System.out.println(query.getQuestion());
	/*Scanner playerResponse = new Scanner(System.in);
	String response = playerResponse.nextLine();*/
	if(statement.equals(answer))
	{
		numOfCorrect++;
		playerBalance += query.getPointValue();
		System.out.println("Congratulations you are correct! \n You now have:" + playerBalance + " points");
		query.isAnswered();
		
	}
	else
	{
		numOfIncorrect++;
		playerBalance -= query.getPointValue();
		System.out.println("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
		query.isAnswered();
	}
}
private void arraysfor200(Question[][] gameBoard , String statement) {
	// TODO Auto-generated method stub
	Question query = gameBoard[0][0];
	String answer= query.getSolution();
	System.out.println(query.getQuestion());
	/*Scanner playerResponse = new Scanner(System.in);
	String response = playerResponse.nextLine();*/
	if(statement.equals(answer))
	{
		numOfCorrect++;
		playerBalance += query.getPointValue();
		System.out.println("Congratulations you are correct! \n You now have:" + playerBalance + " points");
		query.isAnswered();
	}
	else
	{
		numOfIncorrect++;
		playerBalance -= query.getPointValue();
		System.out.println("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
		query.isAnswered();
		}	
}
private void logicfor200 (Question[][] gameBoard, String statement) {
	// TODO Auto-generated method stub
	Question query = gameBoard[0][2];
	String answer= query.getSolution();
	System.out.println(query.getQuestion());
	/*Scanner playerResponse = new Scanner(System.in);
	String response = playerResponse.nextLine();*/
	if(statement.equals(answer))
	{
		numOfCorrect++;
		playerBalance += query.getPointValue();
		System.out.println("Congratulations you are correct! \n You now have:" + playerBalance + " points");
		query.isAnswered();
		
	}
	else
	{
		numOfIncorrect++;
		playerBalance -= query.getPointValue();
		System.out.println("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
		query.isAnswered();
	}	
}

}
}