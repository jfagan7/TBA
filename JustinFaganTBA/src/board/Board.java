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
import question.ObjectQuestions;

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
		jeopardyBoard= new Question[4][4];
		jeopardyBoard[0][0]= new ArrayQuestions(200, "Can an array have multiple data types?", "No");
		jeopardyBoard[0][1]= new StringQuestions(200, "If String x='Hello', what will x.substring(2) return?","llo");
		jeopardyBoard[0][2]= new LogicQuestions(200, "What will 'return (true)||(false)' return?", "true");
		jeopardyBoard[0][3]= new ObjectQuestions(200, "What word do you need to declare an object", "new");
		jeopardyBoard[1][0]= new ArrayQuestions(400, "int[] data = {0, 3, 7, 9, 12, 14};\r\n" + 
				" \r\n" + 
				"     System.out.println( data[ data[1] ] );"
				+ "\n What will get printed out?", "9");
		jeopardyBoard[1][1]= new StringQuestions(400, "If String y='I miss President Obama', what will y.substring(7).substring(17) return?","Obama");
		jeopardyBoard[1][2]= new LogicQuestions(400, "int guessIt = (int) (Math.random * 60) + 5;\r\n" + 
				"\r\n" + 
				"What is the lowest value that guessIt can contain after the line of code is executed?", "5");
		jeopardyBoard[1][3]= new ObjectQuestions(400, "What does OOP stand for", "Object Oriented Programming");
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
		jeopardyBoard[2][3]= new ObjectQuestions(800, "Interfaces must have methods that are____", "implemented");
		jeopardyBoard[3][0]= new ArrayQuestions(1600,"What is the output of: public class Test{\r\n" + 
				"        public static void main(String[] args){\r\n" + 
				"                int[] a = new int[0];\r\n" + 
				"                System.out.print(a.length);\r\n" + 
				"        }\r\n" + 
				"}","0");
		jeopardyBoard[3][1]= new StringQuestions(1600,"What will:public class Test{\r\n" + 
				"        public static void main(String args[]){\r\n" + 
				"		String s1 = \"java\";\r\n" + 
				"		String s2 = \"java\";\r\n" + 
				"		System.out.println(s1.equals(s2));\r\n" + 
				"		System.out.println(s1 == s2); \r\n" + 
				"        }\r\n" + 
				"} return","true true");
		jeopardyBoard[3][2]= new LogicQuestions(1600,"Can we give a call to non-static method from a static method?","No");
		jeopardyBoard[3][3]= new ObjectQuestions(1600,"	\r\n" + 
				"class ClassOne\r\n" + 
				"{\r\n" + 
				"    String s;\r\n" + 
				" \r\n" + 
				"    {\r\n" + 
				"        s = \"FIRST\";\r\n" + 
				"    }\r\n" + 
				" \r\n" + 
				"    {\r\n" + 
				"        s = \"SECOND\";\r\n" + 
				"    }\r\n" + 
				" \r\n" + 
				"    public ClassOne()\r\n" + 
				"    {\r\n" + 
				"        s = \"THIRD\";\r\n" + 
				"    }\r\n" + 
				" \r\n" + 
				"    public ClassOne(String s)\r\n" + 
				"    {\r\n" + 
				"        this();\r\n" + 
				" \r\n" + 
				"        System.out.println(this.s);\r\n" + 
				"    }\r\n" + 
				"}\r\n" + 
				" \r\n" + 
				"public class ClassTwo\r\n" + 
				"{\r\n" + 
				"    public static void main(String[] args)\r\n" + 
				"    {\r\n" + 
				"        ClassOne one = new ClassOne(\"LAST\");\r\n" + 
				"    }\r\n" + 
				"}","THIRD");
		return jeopardyBoard;
		
	}
	/**
	 * Displays the board to help keep track of which questions the player answered and can answer.
	 * @return void
	 */
	public static void printBoard(Question[][] jeopardyBoard)
	{
		String[]categories= {"Arrays","Strings","Logic", "Objects"};
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
				System.out.print(" ["+jeopardyBoard[row][col].pointValue+"]  ");
			}
			
			System.out.println();
		}
	}

}
