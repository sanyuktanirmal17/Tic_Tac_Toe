import java.util.*;
public class TicTacToe {

	public static char [] board = new char [10];
	public static void main(String args[])
	{
		createBoard();
		
	}
	public static void createBoard() {
		for(int i=1; i< board.length; i++)
			board[i]= ' ';
	}
}

	
