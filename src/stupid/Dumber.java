package stupid;

public class Dumber extends Dumb
{
	public Dumber()
	{
		super(8);
	}
	
	
	public int getBlerg()
	{
		return super.getBlerg() + 7;
	}

}