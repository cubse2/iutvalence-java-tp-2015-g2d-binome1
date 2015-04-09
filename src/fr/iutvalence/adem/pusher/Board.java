package fr.iutvalence.adem.pusher;

import fr.iutvalence.adem.pusher.element.Element;
import fr.iutvalence.adem.pusher.element.Floor;
import fr.iutvalence.adem.pusher.element.Wall;
import fr.iutvalence.groupe1.pusher.element.Character;

/* TODO JAVADOC. */
public class Board {
	
    /** Nombre de lignes par défaut. */
    private static final int NUMBER_LINE_DEFAULT   = 10;
    /** Nombre de colonnes par défaut. */
    private static final int NUMBER_COLUMN_DEFAULT = 10;
    /** Représentation du plateau. */
    private final Element[][] board;

    /** Construction d'un plateau utilisant la taille par défaut. */
    public Board() {
        this.board = generateBoard();
    }

    /** TODO JAVADOC. */
    private static Element[][] generateBoard() {
        final Element[][] board = new Element[NUMBER_LINE_DEFAULT][NUMBER_COLUMN_DEFAULT];
        for (int i = 0; i < NUMBER_LINE_DEFAULT; i++) {
            for (int j = 0; j < NUMBER_COLUMN_DEFAULT; j++) {
                if (i > 1 && i <= 7 && j > 1 && j <= 7) {
                    board[i][j] = new Floor();
                }
                else {
                    board[i][j] = new Wall();
                }
                if (i==5 && j==5){
                	board[i][j] = new Character();
                }
                
            }
        }
        return board;
    }
    
    @Override
    public String toString() {

    	StringBuilder result = new StringBuilder(" ");
        for (int i = 0; i < NUMBER_LINE_DEFAULT; i++) {
            for (int j = 0; j < NUMBER_LINE_DEFAULT; j++) {
            	result.append(this.board[i][j].toString());
            }
            result.append(" \n ");
        }
        return result.toString();
    }
}
