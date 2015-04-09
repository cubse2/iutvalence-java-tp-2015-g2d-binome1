package fr.iutvalence.adem.pusher;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * 
 */
public class Game extends KeyAdapter {
    private Board board;

    public Game() {
        this.board = new Board();
        System.out.println(this.board.toString());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_Z) {
            System.out.println("coucou");
        }
    }

    /* TODO JAVADOC. */
    public void start() {}
}
