package fr.iutvalence.adem.pusher.model.element;

/**
 * wall on the board.
 * @author anthony lafont | adem gurbuz
 */
public class Wall extends Element {
	
	/**
     * wall is not surmountable
     */
    private static final boolean IS_UNSURMOUNTABLE = false;

    /**
     * The constructor
     */
    public Wall() {
        super(IS_UNSURMOUNTABLE);
    }

    /**
     * String representation of walls
     */
    @Override
    public String toString() {
        return " # ";
    }
}
