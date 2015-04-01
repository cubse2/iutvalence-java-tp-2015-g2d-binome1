package fr.iutvalence.groupe1.pusher;

/* TODO JAVADOC. */
public class Board {
    /* TODO Visibilité ? Pourquoi public ? */
    /** Nombre de lignes par défaut. */
    public static final int NUMBER_LINE_DEFAULT   = 10;
    /** Nombre de colonnes par défaut. */
    public static final int NUMBER_COLUMN_DEFAULT = 10;
    /* TODO Final ? */
    /** Représentation du plateau. */
    private Case[][] board;

    /** Construction d'un plateau utilisant la taille par défaut. */
    public Board() {
        this.board = new Case[NUMBER_LINE_DEFAULT][NUMBER_COLUMN_DEFAULT];
        for (int i = 0; i < NUMBER_LINE_DEFAULT; i++) {
            for (int j = 0; j < NUMBER_COLUMN_DEFAULT; j++) {
                /* TODO À simplifier par une ternaire (pour voir). */
                /* TODO Sortir le test dans une méthode privée. */
                if (i > 1 && i <= 7 && j > 1 && j <= 7) {
                    this.board[i][j] = new Case(i, j, new Floor());
                }
                else {
                    this.board[i][j] = new Case(i, j, new Wall());
                }

            }
        }
    }

    @Override
    public String toString() {
        /* TODO String vs StringBuffer vs StringBuilder. */
        String result = " ";
        for (int i = 0; i < NUMBER_LINE_DEFAULT; i++) {
            for (int j = 0; j < NUMBER_LINE_DEFAULT; j++) {
                /* TODO Est-ce que ce test devrait être là ? */
                if (this.board[i][j].getElement().isSurmountable()) {
                    result = result + "   ";
                }
                else {
                    result = result + " X ";
                }
            }
            result = result + " \n ";
        }
        return result;
    }
}
