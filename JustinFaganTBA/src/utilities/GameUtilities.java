package utilities;
/**
 * This class contains all the rules and procedures for conducting this game.
 * @author Justin Fagan
 * @date November 2017
 */
import java.util.Scanner;

import board.Board;
import utilities.GameUtilities;
import question.Question;

public class GameUtilities {
	private static int numOfCorrect=0;
	private static int numOfIncorrect=0;
	private static int playerBalance=0;
	private static int count=0;
	
	public static String getGreeting()
	{
		return "Welcome to Java Jeapordy! You probably know how Jeapordy works so there's no point in explaining"
				+ "\n You have 3 categories: Arrays, Strings, and Logic. To pick a question say it like "
				+ "\n'Arrays for 200'."
				+ "\n However, your answer does not have to be in the form of a question."
				+ "\n Now what will your first question be?";
	}
	public int Tally()
	{
		count=numOfIncorrect+numOfCorrect;
		return count;
	}
	public String askQuestion()
	{
		return "What will your next question be?";
	}
	public static boolean compare(String input, String answer)
	{
		if(input.trim().toLowerCase().equals(answer.trim().toLowerCase()))
		{
			return true;
		}
		return false;
	}
	public String gameOver()
	{
		if(playerBalance<=3570)
		{
			System.out.println("# of Correct:" + numOfCorrect +
					"\n # of Incorrect:" + numOfIncorrect +
					"\n Your Total Score:" + playerBalance);
			return "Instead of playing games you should be hitting those books and studying Java";
		}
		System.out.println("# of Correct:" + numOfCorrect +
				"\n # of Incorrect:" + numOfIncorrect +
				"\n Your Total Score:" + playerBalance);
		return "Congratulations on completing the game! \n I hope this helped you become a master coder and more prepared for the AP!";
	}
	public void getResponse (String statement, Question[][]gameBoard)
	{
		switch (statement)
		{
        	case "Arrays for 200":
        		initializeQuestion(gameBoard[0][0]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Strings for 200":
        		initializeQuestion(gameBoard[0][1]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Logic for 200":
        		initializeQuestion(gameBoard[0][2]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Arrays for 400":
        		initializeQuestion(gameBoard[1][0]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Strings for 400":
        		initializeQuestion(gameBoard[1][1]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Logic for 400":
        		initializeQuestion(gameBoard[1][2]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Arrays for 800":
        		initializeQuestion(gameBoard[2][0]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Strings for 800":
        		initializeQuestion(gameBoard[2][1]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Logic for 800":
        		initializeQuestion(gameBoard[2][2]);
        		Board.printBoard(gameBoard);
        		break;
        	default: 
        	System.out.print("You have to pick a question!"
        			+ "\n Also make sure you're:"
        			+ "\n Leaving one space between each word "
        			+ "\n The category is capitalized like 'Array' "
        			+ "\n And 'for' is lowercase");
        	break;
    }
		if(count!=8) 
		{
			System.out.println(askQuestion());
		}
	}
	public static void initializeQuestion(Question question)
	{
		if(question.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
			System.out.println();
		}
		else 
		{
			String answer= question.getSolution();
			System.out.println(question.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += question.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				question.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= question.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			question.isAnswered();
			}
		}

	}

}
