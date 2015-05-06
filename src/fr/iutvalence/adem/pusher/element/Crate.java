package fr.iutvalence.adem.pusher.element;

/**
 * crate class
 * @author anthony lafont | adem gurbuz
 */
public class Crate extends Element {
	
	/**
     * crate is not surmountable
     */
    private static final boolean IS_SURMOUNTABLE = false;

    /**
     * The constructor
     */
    public Crate() {
        super(IS_SURMOUNTABLE);
    }
    
    /**
     * String representation of crates
     */
    @Override
    public String toString(){
    	return " X ";
    }
}
