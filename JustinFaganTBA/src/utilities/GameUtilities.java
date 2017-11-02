package utilities;

import java.util.Scanner;
import utilities.GameUtilities;
import question.Question;

public class GameUtilities {
	static int numOfCorrect=0;
	static int numOfIncorrect=0;
	static int playerBalance=0;
	
	public static String getGreeting()
	{
		return "Welcome to Java Jeapordy! You probably know how Jeapordy works so there's no point in explaining"
				+ "\n You have 3 categories: Arrays, Strings, and Java Fundamentals. To pick a question say it like "
				+ "\n'Arrays for 200'."
				+ "\nNow what will your first question be?";
	}
	public String askQuestion()
	{
		return "What will your next question be?";
	}
	public void getResponse(String statement, Question[][]gameBoard)
	{
		
		if(statement.equals("Arrays for 200"))
		{
			arraysfor200(gameBoard,statement);
		}
		if(statement.equals("Strings for 200"))
		{
			stringsfor200(gameBoard,statement);
		}
		if(statement.equals("Logic for 200"))
		{
			logicfor200(gameBoard,statement);
		}
		
		System.out.println(askQuestion());
	}


/*	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.indexOf(goal, startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1);
			}

			// If before and after aren't letters, we've
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal, psn + 1);

		}

		return -1;
	}
	
	*//**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 *//*
	public int findKeyword(String statement, String goal)
	{
		return findKeyword (statement, goal, 0);
	}*/
	private static void stringsfor200(Question[][] gameBoard, String statement)
	{
		
		Question query = gameBoard[0][1];
		String answer= query.getSolution();
		System.out.println(query.getQuestion());
		Scanner playerResponse = new Scanner(System.in);
		String response = playerResponse.nextLine();
		if(statement.equals(answer))
		{
			numOfCorrect++;
			playerBalance += query.getPointValue();
			System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
			
		}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points") ;
		}
	}
	private static void arraysfor200(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		
		Question query = gameBoard[0][0];
		String answer= query.getSolution();
		System.out.println(query.getQuestion());
		Scanner playerResponse = new Scanner(System.in);
		String response = playerResponse.nextLine();
		if(statement.equals(answer))
		{
			numOfCorrect++;
			playerBalance += query.getPointValue();
			System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
		}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
			}	
	}
	private static void logicfor200(Question[][] gameBoard, String statement) {
		// TODO Auto-generated method stub
		
		Question query = gameBoard[0][2];
		String answer= query.getSolution();
		System.out.println(query.getQuestion());
		Scanner playerResponse = new Scanner(System.in);
		String response = playerResponse.nextLine();
		if(statement.equals(answer))
		{
			numOfCorrect++;
			playerBalance += query.getPointValue();
			System.out.print("Congratulations you are correct! \n You now have:" + playerBalance + " points");
			
		}
		else
		{
			numOfIncorrect++;
			playerBalance -= query.getPointValue();
			System.out.print("Oh I'm sorry. The answer we were looking for was " + answer + "." + "\n You now have:" + playerBalance + " points");
		}	
	}
	
}
