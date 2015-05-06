package fr.iutvalence.adem.pusher;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import fr.iutvalence.adem.pusher.element.Character;
import fr.iutvalence.adem.pusher.element.Crate;
import fr.iutvalence.adem.pusher.element.Element;
import fr.iutvalence.adem.pusher.element.EndPoint;
import fr.iutvalence.adem.pusher.element.Floor;
import fr.iutvalence.adem.pusher.element.Wall;

/**
 * The board class
 * @author anthony lafont | adem gurbuz
 */
public class Board
{
	/** Default number of line. */
	private static final int NUMBER_LINE_DEFAULT = 10;
	/** Default number of column. */
	private static final int NUMBER_COLUMN_DEFAULT = 10;
	/** The position of the character. */
	private Position PosiCharacter;
	/** List of the end point */
	private Set<Position> listEndPoint;
	/** The board of element. */
	private final Element[][] board;

	/** Constructor of the board with defaults size. */
	public Board()
	{
		this.listEndPoint = new HashSet<Position>();
		this.board = generateBoard();
		
	}

	/**
	 * Generate the board of the game
	 * @return board
	 */
	private Element[][] generateBoard()
	{
		final Element[][] board = new Element[NUMBER_LINE_DEFAULT][NUMBER_COLUMN_DEFAULT];
		for (int i = 0; i < NUMBER_LINE_DEFAULT; i++)
		{
			for (int j = 0; j < NUMBER_COLUMN_DEFAULT; j++)
			{
				board[i][j] = ((i > 1) && (i <= 7) && (j > 1) && (j <= 7)) ? new Floor()
						: new Wall();
			}
		}
		board[5][5] = new Character();
		PosiCharacter = new Position(5, 5);
		board[6][6] = new EndPoint();
		Position posiEndPoint = new Position(6,6);
		listEndPoint.add(posiEndPoint);
		board[4][3] = new Crate();
		return board;
	}

	/**
	 * Get the element on the position X and Y.
	 * 
	 * @param posX
	 * @param posY
	 * @return Element
	 */
	public Element getElement(Position pos)
	{
		return this.board[pos.getPosiX()][pos.getPosiY()];
	}
	
	/**
	 * Move the character on the board.
	 * 
	 * @param move
	 */
	public void move(Movement move)
	{
		Position newPosi = new Position(this.PosiCharacter.getPosiX() + move.getDeltaX(), 
				this.PosiCharacter.getPosiY() + move.getDeltaY());

		if (this.getElement(newPosi).isSurmountable())
		{
			moveCharacter(newPosi);
		}
		else
		{
			Position newPosiCrate = new Position(newPosi.getPosiX() + move.getDeltaX(), 
					newPosi.getPosiY() + move.getDeltaY());
			if (this.getElement(newPosiCrate).isSurmountable())
			{
				moveCrate(newPosiCrate);
				moveCharacter(newPosi);
			}
		}
		printEndPoint();
	}
	
	/**
	 * Print endPoint after each move of the character.
	 */
	private void printEndPoint()
	{
		System.out.println("Liste des endpoints :");
		for (Position position : listEndPoint) {
			System.out.println(position);
		}
	}

	/**
	 * Move the character.
	 * @param newPosi
	 */
	private void moveCharacter(Position newPosi)
	{
		this.board[this.PosiCharacter.getPosiX()][this.PosiCharacter.getPosiY()] = new Floor();
		this.PosiCharacter.setPosiY(newPosi.getPosiY());
		this.PosiCharacter.setPosiX(newPosi.getPosiX());
		this.board[this.PosiCharacter.getPosiX()][this.PosiCharacter.getPosiY()] = new Character();
	}
	
	/**
	 * move the Crate, push by the character.
	 * @param newPosiCrate
	 */
	private void moveCrate(Position newPosiCrate)
	{
		this.board[newPosiCrate.getPosiX()][newPosiCrate.getPosiY()] = new Crate();
	}

	@Override
	public String toString()
	{
		final StringBuilder result = new StringBuilder(310);
		for (int i = 0; i < NUMBER_LINE_DEFAULT; i++)
		{
			for (int j = 0; j < NUMBER_LINE_DEFAULT; j++)
			{
				result.append(board[i][j]);
			}
			result.append("\n");
		}
		return result.toString();
	}
}
