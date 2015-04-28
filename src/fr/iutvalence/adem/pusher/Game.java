package fr.iutvalence.adem.pusher;

import java.util.Scanner;

/* TODO JAVADOC. */
public class Game
{
	/* TODO JAVADOC. */
	private Board board;

	/* TODO JAVADOC. */
	public Game()
	{
		this.board = new Board();
		System.out.println(this.board);
		/* TODO This should not be here. We will discuss it later. */
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			/* TODO Translate. */
			System.out.println("Bougez vous !!! : ");
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

	/* TODO JAVADOC. */
	public void start()
	{
	}
}
