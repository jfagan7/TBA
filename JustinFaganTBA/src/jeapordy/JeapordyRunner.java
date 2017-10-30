package jeapordy;
import java.util.Scanner;

import board.Board;
//import question.ArrayQuestions;
import question.Question;
import utilities.GameUtilities;

public class JeapordyRunner {

	private static int playerBalance=0;
	private static int numOfCorrect=0;
	private static int numOfIncorrect=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question[][] gameBoard= new Question[3][3];
		gameBoard=Board.generateBoard();
		System.out.println (GameUtilities.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		if(statement.equals("Arrays for 200"))
		{
			arraysfor200(gameBoard);
		}
	}

	private static void arraysfor200(Question[][] gameBoard) {
		// TODO Auto-generated method stub
		Question query = gameBoard[0][0];
		String answer= query.getSolution();
		System.out.println(query.getQuestion());
		Scanner playerResponse = new Scanner(System.in);
		String response = playerResponse.nextLine();
		if(response.equals(answer))
		{
			numOfCorrect++;
			playerBalance += query.getPointValue();
			query = null;
			
			System.out.println("Congratulations you are correct! \n You now have:" + playerBalance + " points");
			
		}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			query = null;
			
			System.out.println("Oh I'm sorry. The answer we were looking for was" + answer + "." + "\n You now have:" + playerBalance + " points");
		}
	}
	/*		
	int playerBalance=0;
	int numOfCorrect=0;
	int numOfIncorrect=0;*/
	
	/*Question question = gameBoard[0][0];
	String answer= question.getSolution();
	System.out.println(question.getQuestion());
	Scanner playerResponse = new Scanner(System.in);
	String response = in.nextLine();
	if(response.equals(answer))
	{
		numOfCorrect++;
		playerBalance += question.getPointValue();
		question = null;
		
		System.out.println("Congratulations you are correct! \n You now have:" + playerBalance + "points");
		
	}
	else
	{
		numOfIncorrect++;
		playerBalance -= question.getPointValue();
		question = null;
		
		System.out.println("Oh I'm sorry. The answer we were looking for was" + answer + "." + "\n You now have:" + playerBalance + "points");
	}*/
	
}
