package fr.iutvalence.adem.pusher;

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
	 */
	public Game()
	{
		this.board = new Board();
		System.out.println(this.board);
		/* TODO This should not be here. We will discuss it later. */
		Scanner sc = new Scanner(System.in);
		while (true)
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
	}

	/**
	 * Start a game
	 */
	public void start()
	{
		
	}
}
