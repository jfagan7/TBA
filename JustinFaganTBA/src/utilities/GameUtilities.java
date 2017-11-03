package utilities;

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
				+ "\nNow what will your first question be?";
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
		if(compare(statement,""))
		{
			System.out.print("You have to pick a question.");
		}
		if(compare(statement,"Arrays for 200"))
		{
			arraysfor200(gameBoard,statement);
			Board.printBoard(gameBoard);
		}
		if(compare(statement,"Strings for 200"))
		{
			stringsfor200(gameBoard,statement);
			Board.printBoard(gameBoard);
		}
		if(compare(statement,"Logic for 200"))
		{
			logicfor200(gameBoard,statement);
			Board.printBoard(gameBoard);
		}
		if(compare(statement,"Arrays for 400"))
		{
			arraysfor400(gameBoard,statement);
			Board.printBoard(gameBoard);
		}
		if(compare(statement,"Strings for 400"))
		{
			stringsfor400(gameBoard,statement);
			Board.printBoard(gameBoard);
		}
		if(compare(statement,"Logic for 400"))
		{
			logicfor400(gameBoard,statement);
			Board.printBoard(gameBoard);
		}
		if(compare(statement,"Arrays for 800"))
		{
			arraysfor800(gameBoard,statement);
			Board.printBoard(gameBoard);
		}
		if(compare(statement,"Strings for 800"))
		{
			stringsfor800(gameBoard,statement);
			Board.printBoard(gameBoard);
		}
		if(compare(statement,"Logic for 800"))
		{
			logicfor800(gameBoard,statement);
			Board.printBoard(gameBoard);
		}
		if(count!=9) 
		{
			System.out.println(askQuestion());
		}
	}

	
	private static void arraysfor200(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		
		Question query = gameBoard[0][0];
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
	private static void stringsfor200(Question[][] gameBoard, String statement)
	{
		
		Question query = gameBoard[0][1];
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
	private static void logicfor200(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		Question query = gameBoard[0][2];
		String answer= query.getSolution();
		System.out.println(query.getQuestion());
		Scanner playerResponse = new Scanner(System.in);
		String response = playerResponse.nextLine();
		if(compare(response,answer))
		{
			numOfCorrect++;
			playerBalance += query.getPointValue();
			System.out.println("Congratulations you are correct! \n You now have:" + playerBalance + " points");
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
	private static void arraysfor400(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		
		Question query = gameBoard[1][0];
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
	private static void stringsfor400(Question[][] gameBoard, String statement)
	{
		
		Question query = gameBoard[1][1];
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
	private static void logicfor400(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		Question query = gameBoard[1][2];
		String answer= query.getSolution();
		System.out.println(query.getQuestion());
		Scanner playerResponse = new Scanner(System.in);
		String response = playerResponse.nextLine();
		if(compare(response,answer))
		{
			numOfCorrect++;
			playerBalance += query.getPointValue();
			System.out.println("Congratulations you are correct! \n You now have:" + playerBalance + " points");
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
	private static void arraysfor800(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		
		Question query = gameBoard[2][0];
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
	private static void stringsfor800(Question[][] gameBoard, String statement)
	{
		
		Question query = gameBoard[2][1];
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
	private static void logicfor800(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		Question query = gameBoard[2][2];
		String answer= query.getSolution();
		System.out.println(query.getQuestion());
		Scanner playerResponse = new Scanner(System.in);
		String response = playerResponse.nextLine();
		if(compare(response,answer))
		{
			numOfCorrect++;
			playerBalance += query.getPointValue();
			System.out.println("Congratulations you are correct! \n You now have:" + playerBalance + " points");
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
