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
	for(int i=0;i<jeapordyBoard.length;i++)
	{
		for(int j=0;j<jeapordyBoard[j].length;j++)
		{
			jeapordyBoard[i][j]=Arrays(200,false,false,["what color is the sky?", "hi"]);
		}
	}
	}
	
/*	public Question[][] generateBoard()
	{
		Question[][]jBoard= new Question[3][3];
		
	}*/
}
