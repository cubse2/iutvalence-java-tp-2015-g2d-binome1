package fr.iutvalence.adem.pusher.model;

/**
 * Enumeration of different possible movement in the game.
 * @author anthony lafont | adem gurbuz
 */
public enum Movement {

	UP(-1, 0), DOWN(1, 0), LEFT(0, -1), RIGHT(0, 1);

	/**
	 * The number of case of the move on X.
	 */
	private int DeltaX;
	/**
	 * The number of case of the move on Y.
	 */
	private int DeltaY;

	/**
	 * The constructor.
	 */
	private Movement(int DeltaX, int DeltaY)
	{
		this.DeltaX = DeltaX;
		this.DeltaY = DeltaY;
	}

	/**
	 * Get DeltaX.
	 */
	public int getDeltaX()
	{
		return DeltaX;
	}

	/**
	 * Get DeltaY.
	 */
	public int getDeltaY()
	{
		return DeltaY;
	}

}
