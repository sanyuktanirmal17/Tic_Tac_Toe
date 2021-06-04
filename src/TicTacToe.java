import java.util.*;
public class TicTacToe {

	public static char [] board = new char [10];
	
	public static void createBoard() {
		for(int i=1; i< board.length; i++)
			board[i]= ' ';
	}
	
	public static void choosePlay(int player)
	{
		char character;
		if (player == 1) {
		      character = 'X';
		    } else {
		      character = 'O';
		    }
		}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int player;
		createBoard();
		System.out.println("game created");
		choosePlay(0);
		System.out.println("Enter character 'X' and 'O'");
		}
	 }
	

	
