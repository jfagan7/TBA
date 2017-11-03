package board;

import question.Question;
import question.StringQuestions;
import question.ArrayQuestions;
import question.LogicQuestions;

public class Board {
	

	private static Question[][] jeapordyBoard;
	//private Question Arrays;

	public Board(Question[][]jeapordyBoard)
	{
		this.jeapordyBoard= jeapordyBoard;
	}
	
	public static Question[][] generateBoard()
	{
		jeapordyBoard= new Question[3][3];
		jeapordyBoard[0][0]= new ArrayQuestions(200, "Can an array have multiple data types?", "No");
		jeapordyBoard[0][1]= new StringQuestions(200, "If String x='Hello', what will x.substring(2) return?","llo");
		jeapordyBoard[0][2]= new LogicQuestions(200, "What will 'return (true)||(false)' return?", "true");
		jeapordyBoard[1][0]= new ArrayQuestions(400, "int[] data = {0, 3, 7, 9, 12, 14};\r\n" + 
				" \r\n" + 
				"     System.out.println( data[ data[1] ] );"
				+ "\n What will get printed out?", "9");
		jeapordyBoard[1][1]= new StringQuestions(400, "If String y='I miss President Obama', what will y.substring(7).substring(17) return?","Obama");
		jeapordyBoard[1][2]= new LogicQuestions(400, "int guessIt = (int) (Math.random * 60) + 5;\r\n" + 
				"\r\n" + 
				"What is the lowest value that guessIt can contain after the line of code is executed?", "5");
		jeapordyBoard[2][0]= new ArrayQuestions(800, "Are arrays passed by value or reference?", "value");
		jeapordyBoard[2][1]= new StringQuestions(800, "If String x=Hello, what will x.substring(2) return?","llo");
		jeapordyBoard[2][2]= new LogicQuestions(800, "int num =1;\r\n" + 
				"while(num < 10)\r\n" + 
				"{\r\n" + 
				"   if(num > 7)\r\n" + 
				"	System.out.print(\"**\");\r\n" + 
				"   System.out.print(\"*\")\r\n" + 
				"   num = num + 1;		\r\n" + 
				"}\r\n" + 
				"System.out.println();\r\n" + 
				"\r\n" + 
				"How many times will \"*\" be printed?", "13");
		return jeapordyBoard;
		
	}
	public static void printBoard(Question[][] jeapordyBoard)
	{
		String[]categories= {"Arrays","Strings","Logic"};
		for(int i=0;i<categories.length;i++)
		{
			System.out.print("["+categories[i]+"]");
		}
		System.out.println();
		
		int row;
		int col;		
		for(row=0;row<jeapordyBoard.length;row++)
		{
			for(col=0;col<jeapordyBoard[row].length;col++)
			{
				System.out.print("  ["+jeapordyBoard[row][col].pointValue+"]  ");
			}
			
			System.out.println();
		}
	}

}
