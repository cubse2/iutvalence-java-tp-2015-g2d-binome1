package fr.iutvalence.adem.pusher;

public class Position
{
	private int posiX;
	private int posiY;

	public Position(int posiX, int posiY)
	{
		this.posiX = posiX;
		this.posiY = posiY;
	}

	public int getPosiX()
	{
		return posiX;
	}

	public int getPosiY()
	{
		return posiY;
	}

	public void setPosiX(int posiX)
	{
		this.posiX = posiX;
	}

	public void setPosiY(int posiY)
	{
		this.posiY = posiY;
	}

}
