package board;
/**
 * A simple class to generate and create Board functions.
 * @author Justin Fagan
 * @date November 2017
 */
import question.Question;
import question.StringQuestions;
import question.ArrayQuestions;
import question.LogicQuestions;

public class Board {
	

	private static Question[][] jeopardyBoard;

	public Board(Question[][]jeopardyBoard)
	{
		this.jeopardyBoard= jeopardyBoard;
	}
	/**
	 * Only called once in the initial game to generate the Jeopardy board.
	 * @return the game board that the player will be using 
	 */
	public static Question[][] generateBoard()
	{
		jeopardyBoard= new Question[3][3];
		jeopardyBoard[0][0]= new ArrayQuestions(200, "Can an array have multiple data types?", "No");
		jeopardyBoard[0][1]= new StringQuestions(200, "If String x='Hello', what will x.substring(2) return?","llo");
		jeopardyBoard[0][2]= new LogicQuestions(200, "What will 'return (true)||(false)' return?", "true");
		jeopardyBoard[1][0]= new ArrayQuestions(400, "int[] data = {0, 3, 7, 9, 12, 14};\r\n" + 
				" \r\n" + 
				"     System.out.println( data[ data[1] ] );"
				+ "\n What will get printed out?", "9");
		jeopardyBoard[1][1]= new StringQuestions(400, "If String y='I miss President Obama', what will y.substring(7).substring(17) return?","Obama");
		jeopardyBoard[1][2]= new LogicQuestions(400, "int guessIt = (int) (Math.random * 60) + 5;\r\n" + 
				"\r\n" + 
				"What is the lowest value that guessIt can contain after the line of code is executed?", "5");
		jeopardyBoard[2][0]= new ArrayQuestions(800, "Are arrays passed by value or reference?", "value");
		jeopardyBoard[2][1]= new StringQuestions(800, "If String z='Hello World', what will x.indexOf('World') return?","6");
		jeopardyBoard[2][2]= new LogicQuestions(800, "int num =1;\r\n" + 
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
		return jeopardyBoard;
		
	}
	/**
	 * Displays the board to help keep track of which questions the player answered and can answer.
	 * @return void
	 */
	public static void printBoard(Question[][] jeopardyBoard)
	{
		String[]categories= {"Arrays","Strings","Logic"};
		for(int i=0;i<categories.length;i++)
		{
			System.out.print("["+categories[i]+"]");
		}
		System.out.println();
		
		int row;
		int col;		
		for(row=0;row<jeopardyBoard.length;row++)
		{
			for(col=0;col<jeopardyBoard[row].length;col++)
			{
				System.out.print("  ["+jeopardyBoard[row][col].pointValue+"]  ");
			}
			
			System.out.println();
		}
	}

}
