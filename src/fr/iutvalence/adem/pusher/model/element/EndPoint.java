package fr.iutvalence.adem.pusher.model.element;

/**
 * EndPoint representation on the board.
 * @author anthony lafont | adem gurbuz
 */
public class EndPoint extends Floor {
    
	/**
     * String representation of end points
     */
    @Override
    public String toString() {
        return " ¤ ";
    }
    
    /**
     * The end point is an end point
     */
    public boolean isEndPoint(){
		return true;
	}
}
