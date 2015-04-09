package fr.iutvalence.adem.pusher;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/* TODO JAVADOC. */
public class Game extends KeyAdapter {
    /* TODO JAVADOC. */
    private Board board;

    /* TODO JAVADOC. */
    public Game() {
        this.board = new Board();
        System.out.println(this.board.toString());
    }

    @Override
    public void keyPressed(final KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_Z) {
            System.out.println("coucou");
        }
    }

    /* TODO JAVADOC. */
    public void start() {}
}
