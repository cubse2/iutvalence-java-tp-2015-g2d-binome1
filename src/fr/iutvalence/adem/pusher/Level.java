package fr.iutvalence.adem.pusher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import fr.iutvalence.adem.pusher.element.Character;
import fr.iutvalence.adem.pusher.element.Crate;
import fr.iutvalence.adem.pusher.element.Element;
import fr.iutvalence.adem.pusher.element.EndPoint;
import fr.iutvalence.adem.pusher.element.Floor;
import fr.iutvalence.adem.pusher.element.Wall;

/**
 * The differents level in the game.
 * @author anthony lafont | adem gurbuz
 */
public class Level
{
	/** Default number of line. */
	private static final int NUMBER_LINE_DEFAULT = 10;
	/** Default number of column. */
	private static final int NUMBER_COLUMN_DEFAULT = 10;
	
	
	private int levelNumber;
	private Element[][] levelGenerated;
	private Position PosiCharacter;
	private Set<Position> listEndPoint;
	
	public Level(int level) throws IOException{
		this.levelNumber = level;
		this.listEndPoint = new HashSet<Position>();
		this.levelGenerated = generateLevel();
	}
	
	public Element[][] generateLevel() throws IOException{
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
	
	private Position incrementPosition(Position posi)
	{
		Position fin = new Position(0,0);
		fin.setPosiY(posi.getPosiY());
		fin.setPosiX(posi.getPosiX()+1);
		if (fin.getPosiX()==NUMBER_LINE_DEFAULT)
		{
			fin.setPosiX(0);
			fin.setPosiY(posi.getPosiY()+1);
		}
		return fin;
	}

	public Element[][] getLevelGenerated()
	{
		return levelGenerated;
	}

	public Position getPosiCharacter()
	{
		return PosiCharacter;
	}

	public Set<Position> getListEndPoint()
	{
		return listEndPoint;
	}
}
