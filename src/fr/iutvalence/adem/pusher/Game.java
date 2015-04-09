package fr.iutvalence.adem.pusher;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * 
 */
public class Game implements KeyListener {
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

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    /* TODO JAVADOC. */
    public void start() {}
}
