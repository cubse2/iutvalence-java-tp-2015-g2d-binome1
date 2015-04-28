package fr.iutvalence.adem.pusher;

import java.util.Set;

import fr.iutvalence.adem.pusher.element.Character;
import fr.iutvalence.adem.pusher.element.Element;
import fr.iutvalence.adem.pusher.element.EndPoint;
import fr.iutvalence.adem.pusher.element.Floor;
import fr.iutvalence.adem.pusher.element.Wall;

/* TODO JAVADOC. */
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
		this.board = generateBoard();
	}

	/* TODO JAVADOC. */
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
		return board;
	}

	/**
	 * Get the element on the position X and Y.
	 * 
	 * @param posX
	 * @param posY
	 * @return Element
	 */
	public Element getElement(int posX, int posY)
	{
		return board[posX][posY];
	}

	/**
	 * Move the character on the board.
	 * 
	 * @param move
	 */
	public void move(Movement move)
	{
		int newPosiY = this.PosiCharacter.getPosiY() + move.getDeltaY();
		int newPosiX = this.PosiCharacter.getPosiX() + move.getDeltaX();

		if (this.getElement(newPosiX, newPosiY).isSurmountable())
		{
			if (this.getElement(newPosiX, newPosiY).isEndPoint())
			{
				
			}
			board[this.PosiCharacter.getPosiX()][this.PosiCharacter.getPosiY()] = new Floor();
			this.PosiCharacter.setPosiY(newPosiY);
			this.PosiCharacter.setPosiX(newPosiX);
			board[this.PosiCharacter.getPosiX()][this.PosiCharacter.getPosiY()] = new Character();
		}
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
