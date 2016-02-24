
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

	public int getKilometrazStanice( String nS )
	{
		int poradi = this.getPoradiStanice( nS );

		if( poradi == -1 )
		{
			return -1;
		}

		return this.kilometrazStanic[ poradi ];
	}

	public int getPocetStanic()
	{
		return this.nazvyStanic.length;
	}
}
