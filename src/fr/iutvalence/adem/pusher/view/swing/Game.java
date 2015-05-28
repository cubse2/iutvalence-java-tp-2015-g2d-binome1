package fr.iutvalence.adem.pusher.view.swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Scanner;

import fr.iutvalence.adem.pusher.model.*;

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
	private int level;
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
		this.level = lvlNumber;
	}
	
	/**
	 * The player is playing
	 * @throws WrongMoveException 
	 */
	public void play()
	{
		Interface mainFrame = new Interface(this.level);
		mainFrame.actualise(board);
		
		while (!board.isWon())
		{
			switch (mainFrame.getKey().getKeyChar())
			{
			case 'z':
				this.board.move(Movement.UP);
				break;
			case 'q':
				this.board.move(Movement.LEFT);
				break;
			case 's':
				this.board.move(Movement.DOWN);
				break;
			case 'd':
				this.board.move(Movement.RIGHT);
				break;
			}
			mainFrame.actualise(board);
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
