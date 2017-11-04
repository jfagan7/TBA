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
	public static int numOfCorrect=0;
	public static int numOfIncorrect=0;
	public static int playerBalance=0;
	public static int count=0;
	
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
	public void getResponse(String statement, Question[][]gameBoard)
	{
		
		switch (statement.toLowerCase().trim())
		{
        	case "arraysfor200":
        		initializeQuestion(gameBoard[0][0]);
        		Board.printBoard(gameBoard);
        	case "stringsfor200":
        		initializeQuestion(gameBoard[0][1]);
        		Board.printBoard(gameBoard);
        	case "logicfor200":
        		initializeQuestion(gameBoard[0][2]);
        		Board.printBoard(gameBoard);
        	case "arraysfor400":
        		initializeQuestion(gameBoard[1][0]);
        		Board.printBoard(gameBoard);
        	case "stringsfor400":
        		initializeQuestion(gameBoard[1][1]);
        		Board.printBoard(gameBoard);
        	case "logicfor400":
        		initializeQuestion(gameBoard[1][2]);
        		Board.printBoard(gameBoard);
        	case "arraysfor800":
        		initializeQuestion(gameBoard[2][0]);
        		Board.printBoard(gameBoard);
        	case "stringsfor800":
        		initializeQuestion(gameBoard[2][1]);
        		Board.printBoard(gameBoard);
        	case "logicfor800":
        		initializeQuestion(gameBoard[2][2]);
        		Board.printBoard(gameBoard);
        	default: 
        	System.out.print("You have to pick a question.");
    }
		if(count!=9) 
		{
			System.out.println(askQuestion());
		}
	}
/*
	
	private static void arraysfor200(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		
		Question query = gameBoard[0][0];
		if(query.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
		}
		else 
		{
			String answer= query.getSolution();
			System.out.println(query.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += query.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				query.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			query.isAnswered();
			}
		}
	}
	private static void stringsfor200(Question[][] gameBoard, String statement)
	{
		
		Question query = gameBoard[0][1];
		if(query.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
		}
		else 
		{
			String answer= query.getSolution();
			System.out.println(query.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += query.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				query.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			query.isAnswered();
			}
		}
	}
	private static void logicfor200(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		Question query = gameBoard[0][2];
		if(query.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
		}
		else 
		{
			String answer= query.getSolution();
			System.out.println(query.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += query.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				query.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			query.isAnswered();
			}
		}
	}
	private static void arraysfor400(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		Question query = gameBoard[1][0];
		if(query.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
		}
		else 
		{
			String answer= query.getSolution();
			System.out.println(query.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += query.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				query.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			query.isAnswered();
			}
		}
	}
	private static void stringsfor400(Question[][] gameBoard, String statement)
	{
		
		Question query = gameBoard[1][1];
		if(query.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
		}
		else 
		{
			String answer= query.getSolution();
			System.out.println(query.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += query.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				query.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			query.isAnswered();
			}
		}
	}
	private static void logicfor400(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		Question query = gameBoard[1][2];
		if(query.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
		}
		else 
		{
			String answer= query.getSolution();
			System.out.println(query.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += query.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				query.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			query.isAnswered();
			}
		}
	}
	private static void arraysfor800(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		Question query = gameBoard[2][0];
		if(query.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
		}
		else 
		{
			String answer= query.getSolution();
			System.out.println(query.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += query.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				query.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			query.isAnswered();
			}
		}
	}
	private static void stringsfor800(Question[][] gameBoard, String statement)
	{
		
		Question query = gameBoard[2][1];
		if(query.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
		}
		else 
		{
			String answer= query.getSolution();
			System.out.println(query.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += query.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				query.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			query.isAnswered();
			}
		}
	}
	private static void logicfor800(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		Question query = gameBoard[2][2];
		if(query.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
		}
		else 
		{
			String answer= query.getSolution();
			System.out.println(query.getQuestion());
			Scanner playerResponse = new Scanner(System.in);
			String response = playerResponse.nextLine();
			if(compare(response,answer))
			{
				numOfCorrect++;
				playerBalance += query.getPointValue();
				System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
				System.out.println();
				query.isAnswered();
			}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			System.out.println();
			query.isAnswered();
			}
		}
	}*/
	public static void initializeQuestion(Question question)
	{
		if(question.pointValue==0)
		{
			System.out.print("You already answered this!");
			count+=0;
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
