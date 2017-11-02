package jeapordy;
import java.util.Scanner;

import board.Board;
//import question.ArrayQuestions;
import question.Question;
import utilities.GameUtilities;

public class JeapordyRunner {

	/*public static int playerBalance=0;
	public static int numOfCorrect=0;
	public static int numOfIncorrect=0;*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameUtilities game= new GameUtilities();
		System.out.println (game.getGreeting());
		Question[][] gameBoard= new Question[3][3];		
		 gameBoard=Board.generateBoard();
		
		boolean gameIsRunning=true;
		
		while(gameIsRunning) {
			
			Scanner in = new Scanner (System.in);
			String statement = in.nextLine();
			game.getResponse(statement, gameBoard);
			
			
		}
	}


	
}
