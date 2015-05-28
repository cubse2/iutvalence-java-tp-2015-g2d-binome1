package fr.iutvalence.adem.pusher.model;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import fr.iutvalence.adem.pusher.model.element.Character;
import fr.iutvalence.adem.pusher.model.element.Crate;
import fr.iutvalence.adem.pusher.model.element.Element;
import fr.iutvalence.adem.pusher.model.element.EndPoint;
import fr.iutvalence.adem.pusher.model.element.Floor;
import fr.iutvalence.adem.pusher.model.element.Wall;

/**
 * The board class
 * @author anthony lafont | adem gurbuz
 */
public class Board
{
	/** The position of the character. */
	private Position PosiCharacter;
	/** List of the end point */
	private Set<Position> listEndPoint;
	/** The board of element. */
	private final Element[][] board;

	/** Constructor of the board with defaults size. 
	 * @throws IOException 
	*/
	public Board(int levelNumber) throws IOException
	{
		Level level = new Level(levelNumber);
		this.board = level.getLevelGenerated();
		this.listEndPoint = level.getListEndPoint();
		this.PosiCharacter = level.getPosiCharacter();
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
		else if(this.getElement(newPosi).isCrate())
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
		for (Position position : listEndPoint) {
			if (!this.getElement(position).isCharacter() && !this.getElement(position).isCrate()){
				board[position.getPosiX()][position.getPosiY()] = new EndPoint();
			}
		}
	}
	
	public boolean isWon()
	{
		for (Position position : listEndPoint) {
			if (!this.getElement(position).isCrate()){
				return false;
			}
		}
		return true;
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

	public Element[][] getBoard()
	{
		return board;
	}

	@Override
	public String toString()
	{
		final StringBuilder result = new StringBuilder(310);
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board.length; j++)
			{
				
				result.append(board[i][j]);
			}
			result.append("\n");
		}
		return result.toString();
	}
}
