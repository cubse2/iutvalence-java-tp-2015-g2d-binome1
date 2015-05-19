package fr.iutvalence.adem.pusher.model.element;

/**
 * Element on the board
 * @author anthony lafont | adem gurbuz
 */
public abstract class Element
{
	/**
	 * if the element is surmountable or not.
	 */
	private final boolean surmountable;

	/** the constructor. */
	protected Element(boolean smt)
	{
		this.surmountable = smt;
	}

	/**
	 * return if the element is surmountable
	 * @return surmountable
	 */
	public final boolean isSurmountable()
	{
		return surmountable;
	}

	/**
	 * return if the element is a character
	 * @return boolean
	 */
	public boolean isCharacter()
	{
		return false;
	}

	/**
	 * return if the element is an endPoint
	 * @return boolean
	 */
	public boolean isEndPoint()
	{
		return false;
	}
	
	/**
	 * return if the element is a crate
	 * @return boolean
	 */
	public boolean isCrate()
	{
		return false;
	}
}
