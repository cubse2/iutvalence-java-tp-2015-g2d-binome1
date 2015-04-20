package fr.iutvalence.adem.pusher;

import java.util.Scanner;


/* TODO JAVADOC. */
public class Game {
    /* TODO JAVADOC. */
    private Board board;

    /* TODO JAVADOC. */
    public Game() {
        this.board = new Board();
        System.out.println(this.board.toString());
        Scanner sc = new Scanner(System.in);
        
        while(true){
	
	        System.out.println("Bougez vous !!! : ");
	        String  mv = sc.nextLine();
	        
	        this.board.move(mv);
	        this.board.checkEndPoint();
	        System.out.println(this.board.toString());
	        
        }
    }


    /* TODO JAVADOC. */
    public void start() {}
}
