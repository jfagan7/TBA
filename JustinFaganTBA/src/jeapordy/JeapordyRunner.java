package jeapordy;
import java.util.Scanner;

import board.Board;
import question.ArrayQuestions;
import question.Question;
import utilities.GameUtilities;

public class JeapordyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question[][] gameBoard= new Question[3][3];
		gameBoard=Board.generateBoard();
		System.out.println (GameUtilities.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		int playerBalance=0;
		int numOfCorrect=0;
		int numOfIncorrect=0;
		
		if(statement.equals("Arrays for 200"))
		{
			
			Question question = gameBoard[0][0];
			String answer= question.getSolution();
			System.out.println(question.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = in.nextLine();
			if(response.equals(answer))
			{
				numOfCorrect++;
				playerBalance += question.getPointValue();
				question = null;
				
				System.out.println("Congratulations you are correct! You now have:" + playerBalance + "points");
				
			}
			else
			{
				numOfIncorrect++;
				playerBalance -= question.getPointValue();
				question = null;
				
				System.out.println("Oh I'm sorry. The answer we were looking for was" + answer + "." + "/nYou now have:" + playerBalance + "points");
			}
			
		}
	}
	
	
}
