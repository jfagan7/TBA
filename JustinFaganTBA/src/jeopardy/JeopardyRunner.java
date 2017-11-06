package jeopardy;
/**
 * The runner class that executes every function and runs the game in the main method
 * @author Justin Fagan
 * @date November 2017
 */
import java.util.Scanner;

import board.Board;
import question.Question;
import utilities.GameUtilities;

public class JeopardyRunner {


	/**
	 * Initializes the game board and greets the player,give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameUtilities game= new GameUtilities();
		System.out.println (GameUtilities.getGreeting());
		Question[][] gameBoard= new Question[3][3];		
		 gameBoard=Board.generateBoard();
		 Board.printBoard(gameBoard);
		
		int tally=0;
		while(tally != 16) {
			
			Scanner in = new Scanner (System.in);
			String statement = in.nextLine();
			game.getResponse(statement, gameBoard);
			tally= game.Tally();
		}
		System.out.println(game.gameOver());
	}


	
}
