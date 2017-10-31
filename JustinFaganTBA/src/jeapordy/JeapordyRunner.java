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
	private static boolean gameIsRunning;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question[][] gameBoard= new Question[3][3];
		gameBoard=Board.generateBoard();
		System.out.println (GameUtilities.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		
		
		while(gameIsRunning) {
			System.out.println (GameUtilities.getResponse());
			statement = in.nextLine();
			
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			
		}
		if(statement.equals("Arrays for 200"))
		{
			arraysfor200(gameBoard,statement);
			System.out.println(GameUtilities.getResponse());
		}
		if(statement.equals("Strings for 200"))
		{
			stringsfor200(gameBoard,statement);
			System.out.println(GameUtilities.getResponse());
		}
		if(statement.equals("Logic for 200"))
		{
			logicfor200(gameBoard,statement);
			System.out.println(GameUtilities.getResponse());
		}
	}
	
	
	
	
	
	
	
	
	private static void stringsfor200(Question[][] gameBoard, String statement)
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
	private static void arraysfor200(Question[][] gameBoard, String statement) {
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
	private static void logicfor200(Question[][] gameBoard, String statement) {
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
