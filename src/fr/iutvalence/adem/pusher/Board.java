package fr.iutvalence.adem.pusher;

import fr.iutvalence.adem.pusher.element.Character;
import fr.iutvalence.adem.pusher.element.Element;
import fr.iutvalence.adem.pusher.element.EndPoint;
import fr.iutvalence.adem.pusher.element.Floor;
import fr.iutvalence.adem.pusher.element.Wall;

/* TODO JAVADOC. */
public class Board {
    /** Default number of line. */
    private static final int NUMBER_LINE_DEFAULT   = 10;
    /** Default number of column. */
    private static final int NUMBER_COLUMN_DEFAULT = 10;
    /** The board of element. */
    private final Element[][] board;
    /** The X position of the character. */
    private static int PosiXCharacter;
	/** The Y position of the character. */
    private static int PosiYCharacter;
    /***/
    private static int[][] listEndPoint = new int[5][2]; 
    /** Getter of the variable PosiXCharacter. */ 
    public int getPosiXCharacter() {
		return PosiXCharacter;
	}
    /** Getter of the variable PosiYCharacter. */
	public int getPosiYCharacter() {
		return PosiYCharacter;
	}


    /* TODO Translate. */

    /** Construction d'un plateau utilisant la taille par défaut. */
    public Board() {
    	this.board = generateBoard();
    }

    
    
    public void move(String mv){
    	switch(mv){
    		case "z":
    			board[PosiXCharacter][PosiYCharacter] = new Floor();
    			PosiXCharacter--; 
    			board[PosiXCharacter][PosiYCharacter] = new Character();
    			break;
    			
    		case "s":
    			board[PosiXCharacter][PosiYCharacter] = new Floor();
    			PosiXCharacter++; 
    			board[PosiXCharacter][PosiYCharacter] = new Character();
    			break;
    			
    		case "d":
    			board[PosiXCharacter][PosiYCharacter] = new Floor();
    			PosiYCharacter++; 
    			board[PosiXCharacter][PosiYCharacter] = new Character();
    			break;
    			
    		case "q":
    			board[PosiXCharacter][PosiYCharacter] = new Floor();
    			PosiYCharacter--; 
    			board[PosiXCharacter][PosiYCharacter] = new Character();
    			break;
    	}
    		 
    }
    
    
    
    
    /* TODO JAVADOC. */
    private static Element[][] generateBoard() {
        final Element[][] board = new Element[NUMBER_LINE_DEFAULT][NUMBER_COLUMN_DEFAULT];
        for (int i = 0; i < NUMBER_LINE_DEFAULT; i++) {
            for (int j = 0; j < NUMBER_COLUMN_DEFAULT; j++) {
                board[i][j] = ((i > 1) && (i <= 7) && (j > 1) && (j <= 7)) ? new Floor() : new Wall();
                if ((i == 5) && (j == 5)) {
                    board[i][j] = new Character();
                    PosiXCharacter = i;
                	PosiYCharacter = j;
                }
                if ((i == 6) && (j == 6)) {
                	board[i][j] = new EndPoint();
                	listEndPoint[0][0]=i;
                	listEndPoint[0][1]=j;
                }
            }
        }
        return board;
    }
    
    
    public void checkEndPoint(){
    	for(int x=0; x<5; x++){

			if ((board[listEndPoint[x][0]][listEndPoint[x][1]] instanceof Character) || (listEndPoint[x][0] == 0 && listEndPoint[x][1] == 0)){
				
			}
			else{
				board[listEndPoint[x][0]][listEndPoint[x][1]] = new EndPoint();
			}
    			
    		
    	}
    }
    

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder(" ");
        for (int i = 0; i < NUMBER_LINE_DEFAULT; i++) {
            for (int j = 0; j < NUMBER_LINE_DEFAULT; j++) {
                result.append(board[i][j]);
            }
            result.append(" \n ");
        }
        return result.toString();
    }
    
    public Element getElement(int posX, int posY){
    	return board[posX][posY];
    }
}
