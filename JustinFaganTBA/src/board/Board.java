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
/*		int[][]jeapordyBoard = {
		{100,100,100},
		{500,500,500},
		{1000,1000,1000}
		};
		
*/	
	}
	
	public static Question[][] generateBoard()
	{
		jeapordyBoard= new Question[3][3];
		jeapordyBoard[0][0]= new ArrayQuestions(200, "Question: Can an array have multiple data types?","No");
		jeapordyBoard[0][1]= new StringQuestions(200, "Question: If String x=Hello, what will x.substring(2) return?","llo");
		jeapordyBoard[0][2]= new LogicQuestions(200, "Question: What will 'return (true)||(false)' return?", "true");
		return jeapordyBoard;
		
	}

}
