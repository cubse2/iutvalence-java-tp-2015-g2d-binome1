package fr.iutvalence.adem.pusher.element;

/**
 * Floor of the board.
 * @author anthony lafont | adem gurbuz
 */
public class Floor extends Element {

	/**
     * The floor is surmountable
     */
    private static final boolean IS_SURMOUNTABLE = true;

    /**
     * The constructor
     */
    public Floor() {
        super(IS_SURMOUNTABLE);
    }

    /**
     * String representation of the floor
     */
    @Override
    public String toString() {
        return "   ";
    }
}
