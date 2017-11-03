package jeopardy;
import java.util.Scanner;

import board.Board;
//import question.ArrayQuestions;
import question.Question;
import utilities.GameUtilities;

public class JeopardyRunner {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameUtilities game= new GameUtilities();
		System.out.println (GameUtilities.getGreeting());
		Question[][] gameBoard= new Question[3][3];		
		 gameBoard=Board.generateBoard();
		 Board.printBoard(gameBoard);
		
		int tally=0;
		while(tally != 9) {
			
			Scanner in = new Scanner (System.in);
			String statement = in.nextLine();
			game.getResponse(statement, gameBoard);
			tally= game.Tally();
			//System.out.println(tally);
		}
		System.out.println(game.gameOver());
	}


	
}
