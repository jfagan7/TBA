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
	private static int count=0; //Keeps track of how many questions answered
	/**
	 * Only called once in the initial game to let the player know how the game works.
	 * @return the initial greeting to the player
	 */
	public static String getGreeting()
	{
		return "Welcome to Java Jeapordy! You probably know how Jeapordy works so there's no point in explaining"
				+ "\n You have 3 categories: Arrays, Strings, and Logic. To pick a question say it like "
				+ "\n'Arrays for 200'."
				+ "\n However, your answer does not have to be in the form of a question."
				+ "\n Now what will your first question be?";
	}
	/**
	 * Keeps track of the number of questions answered to be inputed into the tally variable to eventually end the while loop 
	 * @return the number of questions answered
	 */
	public int Tally()
	{
		count=numOfIncorrect+numOfCorrect;
		return count;
	}
	/**
	 * Keeps the game moving along by asking what their next choice will be.
	 * @return the question to continue the game 
	 */
	public String askQuestion()
	{
		return "What will your next question be?";
	}
	/**
	 * Compares the user response to the answer to the question to determine if they're right or wrong
	 * @param input
	 * 			the string the user sets
	 * @param answer
	 * 			the answer to the question
	 * @return a boolean if the user input equals the answer
	 */
	public static boolean compare(String input, String answer)
	{
		if(input.trim().toLowerCase().equals(answer.trim().toLowerCase()))
		{
			return true;
		}
		return false;
	}
	/**
	 * This method is ran once the while loop is broken 
	 * @return a recognition of completion
	 */
	public String gameOver()
	{
		if(playerBalance<=10200)
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
	/**
	 * Analyzes the user's 
	 * @param statement
	 * 			the question the player selected
	 * @param gameBoard
	 * 			the game board the player uses and is referenced to pass in the Question object the player chose
	 * @return void
	 */
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
        	case "Objects for 200":
        		initializeQuestion(gameBoard[0][3]);
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
        	case "Objects for 400":
        		initializeQuestion(gameBoard[1][3]);
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
        	case "Objects for 800":
        		initializeQuestion(gameBoard[2][3]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Arrays for 1600":
        		initializeQuestion(gameBoard[3][0]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Strings for 1600":
        		initializeQuestion(gameBoard[3][1]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Logic for 1600":
        		initializeQuestion(gameBoard[3][2]);
        		Board.printBoard(gameBoard);
        		break;
        	case "Objects for 1600":
        		initializeQuestion(gameBoard[3][3]);
        		Board.printBoard(gameBoard);
        		break;
        	default: 
        	System.out.print("You have to pick a question!"
        			+ "\n Also make sure you're:"
        			+ "\n Leaving one space between each word "
        			+ "\n The category is capitalized like 'Objects' "
        			+ "\n And 'for' is lowercase");
        	break;
    }
		if(count!=15) 
		{
			System.out.println(askQuestion());
		}
	}
	/**
	 * Compares the user response to the answer to the question to determine if they're right or wrong and deducts or adds points
	 * accordingly as well as increment the number of correct or incorrect for the count.
	 * @param question
	 * 			the question object that the player chose
	 * @return void
	 */
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
