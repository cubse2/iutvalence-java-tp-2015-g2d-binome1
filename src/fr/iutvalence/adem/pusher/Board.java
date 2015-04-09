package fr.iutvalence.adem.pusher;

import fr.iutvalence.adem.pusher.element.Character;
import fr.iutvalence.adem.pusher.element.Element;
import fr.iutvalence.adem.pusher.element.Floor;
import fr.iutvalence.adem.pusher.element.Wall;

/* TODO JAVADOC. */
public class Board {
    /* TODO Translate. */
    /** Nombre de lignes par défaut. */
    private static final int NUMBER_LINE_DEFAULT   = 10;
    /* TODO Translate. */
    /** Nombre de colonnes par défaut. */
    private static final int NUMBER_COLUMN_DEFAULT = 10;
    /* TODO Translate. */
    /** Représentation du plateau. */
    private final Element[][] board;

    /* TODO Translate. */

    /** Construction d'un plateau utilisant la taille par défaut. */
    public Board() {
        this.board = generateBoard();
    }

    /* TODO JAVADOC. */
    private static Element[][] generateBoard() {
        final Element[][] board = new Element[NUMBER_LINE_DEFAULT][NUMBER_COLUMN_DEFAULT];
        for (int i = 0; i < NUMBER_LINE_DEFAULT; i++) {
            for (int j = 0; j < NUMBER_COLUMN_DEFAULT; j++) {
                board[i][j] = ((i > 1) && (i <= 7) && (j > 1) && (j <= 7)) ? new Floor() : new Wall();
                if ((i == 5) && (j == 5)) {
                    board[i][j] = new Character();
                }
            }
        }
        return board;
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
}
