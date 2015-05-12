package fr.iutvalence.adem.pusher;

import java.io.IOException;
import java.util.Scanner;

/**
 * Represent a game
 * @author anthony lafont | adem gurbuz
 */
public class Game
{
	/**
	 * The board
	 */
	private Board board;

	/**
	 * The constructor
	 * @throws IOException 
	 */
	public Game() throws IOException
	{
		this.board = new Board(1);
	}

	/**
	 * Start a game
	 */
	public void start()
	{
		System.out.println(this.board);
		Scanner sc = new Scanner(System.in);
		while (!board.isWon())
		{
			System.out.println("Move ? : ");
			String mv = sc.nextLine();
			switch (mv)
			{
			case "z":
				this.board.move(Movement.UP);
				break;
			case "q":
				this.board.move(Movement.LEFT);
				break;
			case "s":
				this.board.move(Movement.DOWN);
				break;
			case "d":
				this.board.move(Movement.RIGHT);
				break;
			}
			System.out.println(this.board);
		}
		System.out.println("Congratulation !!!");
	}
}
