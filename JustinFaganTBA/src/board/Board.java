package board;

import question.Question;
import question.Arrays;

public class Board {
	

	private Question[][] jeapordyBoard;
	private Question Arrays;

	public Board(Question[][]jeapordyBoard)
	{
		this.jeapordyBoard= new Question[3][3];
/*		int[][]jeapordyBoard = {
		{100,100,100},
		{500,500,500},
		{1000,1000,1000}
		};
		
*/	
	jeapordyBoard[0][0]= Arrays(200,false,false,);
	}
	
/*	public Question[][] generateBoard()
	{
		Question[][]jBoard= new Question[3][3];
		
	}*/
}
