package board;

import question.Question;
import question.ArrayQuestions;

public class Board {
	

	private Question[][] jeapordyBoard;
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
	
	public Question[][] generateBoard()
	{
		jeapordyBoard= new Question[3][3];
		jeapordyBoard[0][0]= new ArrayQuestions(200, false,"Question: Can an array have multiple data types?","No");
		return jeapordyBoard;
		
	}

}
