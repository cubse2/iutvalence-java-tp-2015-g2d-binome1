package fr.iutvalence.adem.pusher.view.swing;

import java.io.IOException;
import java.util.Scanner;
import fr.iutvalence.adem.pusher.model.*;

/**
 * Represent a game
 * @author anthony lafont | adem gurbuz
 */
public class Game
{
	private int lvlMax;
	/**
	 * The board
	 */
	private Board board;

	/**
	 * The constructor
	 * @throws IOException 
	 */
	public Game(int lvlNumber, int lvlMax) throws IOException, LevelNumberException
	{
		if (lvlNumber > lvlMax){
			throw new LevelNumberException("Level not available!");
		}
		this.board = new Board(lvlNumber);
	}
	
	/**
	 * The player is playing
	 * @throws WrongMoveException 
	 */
	public void play()
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
		this.victory();
	}
	
	/**
	 * When the player win.
	 */
	private void victory(){
		System.out.println("Congratulation !!!");
	}
}
