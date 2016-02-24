
public class Trasa
{
	private String[] nazvyStanic;
	private int[] kilometrazStanic;

	public Trasa( String[] nS, int[] kS )
	{
		this.nazvyStanic = nS;
		this.kilometrazStanic = kS;
	}

	public int getPoradiStanice( String nS )
	{
		for( int i = 0; i < this.nazvyStanic.length; i++ )
		{
			if( this.nazvyStanic[ i ] == nS )
			{
				return i;
			}
		}

		return -1;
	}
}
