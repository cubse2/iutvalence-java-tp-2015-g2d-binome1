package fr.iutvalence.adem.pusher.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import fr.iutvalence.adem.pusher.model.element.Character;
import fr.iutvalence.adem.pusher.model.element.Crate;
import fr.iutvalence.adem.pusher.model.element.Element;
import fr.iutvalence.adem.pusher.model.element.EndPoint;
import fr.iutvalence.adem.pusher.model.element.Floor;
import fr.iutvalence.adem.pusher.model.element.Wall;

/**
 * The generator of level in the game.
 * @author anthony lafont | adem gurbuz
 */
public class Level
{
	/** Default number of line. */
	private static final int NUMBER_LINE_DEFAULT = 10;
	/** Default number of column. */
	private static final int NUMBER_COLUMN_DEFAULT = 10;
	
	/**
	 * levelNumber of the level.
	 */
	private int levelNumber;
	/**
	 * board generated.
	 */
	private Element[][] levelGenerated;
	/**
	 * Position of the character.
	 */
	private Position PosiCharacter;
	/**
	 * collection of endPoints
	 */
	private Set<Position> listEndPoint;
	
	/**
	 * The constructor
	 * @param level
	 * @throws IOException
	 */
	public Level(int level) throws IOException{
		this.levelNumber = level;
		this.listEndPoint = new HashSet<Position>();
		this.levelGenerated = generateLevel();
	}
	
	/**
	 * Generate the board, the character position and the list of endPoint
	 * @return
	 * @throws IOException
	 */
	private Element[][] generateLevel() throws IOException{
		File fileLevel = new File("level/Level"+levelNumber);
		FileReader fileReader = new FileReader(fileLevel);
		fileReader.read();
		int symbol;
		
		final Element[][] level = new Element[NUMBER_LINE_DEFAULT][NUMBER_COLUMN_DEFAULT];
		Position posi = new Position(0,0);
		while ((symbol = fileReader.read()) != -1)
		{
			switch (symbol){
				case 48:
					level[posi.getPosiX()][posi.getPosiY()]=new Wall();
					posi = incrementPosition(posi);
					break;
				case 49:
					level[posi.getPosiX()][posi.getPosiY()]=new Floor();
					posi = incrementPosition(posi);
					break;
				case 50:
					level[posi.getPosiX()][posi.getPosiY()]=new EndPoint();
					this.listEndPoint.add(posi);
					posi = incrementPosition(posi);
					break;
				case 51:
					level[posi.getPosiX()][posi.getPosiY()]=new Crate();
					posi = incrementPosition(posi);
					break;
				case 52:
					level[posi.getPosiX()][posi.getPosiY()]=new Character();
					this.PosiCharacter = posi;
					posi = incrementPosition(posi);
					break;
				case 53:
					level[posi.getPosiX()][posi.getPosiY()]=new Crate();
					this.listEndPoint.add(posi);
					posi = incrementPosition(posi);
					break;
			}
		}
		fileReader.close(); 		
		return level;
	}
	
	/**
	 * Increment the position for the next element
	 * @param posi
	 * @return fin
	 */
	private Position incrementPosition(Position posi)
	{
		Position newPosi = new Position(0,0);
		newPosi.setPosiY(posi.getPosiY());
		newPosi.setPosiX(posi.getPosiX()+1);
		if (newPosi.getPosiX()==NUMBER_LINE_DEFAULT)
		{
			newPosi.setPosiX(0);
			newPosi.setPosiY(posi.getPosiY()+1);
		}
		return newPosi;
	}

	/**
	 * get the board of the level generated
	 * @return levelGenerated
	 */
	public Element[][] getLevelGenerated()
	{
		return levelGenerated;
	}

	/**
	 * get the start position of the character
	 * @return
	 */
	public Position getPosiCharacter()
	{
		return PosiCharacter;
	}

	/**
	 * get the list of end points
	 * @return
	 */
	public Set<Position> getListEndPoint()
	{
		return listEndPoint;
	}
}
