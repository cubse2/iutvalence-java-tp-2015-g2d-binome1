package fr.iutvalence.adem.pusher;

/**
 * position of an element.
 * @author anthony lafont | adem gurbuz
 */
public class Position
{
	/**
	 * x position.
	 */
	private int posiX;
	/**
	 * y position.
	 */
	private int posiY;

	/**
	 * The constructor.
	 * @param posiX
	 * @param posiY
	 */
	public Position(int posiX, int posiY)
	{
		this.posiX = posiX;
		this.posiY = posiY;
	}

	/**
	 * Get the x position.
	 * @return posiX
	 */
	public int getPosiX()
	{
		return posiX;
	}

	/**
	 * Get the y position.
	 * @return posiY
	 */
	public int getPosiY()
	{
		return posiY;
	}

	/**
	 * Set the x position.
	 */
	public void setPosiX(int posiX)
	{
		this.posiX = posiX;
	}

	/**
	 * Set the y position.
	 */
	public void setPosiY(int posiY)
	{
		this.posiY = posiY;
	}

	public String toString() {
		return String.format("(%d,%d)", posiX, posiY);
	}
}
